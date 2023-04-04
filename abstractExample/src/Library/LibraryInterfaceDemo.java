package Library;

public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        LibraryUser k = new KidUse(10,"kids");
        k.registerAccount();
        k.requestBook();
//        LibraryUser k1 = new KidUse(18,"fiction");
//        k1.registerAccount();
//        k1.requestBook();

        LibraryUser u = new AdultUser(5,"kids");
        u.registerAccount();
        u.requestBook();
//        LibraryUser u1 = new AdultUser(23,"fiction");
//        u.registerAccount();
//        u.requestBook();
    }
}
