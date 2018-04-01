import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {routers } from './app.routing';
import { AppComponent }  from './app.component';
import {BuyerRegisterComponent} from './user/BuyerRegister.component';

@NgModule({
  imports:      [ BrowserModule ,routers],
  declarations: [ AppComponent ,BuyerRegisterComponent],
  bootstrap:    [ AppComponent ]
})
export class AppModule { }
