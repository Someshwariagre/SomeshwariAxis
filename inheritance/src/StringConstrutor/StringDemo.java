package StringConstrutor;

public class StringDemo {
    public static void main(String[] args) {


        String s1 = "Hello world";
        String s2 = new String("Hello world");

        char a[] = {'h', 'e', 'l', 'l', 'o'};
        String s3 = new String(a);
        byte b[] = {'a', 'e', 'i', 'o', 'u'};
        String s4 = new String(b);
        String s5 = new String(s2);
        String s6 = new String(b, 2, 3);
        String s7 = s1;
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
        System.out.println(s7);

    }
}
