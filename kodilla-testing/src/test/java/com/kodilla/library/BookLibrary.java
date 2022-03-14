package com.kodilla.library;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookLibrary {
    private LibraryDatabase libraryDatabase;
<<<<<<< HEAD
=======
    List<Book> theList = new ArrayList<>();
>>>>>>> a855bd3207a025fa9c51b0792f51fb44e64e40ed

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {

        List<Book> bookList = new ArrayList<>();
        if (titleFragment.length() < 3) return bookList;
        List<Book> resultList = libraryDatabase.listBooksWithCondition(titleFragment);
        if (resultList.size() > 20) return bookList;
        bookList = resultList;

        // temporary returning list of one book
        return bookList;
    }

<<<<<<< HEAD
    public List<Book> listBooksInHandsOf(LibraryUser libraryUser) {
        return libraryDatabase.listBooksInHandsOf(libraryUser);
=======
    boolean rentABook(LibraryUser libraryUser, Book book) {
        if(listBooksInHandsOf(libraryUser).size() <= 15 ) {
            theList.add(book);
            System.out.println("Rented successful.");
            return true;
        } else {
            System.out.println("Rented failed: ");
            System.out.println("User rented 15 books, please return previous rented books.");
            return false;
        }
    }
    boolean returnBooks(LibraryUser libraryUser, Book book) {
        if(listBooksInHandsOf(libraryUser).contains(book)) {
            theList.remove(book);
            System.out.println("Returned successful.");
            return true;
        } else {
            System.out.println("Returned failed: ");
            System.out.println("The user not rented the book.");
            return false;
        }
    }

    public List<Book> listBooksInHandsOf(LibraryUser libraryUser) {
        return theList;
>>>>>>> a855bd3207a025fa9c51b0792f51fb44e64e40ed
    }

}
