package client;

import ru.egalvi.test.LibraryStatefulSessionBeanRemote;

import java.io.IOException;
import java.util.List;


public class EJBStatefulTester extends AbstractEJBTester {

    public static void main(String[] args) {

        EJBStatefulTester ejbTester = new EJBStatefulTester();

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

            LibraryStatefulSessionBeanRemote libraryBean =
                    (LibraryStatefulSessionBeanRemote) ctx.lookup("javaee7-ejb-tutorial-1.0-SNAPSHOT/LibraryStatefulSessionBean!ru.egalvi.test.LibraryStatefulSessionBeanRemote");

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
            int i = 0;
            for (String book : booksList) {
                System.out.println((i + 1) + ". " + book);
                i++;
            }
            LibraryStatefulSessionBeanRemote libraryBean1 =
                    (LibraryStatefulSessionBeanRemote) ctx.lookup("javaee7-ejb-tutorial-1.0-SNAPSHOT/LibraryStatefulSessionBean!ru.egalvi.test.LibraryStatefulSessionBeanRemote");
            List<String> booksList1 = libraryBean1.getBooks();
            System.out.println(
                    "***Using second lookup to get library stateful object***");
            System.out.println(
                    "Book(s) entered so far: " + booksList1.size());
            for (int j = 0; j < booksList1.size(); ++j) {
                System.out.println((j + 1) + ". " + booksList1.get(j));
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