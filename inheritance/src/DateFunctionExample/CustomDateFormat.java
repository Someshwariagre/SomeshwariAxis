package DateFunctionExample;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CustomDateFormat {
    public static void main(String[] args) {
        String s;
        Format formatter;
        Date date = new Date();
        formatter = new SimpleDateFormat("G EEE yyyy/MM/dd HH:mm:ss");
        s  = formatter.format(date);
        System.out.println(s);

        formatter = new SimpleDateFormat("hh:mm:ss yyyy/MM/dd ");
        s  = formatter.format(date);
        System.out.println(s);

        formatter = new SimpleDateFormat("HH:mm:ss yyyy/MM/dd EEE");
        s  = formatter.format(date);
        System.out.println(s);

        formatter = new SimpleDateFormat("EEEE, dd MMMM yyyy HH:mm:ss");
        s  = formatter.format(date);
        System.out.println(s);

        formatter = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss Z");
        s  = formatter.format(date);
        System.out.println(s);

    }
}