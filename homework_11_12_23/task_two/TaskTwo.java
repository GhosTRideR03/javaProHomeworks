package javaProHomeworks.homework_11_12_23.task_two;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TaskTwo {

    public static void main(String[] args) {

        //Найти ключи, значения которых равны заданной строке.
    }

    Set<String> findKeysByValue(Map<String, String> map, String value) {
        Set<String> result = new HashSet<>();
        for (String element : map.keySet()) {
            if (element.equals(value)) {
                result.add(element);
            }
        }
        return result;
    }
}
