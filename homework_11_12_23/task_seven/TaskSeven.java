package javaProHomeworks.homework_11_12_23.task_seven;

import java.util.Map;
import java.util.Set;

public class TaskSeven {

    public static void main(String[] args) {

        //Найти сумму всех ключей всех мап.
    }

    int sumAllKeys(Set<Map<Integer, String>> setOfMaps) {
        int sum = 0;
        for (Map<Integer, String> element : setOfMaps) {
            for (Integer key : element.keySet()) {
                sum += key;
            }
        }
        return sum;
    }
}
