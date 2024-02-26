package LibMgmt;

import java.util.ArrayList;
import java.util.Scanner;

public class Operations {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<LibMgmt> booksList = new ArrayList<>();

    public void setData() {
        LibMgmt obj = new LibMgmt();

        System.out.println("Enter book id:");
        int bookId = sc.nextInt();
        obj.setBookId(bookId);

        System.out.println("Enter book name:");
        String bookName = sc.next();
        obj.setBookName(bookName);

        // Add the book object to the ArrayList
        booksList.add(obj);

        System.out.println("Book added successfully!");
    }

    public void getData() {
        for (LibMgmt book : booksList) {
            System.out.println("BookId=" + book.getBookId());
            System.out.println("BookName=" + book.getBookName());
            System.out.println("-----------");
        }
    }

    public void updateData() {
        System.out.println("Enter book id to update:");
        int bookIdToUpdate = sc.nextInt();

        for (LibMgmt book : booksList) {
            if (book.getBookId() == bookIdToUpdate) {
                System.out.println("1. Update BookId");
                System.out.println("2. Update BookName");
                System.out.println("Enter your choice:");

                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Enter new BookId:");
                        int newBookId = sc.nextInt();
                        book.setBookId(newBookId);
                        System.out.println("BookId updated successfully!");
                        break;
                    case 2:
                        System.out.println("Enter new BookName:");
                        String newBookName = sc.next();
                        book.setBookName(newBookName);
                        System.out.println("BookName updated successfully!");
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
                return; // exit the method after updating the book
            }
        }
        System.out.println("Book not found!");
    }
}
