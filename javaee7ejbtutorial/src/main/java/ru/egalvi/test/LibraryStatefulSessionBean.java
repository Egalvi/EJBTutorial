package ru.egalvi.test;

import javax.ejb.Stateful;
import java.util.ArrayList;
import java.util.List;

@Stateful
public class LibraryStatefulSessionBean implements LibraryStatefulSessionBeanRemote {
    List<String> bookShelf;

    public LibraryStatefulSessionBean(){
        bookShelf = new ArrayList<String>();
    }

    public void addBook(String bookName) {
        bookShelf.add(bookName);
    }

    public List<String> getBooks() {
        return bookShelf;
    }
}