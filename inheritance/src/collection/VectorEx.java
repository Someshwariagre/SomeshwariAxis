package collection;

import java.util.Comparator;
import java.util.List;
import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {
        List v = new Vector();
        v.add("banana");
        v.add("Apple");
        v.add("chiku");
        v.add("pomogranate");
        v.add("orange");
        v.add("Grapes");

        System.out.println(v);

        System.out.println(v.indexOf("Apple"));

        System.out.println(v.get(4));

        System.out.println(v.isEmpty());

        System.out.println(v.remove(3));

        System.out.println(v.toString());

        System.out.println(v.contains("banana"));

        System.out.println(v.hashCode());

        System.out.println(v.subList(2,5));

        System.out.println(v.size());


    }
}
