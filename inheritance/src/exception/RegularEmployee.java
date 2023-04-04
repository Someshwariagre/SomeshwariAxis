package exception;

public class RegularEmployee extends Employee{

    public RegularEmployee(int id, String name, int DOJ, int age) {
        super(id, name, DOJ, age);
    }

    void work(){
       System.out.println("Employee working in a good compny regularly");
   }
}
