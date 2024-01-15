package javaProHomeworks.homework_10_01_24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TaskSixteen {


    //Задача: Найти минимальное число в списке.
    Optional<Float> findMin(List<Float> input) {
        return input.stream()
                .sorted()
                .findFirst();
    }
}
