package exception;

import java.util.Scanner;

public class CustomException {
    public static Candidate getCandidateDetails() throws InvalidSalaryException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the candidate details:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Gender: ");
        String gender = scanner.nextLine();
        System.out.print("Expected Salary: ");
        double expectedSalary = scanner.nextDouble();

        if (expectedSalary < 10000) {
            throw new InvalidSalaryException("Registration Failed. Salary cannot be less than 10000.");
        }

        return new Candidate(name, gender, expectedSalary);
    }

    public static void main(String[] args) {
        try {
            Candidate candidate = getCandidateDetails();
            if (candidate != null) {
                System.out.println("Registration Successful");
            }
        } catch (InvalidSalaryException e) {
            System.out.println(e.getMessage());
        }
    }
}
