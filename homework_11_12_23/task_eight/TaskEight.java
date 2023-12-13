package javaProHomeworks.homework_11_12_23.task_eight;

import java.util.Map;
import java.util.Set;

public class TaskEight {

    public static void main(String[] args) {

        //Определить, содержится ли заданная строка как значение хотя бы в одной из мапы.
    }

    boolean containsValue(Set<Map<Integer, String>> setOfMaps, String value) {
        for (Map map : setOfMaps) {
            for (Object string : map.values()) {
                if (value.equals(string)) {
                    return true;
                }
            }
        }
        return false;
    }
}
