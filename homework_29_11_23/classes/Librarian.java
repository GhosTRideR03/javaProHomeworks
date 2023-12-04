package javaProHomeworks.homework_29_11_23.classes;

import javaProHomeworks.homework_29_11_23.enums.ItemCondition;
import javaProHomeworks.homework_29_11_23.interfaces.Maintainable;

import java.util.List;

public class Librarian implements Maintainable {

    String name;
    String employeeId;
    List<LibraryItem> managedItems;
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
