export interface Vacation extends StatusVacation{
    vacationID :number | string;
    employeeId : number | string;
    employeeName: string;
    departmentName : string;
    departmentId: number | string;
    title: string;
    startDate: string;
    endDate: string;
    approve: string;

}
export interface StatusVacation {
    status: string
}