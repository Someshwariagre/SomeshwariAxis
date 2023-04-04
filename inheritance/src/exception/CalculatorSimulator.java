package exception;

public class CalculatorSimulator {
    public static void main(String[] args) {
        try {
            double taxAmount = TaxCalculator.calculateTax("ron", true, 30000);
            System.out.println("Tax amount is " + taxAmount);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
