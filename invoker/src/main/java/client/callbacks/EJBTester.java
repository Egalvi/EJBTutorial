package client.callbacks;

import client.AbstractEJBTester;
import ru.egalvi.test.persistence.Book;
import ru.egalvi.test.persistence.LibraryPersistentBeanRemote;

import java.io.IOException;
import java.util.List;

public class EJBTester extends AbstractEJBTester {
//
//    public static void main(String[] args) {
//
//        EJBTester ejbTester = new EJBTester();
//
//        ejbTester.testEntityEjb();
//    }
//
//    private void showGUI() {
//        System.out.println("**********************");
//        System.out.println("Welcome to Book Store");
//        System.out.println("**********************");
//        System.out.print("Options \n1. Add Book\n2. Exit \nEnter Choice: ");
//    }
//
//    private void testEntityEjb() {
//        try {
//            int choice = 1;
//
//            LibraryPersistentBeanRemote libraryBean =
//                    (LibraryPersistentBeanRemote)
//                            ctx.lookup("LibraryPersistentBean/remote");
//
//            while (choice != 2) {
//                String bookName;
//                showGUI();
//                String strChoice = brConsoleReader.readLine();
//                choice = Integer.parseInt(strChoice);
//                if (choice == 1) {
//                    System.out.print("Enter book name: ");
//                    bookName = brConsoleReader.readLine();
//                    Book book = new Book();
//                    book.setName(bookName);
//                    libraryBean.addBook(book);
//                } else if (choice == 2) {
//                    break;
//                }
//            }
//
//            List<Book> booksList = libraryBean.getBooks();
//
//            System.out.println("Book(s) entered so far: " + booksList.size());
//            int i = 0;
//            for (Book book : booksList) {
//                System.out.println((i + 1) + ". " + book.getName());
//                i++;
//            }
//
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        } finally {
//            try {
//                if (brConsoleReader != null) {
//                    brConsoleReader.close();
//                }
//            } catch (IOException ex) {
//                System.out.println(ex.getMessage());
//            }
//        }
//    }
}