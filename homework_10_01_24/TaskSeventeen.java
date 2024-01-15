package javaProHomeworks.homework_10_01_24;

import java.util.List;

public class TaskSeventeen {


    //Задача: Получить список чисел, умноженных на заданное число.
    List<Float> multiplyBy(List<Float> input, float multiplier) {
        return input.stream()
                .map(e -> e * multiplier)
                .toList();
    }
}
