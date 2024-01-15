package javaProHomeworks.homework_10_01_24;

import java.util.List;

public class TaskEighteen {

    //Задача: Отфильтровать числа, меньшие заданного значения.
    List<Float> filterLessThan(List<Float> input, float value) {
        return input.stream()
                .filter(e -> e < value)
                .toList();
    }
}
