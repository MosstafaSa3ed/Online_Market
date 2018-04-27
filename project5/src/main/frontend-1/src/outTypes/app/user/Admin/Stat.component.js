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
var router_2 = require("@angular/router");
var ShowStatComponent = /** @class */ (function () {
    function ShowStatComponent(_userservice, _route, route) {
        this._userservice = _userservice;
        this._route = _route;
        this.route = route;
    }
    ShowStatComponent.prototype.ngOnInit = function () {
        var _this = this;
        this._userservice.Psum().subscribe(function (ProdSum) { _this.ProdSum = ProdSum; });
        this._userservice.Pavg().subscribe(function (ProdAvg) { _this.ProdAvg = ProdAvg; });
        this._userservice.Usum().subscribe(function (UserSum) { _this.UserSum = UserSum; });
        this._userservice.Uavg().subscribe(function (UserAvg) { _this.UserAvg = UserAvg; });
    };
    ShowStatComponent = __decorate([
        core_1.Component({
            selector: 'show-stat',
            templateUrl: 'template/stat.html',
            providers: [buyer_service_1.BuyerService]
        }),
        __metadata("design:paramtypes", [buyer_service_1.BuyerService, router_1.Router, router_2.ActivatedRoute])
    ], ShowStatComponent);
    return ShowStatComponent;
}());
exports.ShowStatComponent = ShowStatComponent;
//# sourceMappingURL=Stat.component.js.map