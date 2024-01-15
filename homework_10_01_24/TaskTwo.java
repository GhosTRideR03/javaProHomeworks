package javaProHomeworks.homework_10_01_24;

import java.util.List;

public class TaskTwo {


    //Задача: Преобразование всех строк в верхний регистр.
    List<String> toUpperCase(List<String> input) {
        return input.stream()
                .map(String::toUpperCase)
                .toList();
    }
}
