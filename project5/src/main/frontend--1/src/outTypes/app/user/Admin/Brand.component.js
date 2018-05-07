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
var BrandComponent = /** @class */ (function () {
    function BrandComponent(_userservice, _route) {
        this._userservice = _userservice;
        this._route = _route;
    }
    BrandComponent.prototype.AddBrand = function (name, des) {
        var _this = this;
        this._userservice.Brand(name, des).subscribe(function (user) {
            console.log(user);
            if (user == true) {
                console.log("tmaaam");
                _this._route.navigate(['/adminHome']);
            }
            else {
                console.log("l brand mwgod asln ya bhayeem ya bhayeeem");
                _this._route.navigate(['/Brand']);
            }
        });
    };
    BrandComponent = __decorate([
        core_1.Component({
            selector: 'add-brand',
            templateUrl: 'template/Brand.html',
            providers: [buyer_service_1.BuyerService]
        }),
        __metadata("design:paramtypes", [buyer_service_1.BuyerService, router_1.Router])
    ], BrandComponent);
    return BrandComponent;
}());
exports.BrandComponent = BrandComponent;
//# sourceMappingURL=Brand.component.js.map