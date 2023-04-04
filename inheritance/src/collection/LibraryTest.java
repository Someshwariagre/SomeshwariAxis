package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        int choice = 0;

        do {
            System.out.println("1.Add Book");
            System.out.println("2.Display all book details");
            System.out.println("3.Search Book by author");
            System.out.println("4.Count number of books - by book name");
            System.out.println("5.Exit");
            System.out.println("Enter your choice:");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the isbn no:");
                    int isbnno = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter the book name:");
                    String bookName = scanner.nextLine();
                    System.out.println("Enter the author name:");
                    String author = scanner.nextLine();
                    Book book = new Book(isbnno, bookName, author);
                    library.addBook(book);
                    break;
                case 2:
                    ArrayList<Book> allBooks = library.viewAllBooks();
                    for (Book b : allBooks) {
                        System.out.println("ISBN no: " + b.getIsbnno());
                        System.out.println("Book name: " + b.getBookName());
                        System.out.println("Author name: " + b.getAuthor());
                    }
                    break;
                case 3:
                    System.out.println("Enter the author name:");
                    String authorName = scanner.nextLine();
                    ArrayList<Book> booksByAuthor = library.viewBooksByAuthor(authorName);
                    for (Book b : booksByAuthor) {
                        System.out.println("ISBN no: " + b.getIsbnno());
                        System.out.println("Book name: " + b.getBookName());
                        System.out.println("Author name: " + b.getAuthor());
//                        ArrayList<Book> ba = library.viewBooksByAuthor(authorName);
//                       System.out.println(b.getAuthor());


                    }
                    break;


                case 4:
                    System.out.println("Enter the book name:");
                    String bn = scanner.nextLine();
                    ArrayList<Book> b = library.viewBooksByAuthor(bn);
                    System.out.println("Count is:-" + library.countnoofbook(bn));
                    break;
            }
        }
        while(choice!=5);


        }
    }
