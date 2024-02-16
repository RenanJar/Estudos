import { Component, OnInit } from '@angular/core';
import { FormControl } from '@angular/forms';
import { CardAPIService } from 'src/app/service/CardAPIService';
import { Modal } from 'bootstrap';
import { CardDTO } from 'src/app/dto/CardDTO';


@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit{
  constructor(private cardAPIService:CardAPIService){}
  
  ngOnInit(): void {
    
  }

  isLoading:boolean = false;

  isClick:boolean = false;

  cardfound:CardDTO[]=[];
  cardsNotFound:String[]=[];

  formCardInput= new FormControl();

  selection(event:any){
    const idbutton = (event.target as HTMLButtonElement).id
    this.isClick = !this.isClick
    console.log(this.isClick);
  }

  onSubmit(){
    this.isLoading = true;
    this.abrirModal();
     const cardmodif=this.formatListCards(this.formCardInput.value)
    console.log(cardmodif)
    this.cardAPIService.postCardList(cardmodif).subscribe(resposta =>{
      this.cardfound = resposta.objectsFound;
      this.cardsNotFound = resposta.objectsNotFound
      this.loadingTrue();
        
    });
    
    
  }

  loadingTrue(){
    this.isLoading=!this.isLoading;
  }

  abrirModal(): void {
    const modalElement = document.getElementById('modalCardList')?? '';
    const modal = new Modal(modalElement);
    modal.show();
  }

  formatListCards(stringNotFormated:String):String[]{
  
    const listOfCards:String[] = stringNotFormated.split(";")
    const stringFormated:String[]= [];

    listOfCards.forEach(function(card){
      if(card=== ''){
      }else{
        stringFormated.push(card.trim())
      }
    });
    

    return stringFormated;
  }

 


}
