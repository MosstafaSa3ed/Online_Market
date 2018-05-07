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
var ShowProdsOComponent = /** @class */ (function () {
    function ShowProdsOComponent(route, _userservice, _route) {
        this.route = route;
        this._userservice = _userservice;
        this._route = _route;
    }
    ShowProdsOComponent.prototype.ngOnInit = function () {
        var _this = this;
        this.st = this.route.snapshot.params['st'];
        this._userservice.showProds(this.st).subscribe(function (prods) { _this.prods = prods; });
    };
    ShowProdsOComponent.prototype.Add2 = function (id) {
        this._route.navigate(['/EditO/' + this.prods[id - 1].name + '/' + this.prods[id - 1].storeName]);
    };
    ShowProdsOComponent.prototype.Add3 = function (id) {
        this._route.navigate(['/DeleteO/' + this.prods[id - 1].name + '/' + this.prods[id - 1].storeName]);
    };
    ShowProdsOComponent = __decorate([
        core_1.Component({
            selector: 'show-prods',
            templateUrl: 'template/ShowProds1.html',
            providers: [buyer_service_1.BuyerService]
        }),
        __metadata("design:paramtypes", [router_1.ActivatedRoute, buyer_service_1.BuyerService, router_2.Router])
    ], ShowProdsOComponent);
    return ShowProdsOComponent;
}());
exports.ShowProdsOComponent = ShowProdsOComponent;
//# sourceMappingURL=ShowProdsO.component.js.map