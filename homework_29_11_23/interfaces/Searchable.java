package javaProHomeworks.homework_29_11_23.interfaces;

import javaProHomeworks.homework_29_11_23.classes.LibraryItem;

import java.util.List;

public interface Searchable {

    List<LibraryItem> findByTitle(String title);

    List<LibraryItem> findByAuthor(String author);

    List<LibraryItem> findByGenre(String genre);
}
