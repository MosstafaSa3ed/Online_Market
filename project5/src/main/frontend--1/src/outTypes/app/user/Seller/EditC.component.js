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
var EditCComponent = /** @class */ (function () {
    function EditCComponent(route, _userservice, _route) {
        this.route = route;
        this._userservice = _userservice;
        this._route = _route;
    }
    EditCComponent.prototype.ngOnInit = function () {
        this.Pname = this.route.snapshot.params['pname'];
        this.st = this.route.snapshot.params['st'];
        this.Cname = this.route.snapshot.params['cname'];
    };
    EditCComponent.prototype.EO = function (v1) {
        var _this = this;
        this._userservice.EditC(this.Pname, this.st, v1, this.Cname).subscribe(function (user) {
            console.log(user);
            if (user == true) {
                console.log("tmaaam " + _this.st);
                _this._route.navigate(['/ShowProdsO/' + _this.st]);
            }
            else {
                console.log("l2");
                _this._route.navigate(['/EditC/' + _this.Pname + '/' + _this.st + '/' + _this.Cname]);
            }
        });
    };
    EditCComponent = __decorate([
        core_1.Component({
            selector: 'Editc-prod',
            templateUrl: 'template/EditProd.html',
            providers: [buyer_service_1.BuyerService]
        }),
        __metadata("design:paramtypes", [router_1.ActivatedRoute, buyer_service_1.BuyerService, router_2.Router])
    ], EditCComponent);
    return EditCComponent;
}());
exports.EditCComponent = EditCComponent;
//# sourceMappingURL=EditC.component.js.map