package InnerclassEx;
public class ClassA {
    int n=10;
    public class ClassB{
        int n = 20;
        public  int add(){
            return n+20;
        }
    }
    public int substract(){
        return n-2;
    }
    public static void main(String[] args) {
        ClassA a = new ClassA();
        System.out.println("Subtraction of ClassA:- " + a.substract());

        ClassB b = a.new ClassB();
        System.out.println("Addition of ClassB:- " + b.add());
    }
}
