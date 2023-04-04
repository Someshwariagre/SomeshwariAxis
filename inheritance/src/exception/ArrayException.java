package exception;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ArrayException {

        public String getPriceDetails() {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("Enter the number of elements in the array");
                int size = scanner.nextInt();
                int[] arr = new int[size];
                System.out.println("Enter the price details");
                for (int i = 0; i < size; i++) {
                    arr[i] = scanner.nextInt();
                }
                System.out.println("Enter the index of the array element you want to access");
                int index = scanner.nextInt();
                return "The array element is " + arr[index];
            } catch (ArrayIndexOutOfBoundsException e) {
                return "Array index is out of range";
            } catch (InputMismatchException e) {
                return "Input was not in the correct format";
            }
        }

        public static void main(String[] args) {
            ArrayException ae = new ArrayException();
            System.out.println(ae.getPriceDetails());
        }
    }

