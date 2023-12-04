package javaProHomeworks.homework_27_11.task_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskFour {

    public static void main(String[] args) {

        // - Написать метод, который преобразует List<String> в List<Integer>, представляющих длину каждой строки.
        List<String> stringList = new ArrayList<>
                (Arrays.asList("String one", "String 2", "String one_two", "String three",
                        "String one_three", "String four 4", "String five"));
        List<Integer> integerList = stringLenghtList(stringList);
        System.out.println(integerList);
    }

    static List<Integer> stringLenghtList(List<String> list) {
        List<Integer> integerList = new ArrayList<>();
        for (String element : list) {
            integerList.add(element.length());
        }
        return integerList;
    }
}
