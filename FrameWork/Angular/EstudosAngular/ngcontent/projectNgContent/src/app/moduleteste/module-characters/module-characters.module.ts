import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ModuleCharactersRoutingModule } from './module-characters-routing.module';
import { ModuleCharactersComponent } from './module-characters.component';
import { BigComponentComponent } from './big-component/big-component.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { CardComponent } from 'src/app/card/card.component';
import { ModuleEpisodeModule } from '../module-episode/module-episode.module';


@NgModule({
  declarations: [
    ModuleCharactersComponent,
    BigComponentComponent,
  ],
  imports: [
    CommonModule,
    ModuleCharactersRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    ModuleEpisodeModule
  ]
})
export class ModuleCharactersModule { }
