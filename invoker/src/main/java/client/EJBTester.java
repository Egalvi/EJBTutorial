package client;

import ru.egalvi.test.LibrarySessionBeanRemote;

import java.io.IOException;
import java.util.List;


public class EJBTester extends AbstractEJBTester {

    public static void main(String[] args) {

        EJBTester ejbTester = new EJBTester();

        ejbTester.testStatelessEjb();
    }

    private void showGUI() {
        System.out.println("**********************");
        System.out.println("Welcome to Book Store");
        System.out.println("**********************");
        System.out.print("Options \n1. Add Book\n2. Exit \nEnter Choice: ");
    }

    private void testStatelessEjb() {
        try {
            int choice = 1;
            LibrarySessionBeanRemote libraryBean =
                    (LibrarySessionBeanRemote) ctx.lookup("javaee7-ejb-tutorial-1.0-SNAPSHOT/LibrarySessionBean!ru.egalvi.test.LibrarySessionBeanRemote");
            while (choice != 2) {
                String bookName;
                showGUI();
                String strChoice = brConsoleReader.readLine();
                choice = Integer.parseInt(strChoice);
                if (choice == 1) {
                    System.out.print("Enter book name: ");
                    bookName = brConsoleReader.readLine();
                    libraryBean.addBook(bookName);
                } else if (choice == 2) {
                    break;
                }
            }
            List<String> booksList = libraryBean.getBooks();
            System.out.println("Book(s) entered so far: " + booksList.size());
            for (int i = 0; i < booksList.size(); ++i) {
                System.out.println((i + 1) + ". " + booksList.get(i));
            }
            LibrarySessionBeanRemote libraryBean1 =
                    (LibrarySessionBeanRemote) ctx.lookup("javaee7-ejb-tutorial-1.0-SNAPSHOT/LibrarySessionBean!ru.egalvi.test.LibrarySessionBeanRemote");
            List<String> booksList1 = libraryBean1.getBooks();
            System.out.println(
                    "***Using second lookup to get library stateless object***");
            System.out.println(
                    "Book(s) entered so far: " + booksList1.size());
            for (int i = 0; i < booksList1.size(); ++i) {
                System.out.println((i + 1) + ". " + booksList1.get(i));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (brConsoleReader != null) {
                    brConsoleReader.close();
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}