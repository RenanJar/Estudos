import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ModuleCharactersComponent } from './module-characters.component';

const routes: Routes = [{ path: '', component: ModuleCharactersComponent }];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ModuleCharactersRoutingModule { }
