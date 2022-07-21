"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
Object.defineProperty(exports, "__esModule", { value: true });
exports.EmployeesService = void 0;
const common_1 = require("@nestjs/common");
const crypto_1 = require("crypto");
const Employee_model_1 = require("./Employee.model");
let EmployeesService = class EmployeesService {
    constructor() {
        this.employees = [];
    }
    getAllEmployees() {
        return this.employees;
    }
    createEmployee(firstName, lastName, city, tier) {
        const employee = {
            id: (0, crypto_1.randomUUID)(),
            firstName,
            lastName,
            city,
            tier,
            status: Employee_model_1.EmployeeStatus.ACTIVE
        };
        this.employees.push(employee);
        return employee;
    }
    employeeSearch(employeeSearchDto) {
        console.log(employeeSearchDto);
        const { status, name } = employeeSearchDto;
        let employees = this.getAllEmployees();
        if (status) {
            employees = employees.filter(employee => employee.status === status);
        }
        if (name) {
            employees = employees.filter(employee => employee.firstName.includes(name) || employee.lastName.includes(name));
            console.log(employees);
        }
        return employees;
    }
    getEmployeeById(id) {
        const employees = this.getAllEmployees();
        return employees.find(employee => employee.id === id);
    }
    updateEmployee(employeeUpdatedto) {
        const { id, city } = employeeUpdatedto;
        let employee = this.getEmployeeById(id);
        employee.city = city;
        return employee;
    }
    deleteEmployee(id) {
        let employees = this.getAllEmployees();
        this.employees = employees.filter(employee => employee.id != id);
        return (employees.length != this.employees.length);
    }
};
EmployeesService = __decorate([
    (0, common_1.Injectable)()
], EmployeesService);
exports.EmployeesService = EmployeesService;
//# sourceMappingURL=employees.service.js.map