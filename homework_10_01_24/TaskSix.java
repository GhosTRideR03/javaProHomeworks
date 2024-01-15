package javaProHomeworks.homework_10_01_24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskSix {

    //Задача: Найти сумму всех чисел в списке.
    int sumOfList(List<Integer> input) {
        return input.stream().reduce(Integer::sum).get();
    }
}
