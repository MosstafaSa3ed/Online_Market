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
var http_1 = require("@angular/http");
var Observable_1 = require("rxjs/Observable");
require("rxjs/add/operator/map");
require("rxjs/add/operator/catch");
require("rxjs/add/observable/throw");
var BuyerService = /** @class */ (function () {
    function BuyerService(_http) {
        this._http = _http;
        this.headers = new http_1.Headers({ 'Content-Type': 'application/json' });
        this.options = new http_1.RequestOptions({ headers: this.headers });
    }
    BuyerService.prototype.setter = function (user) {
        this.user = user;
    };
    BuyerService.prototype.getter = function () {
        return this.user;
    };
    BuyerService.prototype.BuyRegister = function (v1, v2) {
        return this._http.post('http://localhost:8080/buyers/Bregister/' + v1 + '/' + v2, this.options)
            .map(function (response) { return response.json(); }).catch(this.errorHandler);
    };
    BuyerService.prototype.BuyLogin = function (email, pass) {
        return this._http.get('http://localhost:8080/buyers/login/' + email + '/' + pass, this.options).map(function (response) { return response.json(); }).catch(this.errorHandler);
    };
    BuyerService.prototype.SellRegister = function (v1, v2) {
        console.log(v1);
        console.log(v2);
        return this._http.post('http://localhost:8080/sellers/Sregister/' + v1 + '/' + v2, 
        /*{"email": v1,
        "password": v2}*/ this.options)
            .map(function (response) { return response.json(); }).catch(this.errorHandler);
    };
    BuyerService.prototype.SellLogin = function (email, pass) {
        return this._http.get('http://localhost:8080/sellers/login/' + email + '/' + pass, this.options).map(function (response) { return response.json(); }).catch(this.errorHandler);
    };
    BuyerService.prototype.AdmLogin = function (email, pass) {
        return this._http.get('http://localhost:8080/admin/login/' + email + '/' + pass, this.options).map(function (response) { return response.json(); }).catch(this.errorHandler);
    };
    BuyerService.prototype.SysProd = function (name, brand, Lp, Hp) {
        return this._http.post('http://localhost:8080/sysprod/add/' + name + '/' + brand + '/' + Lp + '/' + Hp, this.options).map(function (response) { return response.json(); }).catch(this.errorHandler);
    };
    BuyerService.prototype.Brand = function (name, des) {
        return this._http.post('http://localhost:8080/brand/add/' + name + '/' + des, this.options).map(function (response) { return response.json(); }).catch(this.errorHandler);
    };
    BuyerService.prototype.addStore = function (v1, n, v2, v3) {
        return this._http.post('http://localhost:8080/sellers/AddStore/' + v1 + '/' + n + '/' + v2 + '/' + v3, this.options).map(function (response) { return response.json(); }).catch(this.errorHandler);
    };
    BuyerService.prototype.addProd = function (v1, v2, v3, v4, v5) {
        return this._http.post('http://localhost:8080/sellers/AddProd/' + v1 + '/' + v2 + '/' + v3 + '/' + v4 + '/' + v5, this.options).map(function (response) { return response.json(); }).catch(this.errorHandler);
    };
    BuyerService.prototype.addProdc = function (v1, v2, v3, v4, v5, v6) {
        return this._http.post('http://localhost:8080/sellers/collaAdd/' + v1 + '/' + v2 + '/' + v3 + '/' + v4 + '/' + v5 + '/' + v6, this.options).map(function (response) { return response.json(); }).catch(this.errorHandler);
    };
    BuyerService.prototype.addColla = function (v1, v2, v3) {
        return this._http.post('http://localhost:8080/sellers/addColla/' + v1 + '/' + v2 + '/' + v3, this.options).map(function (response) { return response.json(); }).catch(this.errorHandler);
    };
    BuyerService.prototype.getStores = function (n) {
        return this._http.get('http://localhost:8080/sellers/list/' + n, this.options).map(function (response) { return response.json(); }).catch(this.errorHandler);
    };
    BuyerService.prototype.getcollas = function (n) {
        return this._http.get('http://localhost:8080/sellers/listColla/' + n, this.options).map(function (response) { return response.json(); }).catch(this.errorHandler);
    };
    BuyerService.prototype.getprods = function () {
        return this._http.get('http://localhost:8080/sellers/listProds', this.options).map(function (response) { return response.json(); }).catch(this.errorHandler);
    };
    BuyerService.prototype.showProds = function (n) {
        return this._http.get('http://localhost:8080/sellers/listInstore/' + n, this.options).map(function (response) { return response.json(); }).catch(this.errorHandler);
    };
    BuyerService.prototype.histo = function (n) {
        return this._http.get('http://localhost:8080/sellers/history/' + n, this.options).map(function (response) { return response.json(); }).catch(this.errorHandler);
    };
    BuyerService.prototype.buy = function (v1, v2, v3, v4) {
        return this._http.post('http://localhost:8080/sellers/buy/' + v1 + '/' + v2 + '/' + v3 + '/' + v4, this.options).map(function (response) { return response.json(); }).catch(this.errorHandler);
    };
    BuyerService.prototype.Psum = function () {
        return this._http.get('http://localhost:8080/admin/ProdStat/sum', this.options).map(function (response) { return response.json(); }).catch(this.errorHandler);
    };
    BuyerService.prototype.Pavg = function () {
        return this._http.get('http://localhost:8080/admin/ProdStat/avg', this.options).map(function (response) { return response.json(); }).catch(this.errorHandler);
    };
    BuyerService.prototype.Usum = function () {
        return this._http.get('http://localhost:8080/admin//userStat/sum', this.options).map(function (response) { return response.json(); }).catch(this.errorHandler);
    };
    BuyerService.prototype.Uavg = function () {
        return this._http.get('http://localhost:8080/admin//userStat/avg', this.options).map(function (response) { return response.json(); }).catch(this.errorHandler);
    };
    BuyerService.prototype.EditO = function (v1, v2, v3) {
        return this._http.get('http://localhost:8080/sellers/Edit/' + v1 + '/' + v2 + '/' + v3, this.options).map(function (response) { return response.json(); }).catch(this.errorHandler);
    };
    BuyerService.prototype.DeleteO = function (v1, v2, v3) {
        return this._http.get('http://localhost:8080/sellers/Delete/' + v1 + '/' + v2 + '/' + v3, this.options).map(function (response) { return response.json(); }).catch(this.errorHandler);
    };
    BuyerService.prototype.DeleteC = function (v1, v2, v3, v4) {
        return this._http.get('http://localhost:8080/sellers/collaDelete/' + v1 + '/' + v2 + '/' + v3 + '/' + v4, this.options).map(function (response) { return response.json(); }).catch(this.errorHandler);
    };
    BuyerService.prototype.EditC = function (v1, v2, v3, v4) {
        return this._http.get('http://localhost:8080/sellers/collaEdit/' + v1 + '/' + v2 + '/' + v3 + '/' + v4, this.options).map(function (response) { return response.json(); }).catch(this.errorHandler);
    };
    BuyerService.prototype.undo = function (v1, v2, v3, v4, v5, v6) {
        return this._http.get('http://localhost:8080/sellers/undo/' + v1 + '/' + v2 + '/' + v3 + '/' + v4 + '/' + v5 + '/' + v6, this.options).map(function (response) { return response.json(); }).catch(this.errorHandler);
    };
    BuyerService.prototype.errorHandler = function (error) {
        return Observable_1.Observable.throw(error || "SERVER ERROR");
    };
    BuyerService = __decorate([
        core_1.Injectable(),
        __metadata("design:paramtypes", [http_1.Http])
    ], BuyerService);
    return BuyerService;
}());
exports.BuyerService = BuyerService;
//# sourceMappingURL=buyer.service.js.map