package exception;

public class UserRegistration {
    public void registerProfile(String userName, int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("user is a Minor");
        }
        else
            System.out.println("User can register the profile");
    }

    public static void main(String[] args) {
        UserRegistration ur = new UserRegistration();
        try{
            ur.registerProfile("Rani",55);
        }
        catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
