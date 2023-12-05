package javaProHomeworks.homework_04_12_23;

import com.github.javafaker.Faker;

import java.util.*;

public class TaskSeven {
    private static Faker FAKER = new Faker();

    public static void main(String[] args) {

        //HashMap<Integer, List<String>>: Создайте второй HashMap<Integer, Integer>, где каждый ключ -
        // это ключ из исходного HashMap, а значение - общее количество символов во всех строках списка этого ключа.

        Map<Integer, List<String>> integerListMap = new HashMap<>();
        for (int i = 1; i <= 10; i++) {
            integerListMap.put(i, new ArrayList<>(Arrays.asList(FAKER.funnyName().name(), FAKER.funnyName().name(),
                    FAKER.funnyName().name(), FAKER.funnyName().name(), FAKER.funnyName().name(), FAKER.funnyName().name())));
        }
        System.out.println(integerListMap);
        System.out.println(mapFromListStringToInteger(integerListMap));
    }

    static Map<Integer, Integer> mapFromListStringToInteger(Map<Integer, List<String>> map) {
        Map<Integer, Integer> resultMap = new HashMap<>();
        for (Map.Entry<Integer, List<String>> entry : map.entrySet()) {
            int sum = 0;
            for (String string : entry.getValue()) {
                sum += string.length();
            }
            resultMap.put(entry.getKey(), sum);
        }
        return resultMap;
    }
}
