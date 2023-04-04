package DateFunctionExample;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getDay());
        System.out.println(d.toString());
        System.out.println(d.getMonth());
        System.out.println(d.getMinutes());

        Date futureDate = new Date(d.getTime() + (1000 * 60 * 60 * 24));
        int comparison = futureDate.compareTo(d);
        System.out.println("Comparison of Future Date and Current Date: " + comparison);


        boolean isAfter = futureDate.after(d);
        boolean isBefore = futureDate.before(d);
        System.out.println("Is Future Date after Current Date:- " + isAfter);
        System.out.println("Is Future Date before Current Date:- " + isBefore);


        d.setYear(122);
        System.out.println("Updated Date: " + d);
    }
}