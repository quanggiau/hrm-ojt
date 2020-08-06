
export interface Department{
    deparmentID: number | string,
    departmentName: string,
    departmentCode: number | string,
    departmentDescription: string,
    
}
export const departmentList : Department[] = [
    {
        deparmentID : "1",
        departmentName: "DEV",
        departmentCode: "1",
        departmentDescription: "Áp dụng cho dự án JAVA",
        // companyName: "DEV-EMS"
    },
    {
        deparmentID : "2",
        departmentName: "DEV2",
        departmentCode: "1",
        departmentDescription: "Chuyên cho công ty NET",
        // companyName: "DEV-BAS"
    },
    {
        deparmentID : "3",
        departmentName: "DEVPHP",
        departmentCode: "1",
        departmentDescription: " ",
        // companyName: "DEV-PHP"
    }]