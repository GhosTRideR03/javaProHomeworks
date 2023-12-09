package javaProHomeworks.homework_06_12_23;

import java.util.HashMap;
import java.util.Map;

public class TaskOne {

    public static void main(String[] args) {

        //**Создайте HashMap<String, Integer>, заполните его парами
        //"имя-возраст". Используйте цикл for-each для удвоения возраста каждого человека.

        Map<String, Integer> stringIntegerMap = new HashMap<>();
        stringIntegerMap.put("Ivan", 25);
        stringIntegerMap.put("Eugen", 11);
        stringIntegerMap.put("Dmitry", 20);
        stringIntegerMap.put("Jose", 30);
        stringIntegerMap.put("Vlad", 30);
        ageMultiplier(stringIntegerMap);
    }

    static void ageMultiplier(Map<String, Integer> map) {
        for (String entry : map.keySet()) {
            map.put(entry, map.get(entry) * 2);
        }
        System.out.println(map);
    }
}
