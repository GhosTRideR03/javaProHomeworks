package javaProHomeworks.homework_29_11_23.classes;

import javaProHomeworks.homework_29_11_23.enums.BookStatus;
import javaProHomeworks.homework_29_11_23.enums.Genre;
import javaProHomeworks.homework_29_11_23.enums.ItemCondition;
import javaProHomeworks.homework_29_11_23.interfaces.Borrowable;
import javaProHomeworks.homework_29_11_23.interfaces.Maintainable;

import java.time.LocalDate;

public class Book extends LibraryItem implements Borrowable, Maintainable {

    private BookStatus status;
    private LocalDate publishDate;
    private int pageCount;

    public BookStatus getStatus() {
        return status;
    }

    public void setStatus(BookStatus status) {
        this.status = status;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public int getPageCount() {
        return pageCount;
    }

    @Override
    public String toString() {
        return "Book{" +
                "status=" + status +
                ", publishDate=" + publishDate +
                ", pageCount=" + pageCount +
                ", title='" + getTitle() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", genre=" + getGenre() +
                ", condition=" + getCondition() +
                '}';
    }

    public Book(String title, String author, Genre genre, ItemCondition condition, BookStatus status, LocalDate publishDate, int pageCount) {
        super(title, author, genre, condition);
        this.status = status;
        this.publishDate = publishDate;
        this.pageCount = pageCount;
    }

    @Override
    public void borrowItem(User user) {

    }

    @Override
    public void returnItem(User user) {

    }

    @Override
    public boolean isAvailable() {

        if (this.status.equals(BookStatus.AVAILABLE)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void repairItem() {

    }

    @Override
    public void updateItemCondition(ItemCondition condition) {

    }

    @Override
    public ItemCondition checkCondition() {
        return null;
    }
}
