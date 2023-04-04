package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapEmployeeAndManager {
    public static void main(String[] args) {
        Manager someshwari = new Manager();
        someshwari.setName("Someshwari");
        someshwari.setId("s01");

        Manager maheshwari = new Manager();
        maheshwari.setName("Maheshwari");
        maheshwari.setId("s02");

        Employee keerthi = new Employee();
        keerthi.setName("Keerthi");
        keerthi.setId("e01");

        Employee jyothi = new Employee();
        jyothi.setName("Jyothi");
        jyothi.setId("e02");

        Employee preeti = new Employee();
        preeti.setName("Preeti");
        preeti.setId("e03");

        Employee shilpa = new Employee();
        shilpa.setName("Shilpa");
        shilpa.setId("e04");

        Employee tejashwini = new Employee();
        tejashwini.setName("Tejashwini");
        tejashwini.setId("e05");

        Employee pratiksha = new Employee();
        pratiksha.setName("Pratiksha");
        pratiksha.setId("e06");

        ArrayList<Employee> employeeList1 = new ArrayList<Employee>();
        employeeList1.add(keerthi);
        employeeList1.add(jyothi);
        employeeList1.add(preeti);

        ArrayList<Employee> employeeList2 = new ArrayList<Employee>();
        employeeList2.add(shilpa);
        employeeList2.add(tejashwini);
        employeeList2.add(pratiksha);


        HashMap<Manager, ArrayList<Employee>> mapManagerAndEmployees =
                new HashMap<Manager, ArrayList<Employee>>();
        mapManagerAndEmployees.put(someshwari, employeeList1);
        mapManagerAndEmployees.put(maheshwari, employeeList2);

//    System.out.println(mapManagerAndEmployees);

        for (Map.Entry<Manager, ArrayList<Employee>> entry : mapManagerAndEmployees.entrySet()) {
//       System.out.println(entry.getKey()+ " : "+ entry.getValue());
            System.out.print(entry.getKey().getName() + " : ");
            Iterator<Employee> itr = entry.getValue().iterator();
            while (itr.hasNext()) {
                System.out.print(itr.next().getName() + ",");
            }
            System.out.println();
        }
    }
}
