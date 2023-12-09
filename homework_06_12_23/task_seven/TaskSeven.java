package javaProHomeworks.homework_06_12_23.task_seven;

import com.github.javafaker.Faker;

import java.util.*;

public class TaskSeven {

    public static final Faker FAKER = new Faker();

    public static void main(String[] args) {

        //**Создайте HashMap<String, Integer>, переберите её и создайте List<Integer>,
        //содержащий все значения HashMap.
        Map<String, Integer> stringIntegerMap = new HashMap<>();
        for (int i = 1; i <= 10; i++) {
            stringIntegerMap.put(FAKER.funnyName().name(), i);
        }
        List<Integer> mapValuesList = mapValuesToList(stringIntegerMap);
        Collections.sort(mapValuesList);
        System.out.println(mapValuesList);
    }

    static List<Integer> mapValuesToList(Map<String, Integer> map) {
        return new ArrayList<>(map.values());
    }
}
