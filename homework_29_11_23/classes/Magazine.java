package javaProHomeworks.homework_29_11_23.classes;

import javaProHomeworks.homework_29_11_23.enums.Genre;
import javaProHomeworks.homework_29_11_23.enums.ItemCondition;

import java.time.LocalDate;

public class Magazine extends LibraryItem {

    private int issueNumber;
    private LocalDate releaseDate;
    private boolean isMonthly;

    public int getIssueNumber() {
        return issueNumber;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public boolean isMonthly() {
        return isMonthly;
    }

    public Magazine(String title, String author, Genre genre, ItemCondition condition, int issueNumber, LocalDate releaseDate, boolean isMonthly) {
        super(title, author, genre, condition);
        this.issueNumber = issueNumber;
        this.releaseDate = releaseDate;
        this.isMonthly = isMonthly;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "issueNumber=" + issueNumber +
                ", releaseDate=" + releaseDate +
                ", isMonthly=" + isMonthly +
                ", title='" + getTitle() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", genre=" + getGenre() +
                ", condition=" + getCondition() +
                '}';
    }
}
