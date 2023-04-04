package IOHandlingexample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOExample {

    public static void main(String[] args) {
        StringBuffer content = null;
        FileInputStream fileStream = null;
        int[] counts = new int[256];
        int ch;
        int vowelCount = 0;
        int spaceCount = 0;
        String text = "life is short, make it sweet";
        try{
            fileStream = new FileInputStream("D:/data.txt");
            FileOutputStream fos = new FileOutputStream("D:/data.txt");
            byte[] bytes = text.getBytes();
            fos.write(bytes);
            System.out.println("Successfully wrote in the file");

            content =new StringBuffer();
            while((ch = fileStream.read()) !=-1) {
                counts[ch]++;
                content.append((char) ch);

                char c = (char) ch;
                if(isVowel(c)){
                    vowelCount++;
                }
                else if(c==' '){
                    spaceCount++;
                }
                }
            }
        catch(FileNotFoundException fnf){
            fnf.printStackTrace();

        }
        catch(IOException io){
            io.printStackTrace();
        }finally {
            try{
                System.out.println(content);
                fileStream.close();
            }catch (IOException ioex){
                ioex.printStackTrace();
            }
            for(int i = 0; i<counts.length; i++){
                if(counts[i]>0){
                    System.out.println((char) i + ": " + counts[i] );
                }
            }
            System.out.println("Number of vowels in a file:- "+ vowelCount);
            System.out.println("Number of spaces present in file:- "+ spaceCount);
        }
    }
    private static boolean isVowel(char c){
        switch (c){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                return true;
            default:
                return false;
        }
    }
}
