package InterfaceExample;
public interface MyInterface {
    static void staticMethod() {
        System.out.println("This is a static method in MyInterface.");
    }

    default void bird(){
        System.out.println("this is a default method");
    }
    public static void animal(){
        System.out.println("This is public class");

    }
  }


