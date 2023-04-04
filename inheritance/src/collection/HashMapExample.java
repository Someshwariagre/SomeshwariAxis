package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import  java.util.Set;
public class HashMapExample {
    public static void main(String[] args) {
        HashMapExample hm = new HashMapExample();
        Map<String,String> StudentMap = hm.getStudentDetails();
        System.out.println(StudentMap);
        Set<String> keys = StudentMap.keySet();
        Iterator<String> iterator = keys.iterator();
        System.out.println("Student Details");
        while(iterator.hasNext()) {
            String rollNo = iterator.next();
            String name = StudentMap.get(rollNo);
            System.out.println("Roll No :- " + rollNo + ",  Name:- " + name);
            System.out.println(StudentMap.isEmpty());
            System.out.println(StudentMap.containsKey(3));
            System.out.println(StudentMap.containsValue("Preeti"));


        }
    }

        public Map<String, String> getStudentDetails () {
            Map<String, String> StudentMap = new HashMap<>();
            StudentMap.put("2", "Someshwari");
            StudentMap.put("3", "Sampatti");
            StudentMap.put("1", "Smita");
            StudentMap.put("5", "Aishwarya");
            StudentMap.put("4", "Preeti");


            return StudentMap;

    }
}
