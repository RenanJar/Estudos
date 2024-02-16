import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ModuleCharactersComponent } from '../module-characters/module-characters.component';
import { ComponenteTesteComponent } from './componente-teste/componente-teste.component';

const routes: Routes = [
  { path: '', component: ComponenteTesteComponent },
  { path:'', component: ModuleCharactersComponent }];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ModuleEpisodeRoutingModule { }
