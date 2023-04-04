package IOHandlingexample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BufferReaderFromFile {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter file name: ");
    String fileName = scanner.nextLine();

        try {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        StringBuffer buffer = new StringBuffer();

        System.out.println("Enter text to write to file (type 'quit' to exit):");

        String input;
        while (!(input = scanner.nextLine()).equals("quit")) {
            buffer.append(input);
            buffer.append(System.lineSeparator());
        }

        writer.write(buffer.toString());
        writer.close();
        System.out.println("Successfully wrote to file.");

    } catch (IOException e) {
        System.out.println("An error occurred while writing to the file: " + e.getMessage());
    }
}
}
