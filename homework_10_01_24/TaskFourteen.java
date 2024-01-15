package javaProHomeworks.homework_10_01_24;

import java.util.List;
import java.util.Optional;

public class TaskFourteen {

    //Задача: Найти первый повторяющийся символ.
    Optional<Character> findFirstDuplicate(List<Character> input) {
        return input.stream()
                .distinct()
                .filter(el -> input.indexOf(el) != input.lastIndexOf(el))
                .findFirst();
    }
}
