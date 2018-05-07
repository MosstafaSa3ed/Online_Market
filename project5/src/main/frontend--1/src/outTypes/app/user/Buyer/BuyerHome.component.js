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
var BuyerHomeComponent = /** @class */ (function () {
    function BuyerHomeComponent(_userservice, _route, route) {
        this._userservice = _userservice;
        this._route = _route;
        this.route = route;
    }
    BuyerHomeComponent.prototype.ngOnInit = function () {
        var _this = this;
        this.name = this.route.snapshot.params['name'];
        this._userservice.getprods().subscribe(function (prods) { _this.prods = prods; });
    };
    BuyerHomeComponent.prototype.Add = function (v1, v2) {
        var _this = this;
        console.log(v1);
        this._userservice.buy(this.prods[v1 - 1].name, v2, this.prods[v1 - 1].storeName, this.name).subscribe(function (user) {
            console.log(user);
            if (user == -1) {
                console.log("l2aaaaa" + _this.prods[v1 - 1].storeName);
                _this._route.navigate(['/buyerHome/' + _this.name]);
            }
            else {
                console.log("l product b2a bta3k ya zmele " + _this.prods[v1 - 1].storeName);
                _this._route.navigate(['/buyerHome/' + _this.name]);
            }
        });
    };
    BuyerHomeComponent = __decorate([
        core_1.Component({
            selector: 'buyer-home',
            templateUrl: 'template/BuyerHome.html',
            providers: [buyer_service_1.BuyerService]
        }),
        __metadata("design:paramtypes", [buyer_service_1.BuyerService, router_1.Router, router_2.ActivatedRoute])
    ], BuyerHomeComponent);
    return BuyerHomeComponent;
}());
exports.BuyerHomeComponent = BuyerHomeComponent;
//# sourceMappingURL=BuyerHome.component.js.map