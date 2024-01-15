package javaProHomeworks.homework_10_01_24;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

public class TaskFifteen {

    //Задача: Получить обратный список символов.
    List<Character> reverseList(List<Character> input) {
        return input.stream()
                .sorted(Collections.reverseOrder())
                .toList();
    }
}
