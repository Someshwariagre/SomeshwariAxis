package IOHandlingexample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteInAFile {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "D:/data.txt";
        Scanner sc = new Scanner(System.in);
        System.out.println("enter text");
        String s = sc.nextLine();

        try
        {
            PrintWriter writer = new PrintWriter(new File("D:/data.txt"));
            writer.write(s);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

