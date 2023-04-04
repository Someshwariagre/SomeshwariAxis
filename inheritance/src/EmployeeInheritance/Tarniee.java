package EmployeeInheritance;

public class Tarniee extends Employee{
    public Tarniee(long employeeId, String employeeName, String employeeAddress,
                   long employeePhone, double salary) {
        super(employeeId, employeeName, employeeAddress, employeePhone);
        super.basicSalary = salary;
    }
}
