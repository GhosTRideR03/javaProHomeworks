package javaProHomeworks.homework_04_12_23;

import com.github.javafaker.Faker;

import java.util.HashMap;
import java.util.Map;

public class TaskEight {

    private static Faker FAKER = new Faker();

    public static void main(String[] args) {

        //HashMap<Integer, Integer>: Найдите все пары ключ-значение, где ключ минус значение является простым числом.

        Map<Integer, Integer> integerMap = new HashMap<>();
        for (int i = 1; i < 10; i++) {
            integerMap.put(i, FAKER.number().numberBetween(1, 100));
        }
        integerMap.put(12, 7);
        integerMap.put(11, 4);
        mapSimplePairsFinder(integerMap);
    }

    static void mapSimplePairsFinder(Map<Integer, Integer> map) {
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (isSimple(entry.getKey() - entry.getValue())) {
                System.out.println(entry);
            }
        }
    }

    static boolean isSimple(Integer number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
