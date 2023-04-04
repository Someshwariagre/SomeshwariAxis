package StringConstrutor;

import java.util.StringTokenizer;

public class StringMethod {
    public static void main(String[] args) {

        String s = "Xworkz";
        String s1 = "Xworkz";
        String s2 = "APPLE RED";

        System.out.println(s1.charAt(2));

        System.out.println(s.equals(s1));

        System.out.println(s2.toLowerCase());

        System.out.println(s1.toUpperCase());

        System.out.println(s.substring(2,4));

        System.out.println(s1.compareTo(s));

        System.out.println(s.endsWith("RED"));

        System.out.println(s1.hashCode());
        System.out.println(s.hashCode());

        System.out.println(s1.isEmpty());

    }
}