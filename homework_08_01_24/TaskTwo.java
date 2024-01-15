package javaProHomeworks.homework_08_01_24;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TaskTwo {

    public static void main(String[] args) {

        //     * -- Найти суммы чисел кратных 3 и 5

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15);

        Stream<Integer> stream = numbers.stream()
                .filter(el -> el % 5 == 0 && el % 3 == 0);
        System.out.println(stream.toList());
    }
}
