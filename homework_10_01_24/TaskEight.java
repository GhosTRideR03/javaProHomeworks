package javaProHomeworks.homework_10_01_24;

import java.util.List;

public class TaskEight {

    //Задача: Фильтрация чисел, больших заданного значения.
    List<Integer> filterGreaterThan(List<Integer> input, int minValue) {
        return input.stream()
                .filter(el -> el > minValue)
                .toList();
    }
}
