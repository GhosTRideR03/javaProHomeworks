package javaProHomeworks.homework_10_01_24;

import java.util.List;

public class TaskTwentyOne {

    //Задача: Найти количество уникальных элементов в списке.
    <T> long countUnique(List<T> input) {
        return input.stream()
                .distinct()
                .count();
    }
}
