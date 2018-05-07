"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
Object.defineProperty(exports, "__esModule", { value: true });
var core_1 = require("@angular/core");
var platform_browser_1 = require("@angular/platform-browser");
var app_routing_1 = require("./app.routing");
var http_1 = require("@angular/http");
var app_component_1 = require("./app.component");
var forms_1 = require("@angular/forms");
var BuyerRegister_component_1 = require("./user/Buyer/BuyerRegister.component");
var BuyerLogin_component_1 = require("./user/Buyer/BuyerLogin.component");
var SellerRegister_component_1 = require("./user/Seller/SellerRegister.component");
var SellerLogin_component_1 = require("./user/Seller/SellerLogin.component");
var AdminLogin_component_1 = require("./user/Admin/AdminLogin.component");
var BuyerHome_component_1 = require("./user/Buyer/BuyerHome.component");
var SellerHome_component_1 = require("./user/Seller/SellerHome.component");
var AdminHome_component_1 = require("./user/Admin/AdminHome.component");
var SysProd_component_1 = require("./user/Admin/SysProd.component");
var Brand_component_1 = require("./user/Admin/Brand.component");
var AddStore_component_1 = require("./user/Seller/AddStore.component");
var AddProd_component_1 = require("./user/Seller/AddProd.component");
var Stat_component_1 = require("./user/Admin/Stat.component");
var AddColla_component_1 = require("./user/Seller/AddColla.component");
var ShowProdsO_component_1 = require("./user/Seller/ShowProdsO.component");
var ShowProdsC_component_1 = require("./user/Seller/ShowProdsC.component");
var EditO_component_1 = require("./user/Seller/EditO.component");
var EditC_component_1 = require("./user/Seller/EditC.component");
var DeleteO_component_1 = require("./user/Seller/DeleteO.component");
var DeleteC_component_1 = require("./user/Seller/DeleteC.component");
var AddProdC_component_1 = require("./user/Seller/AddProdC.component");
var History_component_1 = require("./user/Seller/History.component");
var AppModule = /** @class */ (function () {
    function AppModule() {
    }
    AppModule = __decorate([
        core_1.NgModule({
            imports: [platform_browser_1.BrowserModule, app_routing_1.routers, http_1.HttpModule, forms_1.FormsModule],
            declarations: [app_component_1.AppComponent, BuyerRegister_component_1.BuyerRegisterComponent, BuyerLogin_component_1.BuyerLoginComponent, SellerRegister_component_1.SellerRegisterComponent,
                SellerLogin_component_1.SellerLoginComponent, AdminLogin_component_1.AdminLoginComponent, BuyerHome_component_1.BuyerHomeComponent, SellerHome_component_1.SellerHomeComponent,
                AdminHome_component_1.AdminHomeComponent, SysProd_component_1.SysProdComponent, Brand_component_1.BrandComponent, AddStore_component_1.AddStoreComponent, AddProd_component_1.AddProdComponent,
                Stat_component_1.ShowStatComponent, AddColla_component_1.AddCollaComponent, ShowProdsO_component_1.ShowProdsOComponent, ShowProdsC_component_1.ShowProdsCComponent,
                EditO_component_1.EditOComponent, DeleteO_component_1.DeleteOComponent, DeleteC_component_1.DeleteCComponent, EditC_component_1.EditCComponent, AddProdC_component_1.AddProdCComponent,
                History_component_1.HistoryComponent],
            bootstrap: [app_component_1.AppComponent]
        })
    ], AppModule);
    return AppModule;
}());
exports.AppModule = AppModule;
//# sourceMappingURL=app.module.js.map