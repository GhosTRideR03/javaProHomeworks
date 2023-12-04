package javaProHomeworks.homework_29_11_23.classes;

import javaProHomeworks.homework_29_11_23.enums.BookStatus;
import javaProHomeworks.homework_29_11_23.enums.Genre;
import javaProHomeworks.homework_29_11_23.enums.ItemCondition;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class CollectionProcessor {
    public static void main(String[] args) {
        Book bookOne = new Book("Book One", "Author One", Genre.HISTORY, ItemCondition.GOOD,
                BookStatus.AVAILABLE, LocalDate.of(1990, Month.JANUARY, 5), 300);
        Book bookTwo = new Book("Book Two", "Author Two", Genre.BIOGRAPHY, ItemCondition.AVERAGE,
                BookStatus.BORROWED, LocalDate.of(1993, Month.APRIL, 3), 350);
        Book bookThree = new Book("Book Three", "Author Three", Genre.FANTASY, ItemCondition.BAD,
                BookStatus.RESERVED, LocalDate.of(2002, Month.MARCH, 30), 200);
        Book bookFour = new Book("Book Four", "Author Four", Genre.FICTION, ItemCondition.BAD,
                BookStatus.UNDER_REPAIR, LocalDate.of(1900, Month.OCTOBER, 4), 340);
        Book bookFive = new Book("Book Five", "Author Five", Genre.SCIENCE, ItemCondition.AVERAGE,
                BookStatus.LOST, LocalDate.of(2015, Month.DECEMBER, 10), 400);

        Magazine magazineOne = new Magazine("Magazine One", "Author Six", Genre.SCIENCE, ItemCondition.GOOD,
                5, LocalDate.of(2023, Month.NOVEMBER, 25), true);
        Magazine magazineTwo = new Magazine("Magazine Two", "Author Seven", Genre.HISTORY, ItemCondition.GOOD,
                5, LocalDate.of(2020, Month.DECEMBER, 12), false);

        List<LibraryItem> list = new ArrayList<>(Arrays.asList
                (bookOne, bookTwo, bookThree, bookFour, bookFive, magazineOne, magazineTwo));
//        listItemsByGenre(list, Genre.HISTORY);
//        sortByTitle(list);
//        filterByAuthor(list, "Author One");
//        listAvailableItems(list);
//        findOldestItem(list);
//        groupItemsByAuthor(list);
//        sortItemsByPublicationDate(list);
        findMostPopularGenre(list);
    }

    static void printAllItems(List<LibraryItem> items) {
        for (LibraryItem element : items) {
            System.out.println(element);
        }
    }

    static void listItemsByGenre(List<LibraryItem> items, Genre genre) {
        List<LibraryItem> genreList = new ArrayList<>();
        for (LibraryItem item : items) {
            if (item.getGenre().equals(genre)) {
                genreList.add(item);
            }
        }
        printAllItems(genreList);
    }

    ;

    static void sortByTitle(List<LibraryItem> items) {
        Collections.sort(items, Comparator.comparing(LibraryItem::getTitle));
        printAllItems(items);
    }


    static void filterByAuthor(List<LibraryItem> items, String author) {
        List<LibraryItem> filteredList = new ArrayList<>();
        for (LibraryItem item : items) {
            if (item.getAuthor().equalsIgnoreCase(author)) {
                filteredList.add(item);
            }
        }
        printAllItems(filteredList);
    }

    static void countItemsByStatus(List<LibraryItem> items, BookStatus status) {
        int counter = 0;
        for (LibraryItem item : items) {
            if (item instanceof Book) {
                if (((Book) item).getStatus().equals(status)) {
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }

    static void updateStatus(List<LibraryItem> items, BookStatus oldStatus, BookStatus newStatus) {
        for (LibraryItem item : items) {
            if (item instanceof Book) {
                if (((Book) item).getStatus().equals(oldStatus)) {
                    ((Book) item).setStatus(newStatus);
                }
            }
        }
    }


    static void listAvailableItems(List<LibraryItem> items) {
        List<LibraryItem> availableItems = new ArrayList<>();
        for (LibraryItem item : items) {
            if (item instanceof Book) {
                if (((Book) item).getStatus().equals(BookStatus.AVAILABLE)) {
                    availableItems.add(item);
                }
            }
        }
        printAllItems(availableItems);
    }

    //  да
    static LibraryItem findOldestItem(List<LibraryItem> items) {
        LibraryItem oldestItem = null;
        LocalDate date = LocalDate.now();
        for (LibraryItem item : items) {
            if (item instanceof Book) {
                if (((Book) item).getPublishDate().isBefore(date)) {
                    date = ((Book) item).getPublishDate();
                    oldestItem = item;
                }
            } else if (item instanceof Magazine) {
                if (((Magazine) item).getReleaseDate().isBefore(date)) {
                    date = ((Magazine) item).getReleaseDate();
                    oldestItem = item;
                }
            }
        }
        return oldestItem;
    }


    static void groupItemsByAuthor(List<LibraryItem> items) {
        List<String> authors = new ArrayList<>();
        for (LibraryItem item : items) {
            if (!authors.contains(item.getAuthor())) {
                authors.add(item.getAuthor());
            }
        }
        List<LibraryItem> groupedList = new ArrayList<>();
        for (String author : authors) {
            for (LibraryItem item : items) {
                if (item.getAuthor().equals(author)) {
                    groupedList.add(item);
                }
            }
        }
        printAllItems(groupedList);
    }

    static void listItemsForRepair(List<LibraryItem> items) {
        List<LibraryItem> forRepair = new ArrayList<>();
        for (LibraryItem item : items) {
            if (item.getCondition().equals(ItemCondition.BAD)) {
                forRepair.add(item);
            }
        }
        printAllItems(forRepair);
    }

    static void displayItemCount(List<LibraryItem> items) {
        System.out.println(items.size());
    }

    static void listBorrowedItemsByUser(List<LibraryItem> items, User user) {
        printAllItems(user.getBorrowedItems());
    }


    static void removeLostItems(List<LibraryItem> items) {
        List<LibraryItem> noLostItemsList = new ArrayList<>();
        for (LibraryItem item : items) {
            if (item instanceof Book) {
                if (((Book) item).getStatus().equals(BookStatus.LOST)) {
                    items.remove(item);
                }
            }
        }
    }

    static void addItemToList(List<LibraryItem> items, LibraryItem item) {
        items.add(item);
    }

    static void removeItemFromList(List<LibraryItem> items, LibraryItem item) {
        items.remove(item);
    }

    static void sortItemsByPublicationDate(List<LibraryItem> items) {
        List<LibraryItem> sortedList = new ArrayList<>();
        while (!items.isEmpty()) {
            LibraryItem temp = findOldestItem(items);
            sortedList.add(temp);
            items.remove(temp);
        }
        printAllItems(sortedList);
    }

    //уник жанры листы
    static void findMostPopularGenre(List<LibraryItem> items) {
        List<Genre> genres = new ArrayList<>();
        for (LibraryItem item : items) {
            if (!genres.contains(item.getGenre())) {
                genres.add(item.getGenre());
            }
        }
        int counter = 1;
        Genre genre = null;
        for (Genre element : genres) {
            int temp = 1;
            for (LibraryItem item : items) {
                if (item.getGenre().equals(element)){
                    temp++;
                }
            }
            if (temp > counter) {
                counter = temp;
                genre = element;
            }
        }
        System.out.println(genre);
    }

    static void calculateAveragePageCount(List<Book> books) {
        int sum = 0;
        for (Book item : books) {
            sum += item.getPageCount();
        }
        System.out.println(sum / books.size());
    }

    static void listMonthlyMagazines(List<Magazine> magazines) {
        List<LibraryItem> monthlyMagazinesList = new ArrayList<>();
        for (Magazine item : magazines) {
            if (item.isMonthly()) {
                monthlyMagazinesList.add(item);
            }
        }
        printAllItems(monthlyMagazinesList);
    }

    static void listItemsByCondition(List<LibraryItem> items, ItemCondition condition) {
        List<LibraryItem> filteredList = new ArrayList<>();
        for (LibraryItem item : items) {
            if (item.getCondition().equals(condition)) {
                filteredList.add(item);
            }
        }
        printAllItems(filteredList);
    }
}
