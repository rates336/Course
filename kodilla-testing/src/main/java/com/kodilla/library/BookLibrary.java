package com.kodilla.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    private LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<>();
        Book book = new Book("Title", "Author", 2002);
        bookList.add(book);

        return bookList;
    }

    public List<Book> testListBooksInHandsOf(LibraryUser libraryUser) {

        return null;
    }
}
