package javaProHomeworks.homework_29_11_23.interfaces;

import javaProHomeworks.homework_29_11_23.enums.ItemCondition;

public interface Maintainable {

    void repairItem();
    void updateItemCondition(ItemCondition condition);
    ItemCondition checkCondition();
}
