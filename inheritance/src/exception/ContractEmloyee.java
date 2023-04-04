package exception;

public class ContractEmloyee extends Employee{
    public ContractEmloyee(int id, String name, int DOJ, int age) {
        super(id, name, DOJ, age);
    }

    void work(){
     System.out.println("Emloyee is working in good company based on contract" );
 }

}
