package javaProHomeworks.homework_10_01_24;

import java.util.List;

public class TaskSeven {


    //Задача: Получить список квадратов чисел.
    List<Integer> getSquares(List<Integer> input) {
        return input.stream()
                .map(el -> (int) Math.pow(el, 2))
                .toList();
    }
}
