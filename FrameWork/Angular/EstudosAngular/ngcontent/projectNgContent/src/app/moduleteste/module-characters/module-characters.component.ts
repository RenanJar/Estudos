import { Component, OnInit } from '@angular/core';
import { Postagem } from 'src/app/model/Postagem';
import { UserServiceService } from 'src/app/service/authenticationService/user-service.service';
import { environment } from 'src/environments/environment';

@Component({
  selector: 'app-module-characters',
  templateUrl: './module-characters.component.html',
  styleUrls: ['./module-characters.component.css']
})
export class ModuleCharactersComponent implements OnInit {

  listPostagem : Postagem[] = [];

  postagemt: any;

  constructor(private userService:UserServiceService) { 
    
  }

  ngOnInit(): void {

  }

  listarTodos(){
    return this.userService.getAll().subscribe((resp: Postagem[])=>{

      this.listPostagem = resp;
      console.log("objetos listados")
      
    })
  }

  postarTeste(postagem: Postagem){
    postagem = this.listPostagem[3]
    postagem.titulo= "teste"
    console.log(environment.token)

    this.userService.postPostagem(postagem).subscribe((resp: Postagem)=>{
      console.log(resp)
      console.log("postagem realizada")
    })
    
  }

}
