package javaProHomeworks.homework_04_12_23;

import java.util.HashMap;
import java.util.Map;

public class TaskTwo {

    //HashMap<String, Integer>: Подсчитайте сумму всех значений, соответствующих ключам, начинающимся на букву 'A'.

    public static void main(String[] args) {

        Map<String, Integer> stringMap = new HashMap<>();
        for (int i = 1; i < 10; i++) {
            stringMap.put("key " + i, i);
        }
        stringMap.put("Autumn", 20);
        System.out.println("Sum of elements with \'A\' key = " + sumOfMapByKey(stringMap));
    }

    static int sumOfMapByKey(Map<String, Integer> map) {
        int sum = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getKey().charAt(0) == 'A') {
                sum += entry.getValue();
            }
        }
        return sum;
    }
}
