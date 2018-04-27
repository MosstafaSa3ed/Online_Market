"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
Object.defineProperty(exports, "__esModule", { value: true });
var core_1 = require("@angular/core");
var router_1 = require("@angular/router");
var router_2 = require("@angular/router");
var buyer_service_1 = require("../../services/buyer.service");
var SellerHomeComponent = /** @class */ (function () {
    function SellerHomeComponent(_userservice, _route, route) {
        this._userservice = _userservice;
        this._route = _route;
        this.route = route;
    }
    SellerHomeComponent.prototype.ngOnInit = function () {
        var _this = this;
        this.name = this.route.snapshot.params['name'];
        this._userservice.getStores(this.name).subscribe(function (stores) { _this.stores = stores; });
        this._userservice.getcollas(this.name).subscribe(function (storesColla) { _this.storesColla = storesColla; });
    };
    SellerHomeComponent.prototype.Add1 = function () {
        this._route.navigate(['/AddStore/' + this.name]);
    };
    SellerHomeComponent.prototype.Add2 = function (st) {
        this._route.navigate(['/AddProd/' + this.name + '/' + st]);
    };
    SellerHomeComponent.prototype.Add3 = function (st) {
        this._route.navigate(['/AddColla/' + this.name + '/' + st]);
    };
    SellerHomeComponent.prototype.Add4 = function (st) {
        this._route.navigate(['/ShowProdsO/' + st]);
    };
    SellerHomeComponent.prototype.Add5 = function (st) {
        this._route.navigate(['/AddProdc/' + this.name + '/' + st]);
    };
    SellerHomeComponent.prototype.Add6 = function (st) {
        this._route.navigate(['/ShowProdsC/' + st + '/' + this.name]);
    };
    SellerHomeComponent.prototype.Add7 = function () {
        this._route.navigate(['/history/' + this.name]);
    };
    SellerHomeComponent.prototype.Add8 = function () {
        this._route.navigate(['/buyerHome/' + this.name]);
    };
    SellerHomeComponent = __decorate([
        core_1.Component({
            selector: 'seller-home',
            templateUrl: 'template/SellerHome.html',
            providers: [buyer_service_1.BuyerService]
        }),
        __metadata("design:paramtypes", [buyer_service_1.BuyerService, router_1.Router, router_2.ActivatedRoute])
    ], SellerHomeComponent);
    return SellerHomeComponent;
}());
exports.SellerHomeComponent = SellerHomeComponent;
//# sourceMappingURL=SellerHome.component.js.map