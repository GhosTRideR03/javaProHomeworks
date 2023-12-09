package javaProHomeworks.homework_06_12_23.task_five;

import com.github.javafaker.Faker;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TaskFive {
        public static Faker FAKER = new Faker();
    public static void main(String[] args) {

//        **Создайте HashMap<Integer, String> и перепишите его в TreeMap<String, Integer>,
//                инвертируя ключи и значения.

        Map<Integer, String> hashMap = new HashMap<>();
        for (int i = 1; i <= 10; i++) {
            hashMap.put(i,FAKER.name().name());
        }
        System.out.println(hashMap);
        Map<String, Integer> treeMap = keyValueInverter(hashMap);
        System.out.println(treeMap);

    }

    static Map<String, Integer> keyValueInverter(Map<Integer, String> map) {
        Map<String, Integer> result = new TreeMap<>();
        for (Integer key : map.keySet()) {
            result.put(map.get(key), key);
        }
        return result;
    }
}
