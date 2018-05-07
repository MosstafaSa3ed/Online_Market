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
var buyer_service_1 = require("../../services/buyer.service");
var router_2 = require("@angular/router");
var AddProdComponent = /** @class */ (function () {
    function AddProdComponent(route, _userservice, _route) {
        this.route = route;
        this._userservice = _userservice;
        this._route = _route;
    }
    AddProdComponent.prototype.ngOnInit = function () {
        this.name = this.route.snapshot.params['name'];
        this.st = this.route.snapshot.params['st'];
    };
    AddProdComponent.prototype.Prod = function (v1, v3, v4, v5) {
        var _this = this;
        this._userservice.addProd(v1, this.st, v3, v4, v5).subscribe(function (user) {
            console.log(user);
            if (user == true) {
                console.log("tmaaam " + _this.st);
                _this._route.navigate(['/sellerHome/' + _this.name]);
            }
            else {
                console.log("howa 7aga mn l etnen .. ye ema mfe4 l brand da asln .. ya ema l product m4 mwgod fl sys");
                _this._route.navigate(['/AddProd/' + _this.name + '/' + _this.st]);
            }
        });
    };
    AddProdComponent = __decorate([
        core_1.Component({
            selector: 'add-prod',
            templateUrl: 'template/AddProd.html',
            providers: [buyer_service_1.BuyerService]
        }),
        __metadata("design:paramtypes", [router_1.ActivatedRoute, buyer_service_1.BuyerService, router_2.Router])
    ], AddProdComponent);
    return AddProdComponent;
}());
exports.AddProdComponent = AddProdComponent;
//# sourceMappingURL=AddProd.component.js.map