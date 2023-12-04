package javaProHomeworks.homework_29_11_23.LessonFourTask.interfaces;

import javaProHomeworks.homework_29_11_23.LessonFourTask.enums.ItemCondition;

public interface Maintainable {

    void repairItem();
    void updateItemCondition(ItemCondition condition);
    ItemCondition checkCondition();
}
