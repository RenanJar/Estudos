import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  //{ path: '',
  //  component: ComponenteTesteComponent},
  { path: 'charactersRoute', loadChildren: () => import('./moduleteste/module-characters/module-characters.module').then(m => m.ModuleCharactersModule) }, 
  { path: 'episodeRoute', loadChildren: () => import('./moduleteste/module-episode/module-episode.module').then(m => m.ModuleEpisodeModule) },
  {
    path: '',
    redirectTo: '/episodeRoute',
    pathMatch: 'full'
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
