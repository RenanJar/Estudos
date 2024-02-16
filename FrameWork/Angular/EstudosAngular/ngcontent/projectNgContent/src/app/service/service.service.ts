import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import { Observable } from 'rxjs';
import { Episode } from '../model/Episode';
import { EpisodeList } from '../model/EpisodeList';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {
  private url= "https://rickandmortyapi.com/api/episode"

  constructor(private httpClient: HttpClient) { 
  }

  getAllEpisodios(): Observable<EpisodeList>{
    return this.httpClient.get<EpisodeList>(this.url);
  }
}
