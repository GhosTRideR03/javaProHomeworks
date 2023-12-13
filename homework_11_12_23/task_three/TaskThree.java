package javaProHomeworks.homework_11_12_23.task_three;

import java.util.HashMap;
import java.util.Map;

public class TaskThree {

    public static void main(String[] args) {

        //Объединить две мапы, если у них нет одинаковых ключей.
    }

    public static Map<String, String> mergeMapsIfUniqueKeys(Map<String, String> map1, Map<String, String> map2) {
        Map<String, String> mergeMap = new HashMap<>(map1);
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            if (!mergeMap.containsKey(entry.getKey())) {
                mergeMap.put(entry.getKey(), entry.getValue());
            }
        }
        return mergeMap;
    }
}
