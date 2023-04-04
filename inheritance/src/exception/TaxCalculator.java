package exception;

public class TaxCalculator {
    public static double calculateTax(String empName, boolean isIndian, double empSal) throws Exception {
        if (!isIndian) {
            throw new Exception("CountryNotValidException: The employee should be an Indian citizen for calculating tax");
        }
        if (empName == null || empName.isEmpty()) {
            throw new Exception("EmployeeNameInvalidException: The employee name cannot be empty");
        }
        double taxAmount = 0;
        if (empSal > 100000 && isIndian) {
            taxAmount = empSal * 8 / 100;
        } else if (empSal > 50000 && isIndian) {
            taxAmount = empSal * 6 / 100;
        } else if (empSal > 30000 && isIndian) {
            taxAmount = empSal * 5 / 100;
        } else if (empSal > 10000 && isIndian) {
            taxAmount = empSal * 4 / 100;
        } else {
            throw new Exception("TaxNotEligibleException: The employee does not need to pay tax");
        }
        return taxAmount;
    }
}
