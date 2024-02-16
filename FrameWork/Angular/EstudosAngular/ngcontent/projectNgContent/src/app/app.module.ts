import { HttpClient, HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { InterceptInterceptor } from './service/intercept.interceptor';
@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
  ],
  providers: [

  {
    provide: HTTP_INTERCEPTORS,
    useClass: InterceptInterceptor,
    multi: true
  }

  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
