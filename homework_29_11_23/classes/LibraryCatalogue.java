package javaProHomeworks.homework_29_11_23.classes;

import javaProHomeworks.homework_29_11_23.interfaces.Searchable;

import java.util.List;

public class LibraryCatalogue implements Searchable {

    List<Book> books;
    List<Magazine> magazines;

    @Override
    public List<LibraryItem> findByTitle(String title) {
        return null;
    }

    @Override
    public List<LibraryItem> findByAuthor(String author) {
        return null;
    }

    @Override
    public List<LibraryItem> findByGenre(String genre) {
        return null;
    }
}
