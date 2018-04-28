"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var router_1 = require("@angular/router");
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
var AddProdC_component_1 = require("./user/Seller/AddProdC.component");
var Stat_component_1 = require("./user/Admin/Stat.component");
var AddColla_component_1 = require("./user/Seller/AddColla.component");
var ShowProdsO_component_1 = require("./user/Seller/ShowProdsO.component");
var ShowProdsC_component_1 = require("./user/Seller/ShowProdsC.component");
var EditO_component_1 = require("./user/Seller/EditO.component");
var EditC_component_1 = require("./user/Seller/EditC.component");
var DeleteO_component_1 = require("./user/Seller/DeleteO.component");
var DeleteC_component_1 = require("./user/Seller/DeleteC.component");
var History_component_1 = require("./user/Seller/History.component");
var AppRoute = [
    { path: 'buyerRegister', component: BuyerRegister_component_1.BuyerRegisterComponent },
    { path: 'buyerLogin', component: BuyerLogin_component_1.BuyerLoginComponent },
    { path: 'sellerRegister', component: SellerRegister_component_1.SellerRegisterComponent },
    { path: 'sellerLogin', component: SellerLogin_component_1.SellerLoginComponent },
    { path: 'adminLogin', component: AdminLogin_component_1.AdminLoginComponent },
    { path: 'adminHome', component: AdminHome_component_1.AdminHomeComponent },
    { path: 'buyerHome/:name', component: BuyerHome_component_1.BuyerHomeComponent },
    { path: 'sellerHome/:name', component: SellerHome_component_1.SellerHomeComponent },
    { path: 'SysProd', component: SysProd_component_1.SysProdComponent },
    { path: 'Brand', component: Brand_component_1.BrandComponent },
    { path: 'AddStore/:name', component: AddStore_component_1.AddStoreComponent },
    { path: 'AddProd/:name/:st', component: AddProd_component_1.AddProdComponent },
    { path: 'AddProdc/:name/:st', component: AddProdC_component_1.AddProdCComponent },
    { path: 'AddColla/:name/:st', component: AddColla_component_1.AddCollaComponent },
    { path: 'EditO/:name/:st', component: EditO_component_1.EditOComponent },
    { path: 'EditC/:pname/:st/:cname', component: EditC_component_1.EditCComponent },
    { path: 'DeleteO/:name/:st', component: DeleteO_component_1.DeleteOComponent },
    { path: 'DeleteC/:pname/:st/:cname', component: DeleteC_component_1.DeleteCComponent },
    { path: 'ShowProdsO/:st', component: ShowProdsO_component_1.ShowProdsOComponent },
    { path: 'ShowProdsC/:st/:cname', component: ShowProdsC_component_1.ShowProdsCComponent },
    { path: 'history/:name', component: History_component_1.HistoryComponent },
    { path: 'Stat', component: Stat_component_1.ShowStatComponent }
];
exports.routers = router_1.RouterModule.forRoot(AppRoute);
//# sourceMappingURL=app.routing.js.map