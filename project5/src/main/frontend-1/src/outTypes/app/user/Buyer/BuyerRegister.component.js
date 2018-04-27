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
var BuyerRegisterComponent = /** @class */ (function () {
    function BuyerRegisterComponent(_userservice, _route) {
        this._userservice = _userservice;
        this._route = _route;
        // this.user=this._userservice.getter();
    }
    BuyerRegisterComponent.prototype.processForm = function (value1, value2) {
        var _this = this;
        console.log("buyer Register");
        console.log(value1);
        console.log(value2);
        this._userservice.BuyRegister(value1, value2).subscribe(function (user) {
            console.log(user);
            if (user == true) {
                console.log("added");
                _this._route.navigate(['/buyerHome/' + value1]);
            }
            else {
                console.log("l2 sorry");
                _this._route.navigate(['/buyerRegister']);
            }
        });
    };
    BuyerRegisterComponent = __decorate([
        core_1.Component({
            selector: 'buyer-Register',
            templateUrl: 'template/Form.html',
            providers: [buyer_service_1.BuyerService]
        }),
        __metadata("design:paramtypes", [buyer_service_1.BuyerService, router_1.Router])
    ], BuyerRegisterComponent);
    return BuyerRegisterComponent;
}());
exports.BuyerRegisterComponent = BuyerRegisterComponent;
//# sourceMappingURL=BuyerRegister.component.js.map