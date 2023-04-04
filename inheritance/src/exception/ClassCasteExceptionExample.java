package exception;

public class ClassCasteExceptionExample {
    public static void main(String[] args) {
        Employee e = new RegularEmployee(1,"somu", 12, 33);
        e.work();
        try {
            ContractEmloyee ce = (ContractEmloyee) e;
            ce.work();
        }
      catch(ClassCastException e1){
            System.out.println(e1);
      }
        }


    }

