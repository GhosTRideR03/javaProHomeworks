package javaProHomeworks.homework_06_12_23.task_seven;

import com.github.javafaker.Faker;

import java.util.HashMap;
import java.util.Map;

public class TaskSeven {

    static final Faker FAKER = new Faker();

    public static void main(String[] args) {

        //**Создайте TreeMap<String, Integer> и переберите его, создавая HashMap<Integer, String>,
        //включающий только те записи, где значение больше 50.

        Map<String, Integer> stringIntegerMap = new HashMap<>();
        for (int i = 45; i <= 55; i++) {
            stringIntegerMap.put(FAKER.funnyName().name(),i);
        }
        Map<Integer,String> filteredMap = filteredMapByValues(stringIntegerMap);
        System.out.println(filteredMap);
    }

    static Map<Integer, String> filteredMapByValues(Map<String, Integer> map) {
        Map<Integer, String> filteredMap = new HashMap<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 50) {
                filteredMap.put(entry.getValue(), entry.getKey());
            }
        }
        return filteredMap;
    }
}
