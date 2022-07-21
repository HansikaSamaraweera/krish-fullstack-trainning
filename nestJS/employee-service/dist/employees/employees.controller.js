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
var __param = (this && this.__param) || function (paramIndex, decorator) {
    return function (target, key) { decorator(target, key, paramIndex); }
};
var _a;
Object.defineProperty(exports, "__esModule", { value: true });
exports.EmployeesController = void 0;
const common_1 = require("@nestjs/common");
const employees_service_1 = require("./employees.service");
const EmployeeSearch_dto_1 = require("./EmployeeSearch.dto");
let EmployeesController = class EmployeesController {
    constructor(employeeService) {
        this.employeeService = employeeService;
    }
    getAllRmployee(Param) {
        if (Param) {
            console.log('filter');
            this.employeeService.employeeSearch(Param);
        }
        else {
            console.log('filter');
            return this.employeeService.getAllEmployees();
        }
    }
    createEmployee(firstName, lastName, city, tier) {
        this.employeeService.createEmployee(firstName, lastName, city, tier);
    }
    createEmployee2(request) {
        return this.employeeService.createEmployee(request.firstName, request.lastName, request.city, request.tier);
    }
};
__decorate([
    (0, common_1.Get)(),
    __param(0, (0, common_1.Query)()),
    __metadata("design:type", Function),
    __metadata("design:paramtypes", [typeof (_a = typeof EmployeeSearch_dto_1.EmployeeSearchDto !== "undefined" && EmployeeSearch_dto_1.EmployeeSearchDto) === "function" ? _a : Object]),
    __metadata("design:returntype", void 0)
], EmployeesController.prototype, "getAllRmployee", null);
__decorate([
    (0, common_1.Post)(),
    __param(0, (0, common_1.Body)('firstName')),
    __param(1, (0, common_1.Body)('lastName')),
    __param(2, (0, common_1.Body)('city')),
    __param(3, (0, common_1.Body)('tier')),
    __metadata("design:type", Function),
    __metadata("design:paramtypes", [String, String, String, String]),
    __metadata("design:returntype", void 0)
], EmployeesController.prototype, "createEmployee", null);
__decorate([
    (0, common_1.Post)(),
    __param(0, (0, common_1.Body)()),
    __metadata("design:type", Function),
    __metadata("design:paramtypes", [Object]),
    __metadata("design:returntype", void 0)
], EmployeesController.prototype, "createEmployee2", null);
EmployeesController = __decorate([
    (0, common_1.Controller)('employees'),
    __metadata("design:paramtypes", [employees_service_1.EmployeesService])
], EmployeesController);
exports.EmployeesController = EmployeesController;
//# sourceMappingURL=employees.controller.js.map