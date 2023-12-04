package javaProHomeworks.homework_27_11.task_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskTwo {

    public static void main(String[] args) {

        //- Разработать метод, который создает List, содержащий первые уникальные элементы исходного List до первого повторения.

        List<Integer> integerList = new ArrayList<>(Arrays.asList(1, 4, 5, 7, 8, 10, 11, 14, 15, 17, 19, 15, 14, 115, 12));
        List<Integer> listTillFirstDuplicate = unifierListElementBeforeFirstDuplicate(integerList);
        System.out.println(listTillFirstDuplicate);
    }

    static List<Integer> unifierListElementBeforeFirstDuplicate(List<Integer> integerList) {
        List<Integer> unifiedList = new ArrayList<>();
        for (Integer element : integerList) {
            if (unifiedList.contains(element)) {
                break;
            }
            unifiedList.add(element);
        }
        return unifiedList;
    }
}
