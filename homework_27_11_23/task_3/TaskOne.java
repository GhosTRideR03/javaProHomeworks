package javaProHomeworks.homework_27_11_23.task_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskOne {

    public static void main(String[] args) {

        //- Реализовать метод, который удаляет из List<String> те элементы, длина которых меньше заданного числа символов.
        List<String> stringList = new ArrayList<>
                (Arrays.asList("String one", "String 2", "String one_two", "String three",
                        "String one_three", "String four 4", "String five"));
        int checkNum = 10;
        smallerStringRemover(stringList, checkNum);
        System.out.println(stringList);
    }

    static void smallerStringRemover(List<String> stringList, int checkNum) {
        for (int i = 0; i < stringList.size(); i++) {
            if (stringList.get(i).length() < checkNum) {
                stringList.remove(i);
            }
        }
    }
}
