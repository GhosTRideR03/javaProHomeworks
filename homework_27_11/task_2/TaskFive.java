package javaProHomeworks.homework_27_11.task_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskFive {

    public static void main(String[] args) {

        //- Разработать метод, который возвращает новый List, содержащий только уникальные элементы из исходного списка строк.
        List<String> stringList = new ArrayList<>
                (Arrays.asList("String 1", "String 2", "String 1", "String 3", "String 1", "String 4", "String 5"));
        List<String> uniqueStringList = unifierStringList(stringList);
        System.out.println(uniqueStringList);
    }

    static List<String> unifierStringList(List<String> stringList) {
        List<String> uniqueStringList = new ArrayList<>();
        for (String element : stringList) {
            if (uniqueStringList.contains(element)) {
                continue;
            }
            uniqueStringList.add(element);
        }
        return uniqueStringList;
    }
}
