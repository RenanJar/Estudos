import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { ModuleEpisodeRoutingModule } from './module-episode-routing.module';
import { ComponenteTesteComponent } from './componente-teste/componente-teste.component';
import { CardComponent } from 'src/app/card/card.component';
import { AcordionComponent } from 'src/app/card/acordion/acordion.component';
import { AppRoutingModule } from 'src/app/app-routing.module';


@NgModule({
  declarations: [
    ComponenteTesteComponent,
    CardComponent,
    AcordionComponent
  ],
  imports: [
    CommonModule,
    HttpClientModule,
    ModuleEpisodeRoutingModule
  ],
  exports:[
    CardComponent
  ]
})
export class ModuleEpisodeModule {
}
