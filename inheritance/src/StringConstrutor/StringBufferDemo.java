package StringConstrutor;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer s1 = new  StringBuffer("Xworkz odc");
        System.out.println(s1.charAt(2));
        System.out.println(s1.append("odc"));
        System.out.println(s1.capacity());
        System.out.println(s1.deleteCharAt(4));
        System.out.println(s1.length());
        System.out.println(s1.reverse());

    }
}
