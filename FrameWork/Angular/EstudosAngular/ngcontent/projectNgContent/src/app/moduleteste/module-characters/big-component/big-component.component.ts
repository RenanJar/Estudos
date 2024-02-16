import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { usuarioLogin } from 'src/app/model/usuarioLogin';
import { UserServiceService } from 'src/app/service/authenticationService/user-service.service';
import { environment } from 'src/environments/environment';

@Component({
  selector: 'app-big-component',
  templateUrl: './big-component.component.html',
  styleUrls: ['./big-component.component.css']
})
export class BigComponentComponent implements OnInit {

  loginUsuarioForm!: FormGroup;
  

  constructor(private userService:UserServiceService,
      private userFormBuilder:FormBuilder,) {

        this.loginUsuarioForm = this.createFormLogin();

      }

  ngOnInit(): void {
    
  }

  createFormLogin():FormGroup{
    return this.userFormBuilder.group({
      usuario:['',[Validators.required,Validators.email]],
      senha:['',[Validators.required,Validators.minLength(8)]]
    })
  }
  

  //private logar(usuario:usuarioLogin){
    ///this.userService.entrar(usuario)
  //}

  public isFormControlInvalid(controlName: string):boolean{
    return !!(this.loginUsuarioForm.get(controlName)?.invalid 
    && this.loginUsuarioForm.get(controlName)?.touched)
  }

  public submitForm(){

    this.userService.entrar(this.loginUsuarioForm.value).subscribe(
      response=>{
        console.log('login efetuado')
      },
      err => {
        console.log('usuario ou senha invalidos')
      }
    )

    this.loginUsuarioForm.reset();
  }

  public tokenIsValid():boolean{
    return this.userService.tokenIsValid();
  }

  public logout(){
    this.userService.removerTokenLocalStorage();
  }
  

}
