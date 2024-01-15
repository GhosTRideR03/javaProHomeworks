package javaProHomeworks.homework_10_01_24;

import java.util.List;

public class TaskEleven {

    //Задача: Преобразование списка символов в список строк.
    List<String> convertToStringList(List<Character> input) {
        return input.stream()
                .map(Object::toString)
                .toList();
    }
}
