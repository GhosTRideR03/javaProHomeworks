package javaProHomeworks.homework_10_01_24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TaskTwentyThree {

    //Задача: Получить последний элемент списка, если он существует.
    static <T> Optional<T> getLastElement(List<T> input) {
        if (input.isEmpty()) {
            return null;
        }
        return input.stream()
                .skip(input.size() - 1)
                .findFirst();
    }
}
