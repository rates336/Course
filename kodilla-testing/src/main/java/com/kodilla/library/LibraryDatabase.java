package com.kodilla.library;

import java.util.List;

public interface LibraryDatabase {
    List<Book> listBooksWithCondition(String titleFragment);
    List<Book> listBooksInHandsOf(LibraryUser libraryUser);

    boolean rentABook(LibraryUser libraryUser, Book book);
    boolean returnBooks(LibraryUser libraryUser, Book book);
}
