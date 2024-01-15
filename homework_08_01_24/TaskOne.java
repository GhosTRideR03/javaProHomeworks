package javaProHomeworks.homework_08_01_24;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class TaskOne {

    public static void main(String[] args) {
        //     * --  Отфильтровать на четные или не четные
        //     * -- Просуммировать все числа

          List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Stream<Integer> stream = numbers.stream()
                .filter(el -> el % 2 == 0)
                .reduce(Integer::sum).stream();
        System.out.println(stream.toList());
    }
}
