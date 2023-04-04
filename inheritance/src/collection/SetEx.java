package collection;

import java.util.Set;
import java.util.TreeSet;

public class SetEx {

    public static void main(String[] args) {
        Set s = new TreeSet();
        s.add("banana");
        s.add("Apple");
        s.add("Chikku");
        s.add("pomogranate");
        s.add("orange");
        s.add("grapes");
        s.add("grapes");

        System.out.println(s);

        System.out.println(s.isEmpty());

        System.out.println(s.toString());

        System.out.println(s.contains("banana"));

        System.out.println(s.hashCode());

        System.out.println(s.size());

    }
}
