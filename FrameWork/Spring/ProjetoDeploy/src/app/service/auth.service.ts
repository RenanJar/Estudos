import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment.prod';
import { Usuario } from '../model/Usuario';
import { UsuarioLogin } from '../model/UsuarioLogin';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  constructor(
    private http: HttpClient
  ) { }

  cadastrar(usuario: Usuario): Observable<Usuario>{
    return this.http.post<Usuario>('https://projetoeatit.herokuapp.com/usuarios/cadastrar',usuario)

  }

  entrar(usuarioLogin: UsuarioLogin): Observable<UsuarioLogin>{
    return this.http.post<UsuarioLogin>('https://projetoeatit.herokuapp.com/usuarios/logar',usuarioLogin)
  }

  getByIdUsuario(id: number): Observable<Usuario>{
    return this.http.get<Usuario>(`https://projetoeatit.herokuapp.com/usuarios/${id}`)
  }

  logado(){
    let ok: boolean = false
    if(environment.token != '' ){
      ok = true
    }
    return ok
  }
}
