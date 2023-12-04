package javaProHomeworks.homework_29_11_23.classes;

import javaProHomeworks.homework_29_11_23.enums.Genre;
import javaProHomeworks.homework_29_11_23.enums.ItemCondition;

public abstract class LibraryItem {

    private String title;
    private String author;
    private Genre genre;
    private ItemCondition condition;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Genre getGenre() {
        return genre;
    }

    public ItemCondition getCondition() {
        return condition;
    }

    public LibraryItem(String title, String author, Genre genre, ItemCondition condition) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.condition = condition;
    }
}
