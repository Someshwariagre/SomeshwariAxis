package collection;

import exception.Employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArraylistEmployee {


    public static void main(String[] args) {
//      Employee e = new Employee(1, "Smita", 21, 23);
//      Employee e1 = new Employee(2, "someshwari", 29, 22);
//      Employee e2 = new Employee(3, "Aishwarya", 4, 20);
//      Employee e3 = new Employee(4, "Sampatti", 6, 25);

      List<EmployeeObj> al = new ArrayList<>();
        for (EmployeeObj emp : al) {
            System.out.println(emp);
            
        }
        System.out.println(al.toString());

        Iterator i = al.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
//        System.out.println(al.get(2));

        System.out.println(al.hashCode());


        System.out.println(al.isEmpty());

        System.out.println(al.toArray());

//        System.out.println(e1.getName().contains("someshwari"));

//        slist.sort(Comparator.comparing(Student::getSname));
    }
}
