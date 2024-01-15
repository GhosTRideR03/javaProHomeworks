package javaProHomeworks.homework_10_01_24;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class TaskTwentyTwo {

    //Задача: Определить, является ли список отсортированным.
    static <T extends Comparable<T>> boolean isSorted(List<T> input) {
        return IntStream.range(0, input.size() - 1)
                .allMatch(i -> input.get(i).compareTo(input.get(i + 1)) <= 0);
    }
}
