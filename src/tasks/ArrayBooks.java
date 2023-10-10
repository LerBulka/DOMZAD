/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasks;

import java.util.Arrays;
import tasks.arraybooks.Author;
import tasks.arraybooks.Book;

/**
 *
 * @author pupil
 */
public class ArrayBooks {

    public void showBooks() {
        Book book = new Book();
        book.setTitle("Voina i mir");
        book.setPublishedYear(2020);
        book.addAuthor(new Author("Lev","Tolstoy"));
        Book[] books = new Book[5];
        books[0] = book;
        
        book = new Book();
        book.setTitle("Otsi i deti");
        book.setPublishedYear(2020);
        book.addAuthor(new Author("Ivan","Turgenev"));
        books[1] = book;
        
        book = new Book();
        book.setTitle("Learnin Java EE7");
        book.setPublishedYear(2020);
        book.addAuthor(new Author("Ivan","Popov"));
        books[2] = book;
        
        book = new Book();
        book.setTitle("Zolotoi telenok");
        book.setPublishedYear(2020);
        book.addAuthor(new Author("Jevgeny","Petrov"));
        books[3] = book;
        
        book = new Book();
        book.setTitle("Ono");
        book.setPublishedYear(2020);
        book.addAuthor(new Author("Steven","King"));
        books[4] = book;
               
        System.out.println("Массив из 5 книг:");
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null){
                System.out.print(books[i].getTitle());
                System.out.println(", ");
                System.out.print("\t");
                
                System.out.println(books[i].getPublishedYear());
                System.out.print("\t");
                
                
                System.out.print(books[i].toStringAuthors(books[i].getAuthors()));
                System.out.println(", ");
            
        }
        }
        
        System.out.println("-------------");
    
    }
}
