package DateFunctionExample;

import com.sun.prism.shader.DrawPgram_Color_AlphaTest_Loader;

import java.util.Date;
public class DateConstructorExample {
    public static void main(String[] args) {

        Date defaultDate = new Date();
        System.out.println("Default Date: " + defaultDate);

        Date millisDate = new Date(1616974341000L);
        System.out.println("Date from milliseconds: " + millisDate);

        Date ymdDate = new Date(121, 2, 28);
        System.out.println("Date from year, month, and day: " + ymdDate);

        Date ymdhmsDate = new Date(121, 2, 28, 18, 30, 45);
        System.out.println("Date from year, month, day, hour, minute, and second: " + ymdhmsDate);

    }
}
