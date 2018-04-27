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
var HistoryComponent = /** @class */ (function () {
    function HistoryComponent(route, _userservice, _route) {
        this.route = route;
        this._userservice = _userservice;
        this._route = _route;
    }
    HistoryComponent.prototype.ngOnInit = function () {
        var _this = this;
        this.owner = this.route.snapshot.params['name'];
        this._userservice.histo(this.owner).subscribe(function (Actions) { _this.Actions = Actions; });
    };
    HistoryComponent.prototype.Add1 = function (v1, v2, v3, v4, v5, v6) {
        var _this = this;
        this._userservice.undo(v1, v2, v3, v4, v5, v6).subscribe(function (user) {
            console.log(user);
            if (user == true) {
                console.log("mwgod");
                _this._route.navigate(['/sellerHome/' + _this.owner]);
            }
            else {
                console.log("l2 sorry");
                _this._route.navigate(['/history/' + _this.owner]);
            }
        });
    };
    HistoryComponent = __decorate([
        core_1.Component({
            selector: 'history',
            templateUrl: 'template/History.html',
            providers: [buyer_service_1.BuyerService]
        }),
        __metadata("design:paramtypes", [router_1.ActivatedRoute, buyer_service_1.BuyerService, router_2.Router])
    ], HistoryComponent);
    return HistoryComponent;
}());
exports.HistoryComponent = HistoryComponent;
//# sourceMappingURL=History.component.js.map