export interface Employee{

    id:string;
    firstName: string;
    lastName: string;
    city: string;
    tier: string;
    status: Employee;
}
export enum EmployeeTier{
    TIER_ONE = 1,
    TIER_TWO = 2,
    TIER_THREE = 3
}
export enum EmployeeStatus{
    ACTIVE ='ACTIVE',
    SUSPEND = 'SUSPEND',
    RESIGNED = 'RESIGNED'
}