package javaProHomeworks.homework_04_12_23;

import com.github.javafaker.Faker;

import java.util.HashMap;
import java.util.Map;

public class TaskFive {

    private static final Faker FAKER = new Faker();

    public static void main(String[] args) {

        //HashMap<String, String>: Определите, содержит ли HashMap
        // такую пару ключ-значение, где ключ является обратной строкой значения (например, ключ "abc", значение "cba").

        Map<String, String> stringMap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            stringMap.put(FAKER.funnyName().name(), FAKER.funnyName().name());
        }
        stringMap.put("string", "gnirts");
        System.out.println("Is has key/value reversed key/value: " + isPalindrome(stringMap));
    }

    static boolean isPalindrome(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String temp = new StringBuilder(entry.getValue()).reverse().toString();
            if (entry.getKey().equals(temp)) {
                return true;
            }
        }

        return false;
    }
}
