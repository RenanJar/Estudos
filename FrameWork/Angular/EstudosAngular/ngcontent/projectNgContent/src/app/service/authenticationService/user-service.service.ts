import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { usuarioLogin } from 'src/app/model/usuarioLogin';
import { catchError, map, Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Postagem } from 'src/app/model/Postagem';

@Injectable({
  providedIn: 'root'
})
export class UserServiceService {

  constructor(
    private http: HttpClient
  ) { }


  public entrar(usuarioLogin:usuarioLogin): Observable<usuarioLogin | void >{
    
    const url = `${environment.baseUrl}/logar`
  
    return this.http.post<usuarioLogin>(url,usuarioLogin).pipe(map((data)=> this.setTokenLocalStorage(data)),
    catchError((err)=>{
      this.removerTokenLocalStorage();
      throw 'falha ao efetuar login'
    })
    ) 

  };

  public getAll():Observable<Postagem[]>{
    return this.http.get<Postagem[]>('https://blogpspring.herokuapp.com/postagens')
  }

  public postPostagem(postagem: Postagem):Observable<Postagem>{
    return this.http.post<Postagem>('https://blogpspring.herokuapp.com/postagens',postagem)
  }

  public getToken():string | null{
    return localStorage.getItem(environment.token);
  }

  public setTokenLocalStorage(respose: usuarioLogin){
    localStorage.setItem(environment.token, respose.token)
  }

  public removerTokenLocalStorage():void{
    localStorage.removeItem(environment.token)
  }

  public tokenIsValid():boolean{
    return localStorage.getItem(environment.token) === null;
  }
  
}
