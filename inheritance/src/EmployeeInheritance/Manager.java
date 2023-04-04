package EmployeeInheritance;

public class Manager extends Employee{
        public Manager(long employeeId, String employeeName, String employeeAddress,
                   long employeePhone,double salary) {
        super(employeeId, employeeName, employeeAddress, employeePhone);
        super.basicSalary=salary;
    }

        void calculateTransportAllowance(){
        double transportAllowance = 15*basicSalary /100;
        System.out.println("transport allowance is:- " + transportAllowance);
    }
}
