package javaProHomeworks.homework_08_01_24;

import com.sun.jdi.DoubleValue;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TaskThree {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println(numbers.stream()
                .collect(Collectors.averagingDouble(Integer::doubleValue)));
    }
}
