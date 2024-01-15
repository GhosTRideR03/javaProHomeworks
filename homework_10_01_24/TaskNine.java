package javaProHomeworks.homework_10_01_24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskNine {

    //Задача: Проверка, содержит ли список заданное число.
    boolean isContainsNumber(List<Integer> input, int number) {
        return input.stream()
                .anyMatch(el -> el == number);
    }
}
