package javaProHomeworks.homework_10_01_24;

import java.util.List;

public class TaskTwelve {

    //Задача: Фильтрация символов по ASCII-значению.
    List<Character> filterByAsciiValue(List<Character> input, int ascii) {
        return input.stream()
                .filter(el -> el == ascii)
                .toList();
    }
}
