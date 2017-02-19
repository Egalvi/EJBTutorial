package ru.egalvi.test.callbacks;

import ru.egalvi.test.persistence.Book;
import ru.egalvi.test.persistence.LibraryPersistentBeanRemote;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

//@Stateless
public class LibraryPersistentBean
       /* implements LibraryPersistentBeanRemote */{

//    public LibraryPersistentBean() {
//    }
//
//    @PersistenceContext(unitName = "EntityEjbPU")
//    private EntityManager entityManager;
//
//    public void addBook(Book book) {
//        entityManager.persist(book);
//    }
//
//    public List<Book> getBooks() {
//        return entityManager.createQuery("From Book")
//                .getResultList();
//    }
//
//    @PostConstruct
//    public void postConstruct() {
//        System.out.println("postConstruct:: LibraryPersistentBean session bean"
//                + " created with entity Manager object: ");
//    }
//
//    @PreDestroy
//    public void preDestroy() {
//        System.out.println("preDestroy: LibraryPersistentBean session"
//                + " bean is removed ");
//    }
}