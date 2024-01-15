package javaProHomeworks.homework_10_01_24;

import java.util.List;

public class TaskFive {

    //Задача: Подсчёт количества строк, содержащих заданный символ.
    long countContainingChar(List<String> input, char ch) {
        return input.stream()
                .filter(e -> e.contains(String.valueOf(ch)))
                .count();
    }
}
