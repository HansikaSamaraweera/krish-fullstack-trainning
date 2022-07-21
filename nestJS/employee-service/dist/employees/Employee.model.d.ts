export interface Employee {
    id: string;
    firstName: string;
    lastName: string;
    city: string;
    tier: string;
    status: Employee;
}
export declare enum EmployeeTier {
    TIER_ONE = 1,
    TIER_TWO = 2,
    TIER_THREE = 3
}
export declare enum EmployeeStatus {
    ACTIVE = "ACTIVE",
    SUSPEND = "SUSPEND",
    RESIGNED = "RESIGNED"
}
