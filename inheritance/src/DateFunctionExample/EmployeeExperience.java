package DateFunctionExample;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class EmployeeExperience {
    public static void main(String[] args) {

        ArrayList<Employee> employeeList = new ArrayList<Employee>();


        employeeList.add(new Employee("John", "Smith", "2019-03-15"));
        employeeList.add(new Employee("Jane", "Doe", "2018-08-20"));
        employeeList.add(new Employee("Bob", "Johnson", "2020-01-01"));


        for(Employee e : employeeList) {
            System.out.println(e.getFullName() + " - Experience: " + e.getExperience() + " years");
        }


        double highestExperience = 0;
        for(Employee e : employeeList) {
            if(e.getExperience() > highestExperience) {
                highestExperience = e.getExperience();
            }
        }


        System.out.println("Highest Experience: " + highestExperience + " years");
    }

}

class Employee {

    private String firstName;
    private String lastName;
    private Date startDate;

    public Employee(String firstName, String lastName, String startDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.startDate = new Date(startDate);
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public double getExperience() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        int currentYear = cal.get(Calendar.YEAR);
        int currentMonth = cal.get(Calendar.MONTH);
        int currentDay = cal.get(Calendar.DAY_OF_MONTH);

        cal.setTime(startDate);
        int startYear = cal.get(Calendar.YEAR);
        int startMonth = cal.get(Calendar.MONTH);
        int startDay = cal.get(Calendar.DAY_OF_MONTH);

        double experience = currentYear - startYear;
        if(currentMonth < startMonth) {
            experience -= 1;
        }
        else if(currentMonth == startMonth && currentDay < startDay) {
            experience -= 1;
        }

        return experience;
    }
}
