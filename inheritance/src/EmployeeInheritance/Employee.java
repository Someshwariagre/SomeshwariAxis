package EmployeeInheritance;

public class Employee {
    long employeeId;
    String employeeName;
    String employeeAddress;
    long employeePhone;
    double basicSalary;
    double specailAllowance = 250.80;
    double hra = 1000.50;

    public Employee(long employeeId, String employeeName, String employeeAddress, long employeePhone) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.employeePhone = employeePhone;
    }
    void calculateSalary(){
        double salary;
        salary = basicSalary+(basicSalary*specailAllowance/100)+(basicSalary*hra/100);
       System.out.println("Salary of  "+ this.employeeName+ " is:-"+ salary);
    }
    void calculateTransportAllowance(){
        double transportAllowance = 10*(basicSalary/100);
        System.out.println("transport allowance of " + this.employeeName+ " is:- " +transportAllowance);

    }
}
