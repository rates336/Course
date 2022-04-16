package com.kodilla.library;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookLibrary {
    private LibraryDatabase libraryDatabase;

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


    public List<Book> listBooksInHandsOf(LibraryUser libraryUser, LibraryDatabase libraryDatabase) {
        List<Book> theList = libraryDatabase.listBooksInHandsOf(libraryUser);

        return theList;
    }

}