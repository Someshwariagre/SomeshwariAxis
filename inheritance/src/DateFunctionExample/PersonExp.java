package DateFunctionExample;

import java.util.ArrayList;
import java.util.Date;


public class PersonExp {
    public static void main(String[] args) {

        ArrayList<Emp> employeeList = new ArrayList<Emp>();

        employeeList.add(new Emp("John", "Smith", "2019-04-30"));
        employeeList.add(new Emp("Jane", "Doe", "2018-09-30"));
        employeeList.add(new Emp("Bob", "Johnson", "2020-12-31"));


        for(Emp e : employeeList) {
            System.out.println(e.getFullName() + " - Experience: " + e.getExperience() + " years");
        }


        int highestExperience = 0;
        for(Emp e : employeeList) {
            if(e.getExperience() > highestExperience) {
                highestExperience = (int) e.getExperience();
            }
        }


        System.out.println("Highest Experience: " + highestExperience + " years");
    }

}

class Emp{

    private String firstName;
    private String lastName;
    private Date hireDate;

    public Emp(String firstName, String lastName, String hireDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.hireDate = new Date(hireDate);
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public int getExperience() {
        Date currentDate = new Date();
        long milliseconds = currentDate.getTime() - hireDate.getTime();
        long seconds = milliseconds / 1000;
        long minutes = seconds / 60;
        long hours = minutes / 60;
        int years = (int) (hours / 8760);
        return years;
    }
}
