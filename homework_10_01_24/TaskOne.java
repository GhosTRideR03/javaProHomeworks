package javaProHomeworks.homework_10_01_24;

import java.util.List;

public class TaskOne {

    //Задача: Фильтрация списка строк по длине.
    List<String> filterByLength(List<String> input, int length) {
        return input.
                stream().
                filter(e -> e.length() == length)
                .toList();
    }
}
