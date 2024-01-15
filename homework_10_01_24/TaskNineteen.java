package javaProHomeworks.homework_10_01_24;

import java.util.List;

public class TaskNineteen {

    //Задача: Проверить, содержит ли список отрицательные числа.
    boolean containsNegative(List<Float> input) {
        return !input.stream()
                .filter(e -> e < 0)
                .toList().isEmpty();
    }
}
