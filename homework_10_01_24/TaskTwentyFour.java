package javaProHomeworks.homework_10_01_24;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TaskTwentyFour {

    //Задача: Перемешать элементы списка.
    <T> List<T> shuffleList(List<T> input) {
        return input.stream()
                .collect(Collectors.collectingAndThen(Collectors.toList(),
                        list -> {
                            Collections.shuffle(list);
                            return list;
                        }));
    }
}
