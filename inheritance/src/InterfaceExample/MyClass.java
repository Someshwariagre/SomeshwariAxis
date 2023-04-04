package InterfaceExample;
public class MyClass implements MyInterface {
    public static void main(String[] args) {
        MyInterface.staticMethod();
        MyInterface.animal();

        MyClass cl = new MyClass();
        cl.bird();
    }
}
