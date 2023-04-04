package LambdaEpression;

import java.util.Scanner;
import java.util.function.BiFunction;
public class CalculatorUsingLambda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        BiFunction<Double, Double, Double> add = (a, b) -> a + b;
        BiFunction<Double, Double, Double> subtract = (a, b) -> a - b;
        BiFunction<Double, Double, Double> multiply = (a, b) -> a * b;
        BiFunction<Double, Double, Double> divide = (a, b) -> a / b;

        System.out.print("Enter operation (+, -, *, /): ");
        String operation = scanner.next();


        double result = 0;
        switch (operation) {
            case "+":
                result = add.apply(num1, num2);
                break;
            case "-":
                result = subtract.apply(num1, num2);
                break;
            case "*":
                result = multiply.apply(num1, num2);
                break;
            case "/":
                result = divide.apply(num1, num2);
                break;
            default:
                System.out.println("Invalid operation.");
                break;
        }

        System.out.println("Result: " + result);

        scanner.close();
    }
}
