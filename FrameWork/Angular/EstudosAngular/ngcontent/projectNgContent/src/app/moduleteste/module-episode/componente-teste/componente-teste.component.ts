import { Component, OnInit, Output } from '@angular/core';
import { Episode } from 'src/app/model/Episode';
import { ServiceService } from 'src/app/service/service.service';


@Component({
  selector: 'app-componente-teste',
  templateUrl: './componente-teste.component.html',
  styleUrls: ['./componente-teste.component.css']
})
export class ComponenteTesteComponent implements OnInit {
  listEpisodios: Episode[] = [];
  @Output() output: Episode[] = this.listEpisodios;

  constructor(private service: ServiceService) { }

  ngOnInit(): void {
  }

  getAllEpisodios(){

    this.service.getAllEpisodios().subscribe((resp)=> {
      this.listEpisodios = resp.results;
    });

  }

}
