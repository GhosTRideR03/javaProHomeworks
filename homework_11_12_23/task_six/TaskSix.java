package javaProHomeworks.homework_11_12_23.task_six;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TaskSix {

    public static void main(String[] args) {

        //Вывести все строки, которые являются значениями в любой из мап.
    }

    Set<String> findAllValues(Set<Map<Integer, String>> setOfMaps) {
        Set<String> result = new HashSet<>();
        for (Map entry : setOfMaps) {
            for (Object value : entry.values()) {
                result.add((String) value);
            }
        }
        return result;
    }
}
