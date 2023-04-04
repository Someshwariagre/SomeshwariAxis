package exception;


import java.util.Scanner;

public class Candidate {
    private String name;
    private String gender;
    private double expectedSalary;


    public Candidate(String name, String gender, double expectedSalary) {
        this.name = name;
        this.gender = gender;
        this.expectedSalary = expectedSalary;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getExpectedSalary() {
        return expectedSalary;
    }

    public void setExpectedSalary(double expectedSalary) {
        this.expectedSalary = expectedSalary;
    }
}

 class InvalidSalaryException extends Exception {
    public InvalidSalaryException(String message) {
        super(message);
    }
}


