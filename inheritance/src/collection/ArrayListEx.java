package collection;

import exception.Employee;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

    public static void main(String[] args) {
        List al = new ArrayList();

        al.add("Apple");
        al.add("Banana");
        al.add("Orange");
        al.add("pompgranate");


      System.out.println(al);


        System.out.println(al.get(3));


        System.out.println(al.addAll(4,al));


        System.out.println(al.contains("Apple"));


        System.out.println(al.indexOf(3));


        System.out.println(al.isEmpty());


        al.clear();

    }
}
