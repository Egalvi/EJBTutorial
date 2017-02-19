package ru.egalvi.test;

import javax.ejb.Remote;
import java.util.List;

@Remote
public interface LibraryStatefulSessionBeanRemote {
    void addBook(String bookName);
    List getBooks();
}