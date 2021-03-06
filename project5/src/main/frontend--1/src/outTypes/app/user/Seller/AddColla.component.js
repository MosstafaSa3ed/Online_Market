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
var AddCollaComponent = /** @class */ (function () {
    function AddCollaComponent(route, _userservice, _route) {
        this.route = route;
        this._userservice = _userservice;
        this._route = _route;
    }
    AddCollaComponent.prototype.ngOnInit = function () {
        this.name = this.route.snapshot.params['name'];
        this.st = this.route.snapshot.params['st'];
    };
    AddCollaComponent.prototype.Colla = function (v1) {
        var _this = this;
        this._userservice.addColla(v1, this.st, this.name).subscribe(function (user) {
            console.log(user);
            if (user == true) {
                console.log("tmaaam " + _this.st);
                _this._route.navigate(['/sellerHome/' + _this.name]);
            }
            else {
                console.log("mfeee4 Colla hnaaaa");
                _this._route.navigate(['/AddColla/' + _this.name + '/' + _this.st]);
            }
        });
    };
    AddCollaComponent = __decorate([
        core_1.Component({
            selector: 'add-colla',
            templateUrl: 'template/AddColla.html',
            providers: [buyer_service_1.BuyerService]
        }),
        __metadata("design:paramtypes", [router_1.ActivatedRoute, buyer_service_1.BuyerService, router_2.Router])
    ], AddCollaComponent);
    return AddCollaComponent;
}());
exports.AddCollaComponent = AddCollaComponent;
//# sourceMappingURL=AddColla.component.js.map