import { ModuleWithProviders } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import {BuyerRegisterComponent} from './user/BuyerRegister.component';
import { AppComponent }  from './app.component';

const AppRoute: Routes=[
    {
        path:'',
        component:AppComponent
    },
    {
        path:'register',
        component:BuyerRegisterComponent
    }
];
 export const routers:ModuleWithProviders=RouterModule.forRoot(AppRoute);