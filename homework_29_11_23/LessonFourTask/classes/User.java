package javaProHomeworks.homework_29_11_23.LessonFourTask.classes;

import javaProHomeworks.homework_29_11_23.LessonFourTask.interfaces.Searchable;

import java.util.List;

public class User implements Searchable {

    private String name;
    private String id;
    private List<LibraryItem> borrowedItems;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<LibraryItem> getBorrowedItems() {
        return borrowedItems;
    }

    public void setBorrowedItems(List<LibraryItem> borrowedItems) {
        this.borrowedItems = borrowedItems;
    }

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
