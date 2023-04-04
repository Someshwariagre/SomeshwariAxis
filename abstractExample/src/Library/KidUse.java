package Library;

public class KidUse implements LibraryUser{

    int age;
    String bookType;

    public KidUse(int age,String bookType) {
        this.age = age;
        this.bookType = bookType;
    }

    @Override
    public void registerAccount() {
     if(age<12){
         System.out.println("You have successfully registered under a Kids Account");
     }
     else{
         System.out.println("Sorry, Age must be less than 12 to register as a kid");
     }
    }

    @Override
    public void requestBook() {
   if(bookType.equals("kids")){
       System.out.println("Book Issued successfully, please return the book within 10 days");
   }
   else{
       System.out.println("Book Issued successfully, please return the book within 10 days");
   }
    }
}
