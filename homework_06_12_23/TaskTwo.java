package javaProHomeworks.homework_06_12_23;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TaskTwo {

    public static void main(String[] args) {

        // ***Создайте HashMap<Integer, String>, представляющий
        //"ID-имя пользователя". Используйте цикл для фильтрации
        //пользователей с ID больше 100 и копируйте их в TreeMap.

        Map<Integer, String> integerStringMap = new HashMap<>();

        integerStringMap.put(101, "User 1");
        integerStringMap.put(5, "User 2");
        integerStringMap.put(120, "User 3");
        integerStringMap.put(25, "User 4");
        integerStringMap.put(125, "User 5");
        System.out.println(filteredUsersById(integerStringMap));
    }

    static Map<Integer, String> filteredUsersById(Map<Integer, String> map) {
        Map<Integer, String> treeMap = new TreeMap<>();
        for (Integer entry : map.keySet()) {
            if (100 < entry) {
                treeMap.put(entry, map.get(entry));
            }
        }
        return treeMap;
    }
}
