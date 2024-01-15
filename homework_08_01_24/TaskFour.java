package javaProHomeworks.homework_08_01_24;

import java.util.Arrays;
import java.util.List;

public class TaskFour {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("1", "2", "3", "4", "5");

        List<Integer> integerList = strings.stream()
                .map(Integer::parseInt)
                .toList();
    }
}
