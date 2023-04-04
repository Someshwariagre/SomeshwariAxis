package methodOverloading;

public class PassingValue {
    int a,b;
    PassingValue(int i ,int j){
        a=i;
        b=j;
    }
    void alterPrimitive(int x , int y){
        x = 30;
        y = 60;
    }
    void alterobj(PassingValue o){
        o.a = 20;
        o.b = 19;
    }
    public static void main(String[] args) {
        PassingValue p1 = new PassingValue(100,300);
        System.out.println("Object state before alterPrimitive method call p1.a:- "+ p1.a+ ", p1.b:- " +p1.b);
        System.out.println("Object state before alterPrimitive method call p1.a:- "+ p1.a+ ", p1.b:- " +p1.b);

        p1.alterPrimitive(40,50);
        System.out.println("Object state after alterPrimitive method call p1.a:- "+ p1.a+ ", p1.b:- " +p1.b);
        System.out.println("Object state Before Object method call p1.a:- "+p1.a+ ", p1.b:- " +p1.b);

        p1.alterobj(p1);
        System.out.println("Object state after Object method call p1.a:-"+p1.a+", p1.b:- " +p1.b);

    }
}
