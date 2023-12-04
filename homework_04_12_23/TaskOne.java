package javaProHomeworks.homework_04_12_23;

import java.util.HashMap;
import java.util.Map;

public class TaskOne {

    //HashMap<String, String>: Найдите количество пар ключ-значение, где длина ключа равна длине значения.
    public static void main(String[] args) {

        Map<String, String> stringMap = new HashMap<>();
        for (int i = 1; i < 10; i++) {
            stringMap.put("key " + i, "value " + i);
        }
        System.out.println(countEqualEntryMap(stringMap) + " matches found");
    }

    static int countEqualEntryMap(Map<String, String> stringMap) {
        int counter = 0;
        for (Map.Entry<String, String> entry : stringMap.entrySet()) {
            if (entry.getKey().length() == entry.getValue().length()) {
                counter++;
            }
        }
        return counter;
    }
}
