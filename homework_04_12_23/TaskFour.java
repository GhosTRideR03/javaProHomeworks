package javaProHomeworks.homework_04_12_23;

import com.github.javafaker.Faker;

import java.util.HashMap;
import java.util.Map;

public class TaskFour {
    private static final Faker FAKER = new Faker();
    // HashMap<Integer, Integer>: Найдите ключ с максимальным значением и выведите эту пару.

    public static void main(String[] args) {

        Map<Integer, Integer> integerMap = new HashMap<>();
        for (int i = 1; i <= 10; i++) {
            integerMap.put(i, FAKER.number().numberBetween(1, 100));
        }
        System.out.println(integerMap);
        mapHighestValue(integerMap);
    }

    static void mapHighestValue(Map<Integer, Integer> map) {
        int keyOfHighestValue = 0;
        int highestValue = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > highestValue) {
                keyOfHighestValue = entry.getKey();
                highestValue = entry.getValue();
            }
        }
        System.out.println("Key: " + keyOfHighestValue + ", Value: " + highestValue);
    }
}
