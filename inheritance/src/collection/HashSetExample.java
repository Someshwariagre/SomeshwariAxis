package collection;

import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {

    Set s = new HashSet();
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);
        s.add(50);
        s.add(60);
        s.add(70);

        System.out.println(s);

        System.out.println(s.isEmpty());

        System.out.println(s.toString());

        System.out.println(s.contains(50));

        System.out.println(s.hashCode());

        System.out.println(s.size());

       Iterator i = s.iterator();
       while(i.hasNext()) {
           System.out.println(i.next());
       }

        System.out.println(s.remove(50));

        for (Object hs: s) {
            System.out.println(hs);
        }


        Set lhs = new LinkedHashSet();
        lhs.add(10);
        lhs.add(20);
        lhs.add(30);
        lhs.add(40);
        lhs.add(50);
        lhs.add(60);
        lhs.add(70);

        System.out.println(lhs);
    }
}
