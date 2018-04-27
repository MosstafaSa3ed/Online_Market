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
var buyer_service_1 = require("../../services/buyer.service");
var router_1 = require("@angular/router");
var SysProdComponent = /** @class */ (function () {
    function SysProdComponent(_userservice, _route) {
        this._userservice = _userservice;
        this._route = _route;
    }
    SysProdComponent.prototype.AddSysProd = function (name, brand, Lp, Hp) {
        var _this = this;
        this._userservice.SysProd(name, brand, Lp, Hp).subscribe(function (user) {
            console.log(user);
            if (user == true) {
                console.log("tmaaam");
                _this._route.navigate(['/SysProd']);
            }
            else {
                console.log("Ezay bt-add product mlo4 brand ya 7ywana");
                _this._route.navigate(['/SysProd']);
            }
        });
    };
    SysProdComponent = __decorate([
        core_1.Component({
            selector: 'sys-prod',
            templateUrl: 'template/AddSysProd.html',
            providers: [buyer_service_1.BuyerService]
        }),
        __metadata("design:paramtypes", [buyer_service_1.BuyerService, router_1.Router])
    ], SysProdComponent);
    return SysProdComponent;
}());
exports.SysProdComponent = SysProdComponent;
//# sourceMappingURL=SysProd.component.js.map