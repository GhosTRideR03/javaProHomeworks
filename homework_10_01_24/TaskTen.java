package javaProHomeworks.homework_10_01_24;

import java.util.List;
import java.util.Optional;

public class TaskTen {

    //Задача: Найти максимальное число в списке.
    Optional<Integer> findMax(List<Integer> input) {
        return input.stream()
                .reduce(Integer::max);
    }
}
