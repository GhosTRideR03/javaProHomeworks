package javaProHomeworks.homework_27_11_23.task_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskTwo {

    public static void main(String[] args) {

        //- Составить метод, который объединяет все строки из List в одну большую строку.
        List<String> stringList = new ArrayList<>
                (Arrays.asList("String 1", "String 2", "String 1", "String 3", "String 1", "String 4", "String 5"));
        stringConcat(stringList);
    }

    static void stringConcat(List<String> stringList) {
        StringBuilder concat = new StringBuilder();
        for (String element : stringList) {
            concat.append(element).append(" ");
        }
        System.out.println(concat);
    }
}
