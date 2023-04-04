package StringConstrutor;

import java.util.Scanner;

public class AllPossibleSubString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = scanner.nextLine();

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <=s.length(); j++) {
                System.out.println(s.substring(i, j));
            }
        }
        scanner.close();
    }
}
