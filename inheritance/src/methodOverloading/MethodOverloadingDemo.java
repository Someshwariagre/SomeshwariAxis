package methodOverloading;

public class MethodOverloadingDemo {

   public void add(){
        System.out.println("This has no paremeters inside a add method");
    }
   public void add(int a , int b, int c){
       int d= a+b+c;
       System.out.println("sum :- "+d);
    }

    public void add(float f1,float f2){
       float f = f1+f2;
       System.out.println("addition :- " + f);
    }
     public void add(String s1, String s2){
       String s= s1+s2;
        System.out.println("String added :- "+s);
    }

    public static void main(String[] args) {
        MethodOverloadingDemo mod  = new MethodOverloadingDemo();
        mod.add();
        mod.add("Good","Night");
        mod.add(1,2,3);
        mod.add(2.3f,5.6f);

    }
}
