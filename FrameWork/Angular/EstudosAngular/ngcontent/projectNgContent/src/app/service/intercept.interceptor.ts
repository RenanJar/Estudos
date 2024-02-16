import { Injectable } from '@angular/core';
import {
  HttpRequest,
  HttpHandler,
  HttpEvent,
  HttpInterceptor
} from '@angular/common/http';
import { Observable } from 'rxjs';
import { UserServiceService } from './authenticationService/user-service.service';
import { environment } from 'src/environments/environment';
import { Token } from '@angular/compiler';

@Injectable()
export class InterceptInterceptor implements HttpInterceptor {

  constructor( private userService: UserServiceService) {}

  intercept(request: HttpRequest<unknown>, next: HttpHandler): Observable<HttpEvent<unknown>> {
    
    const token = this.userService.getToken;
    
    if(token !== null){


      const authRequest = request.clone({setHeaders:{'Authorization' : `${environment.token}`}})

      return next.handle(authRequest);


    }

    return next.handle(request);
  }
}
