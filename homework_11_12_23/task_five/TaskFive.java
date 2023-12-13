package javaProHomeworks.homework_11_12_23.task_five;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TaskFive {

    public static void main(String[] args) {

        //Найти количество уникальных значений в мапе
        Map<String, String> map = new HashMap<>();
        for (int i = 1; i <= 5; i++) {
            map.put("String " + i, "String " + i);
        }
        map.put("String 6", "String 1");
        map.put("String 7", "String 1");
        map.put("String 8", "String 1");
        System.out.println(countUniqueValuesV2(map));
    }

    int countUniqueValues(Map<String, String> map) {
        Set<String> set = new HashSet<>(map.values());
        return set.size();
    }

    static int countUniqueValuesV2(Map<String, String> map) {
        Set<String> set = new HashSet<>(map.values());
        int result = set.size();
        for (String value : set) {
            int counter = 0;
            for (String element : map.values()) {
                if (value.equals(element)) {
                    counter++;
                }
            }
            if (counter > 1) {
                result--;
            }
        }
        return result;
    }
}
