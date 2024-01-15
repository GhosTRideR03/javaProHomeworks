package javaProHomeworks.homework_10_01_24;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TaskTwentyFive {

    //Задача: Подсчитать частоту каждого элемента в списке.
    <T> Map<T, Long> countFrequency(List<T> input) {
        return input.stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
    }
}
