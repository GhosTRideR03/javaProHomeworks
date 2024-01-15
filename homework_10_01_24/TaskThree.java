package javaProHomeworks.homework_10_01_24;

import java.util.List;
import java.util.Optional;

public class TaskThree {

    //Задача: Поиск первой строки, начинающейся на заданную букву.
    Optional<String> findFirstStartingWith(List<String> input, char letter) {

        return input.stream()
                .filter(e -> e.charAt(0) == letter)
                .findFirst();
    }

}
