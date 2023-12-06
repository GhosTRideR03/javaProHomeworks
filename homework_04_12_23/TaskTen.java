package javaProHomeworks.homework_04_12_23;

import java.util.*;

public class TaskTen {

    public static void main(String[] args) {

        //HashMap<String, Integer> и HashMap<Integer, List<String>>: Для каждого ключа в HashMap<String, Integer>
        // найдите соответствующие строки в HashMap<Integer, List<String>>, где ключ во втором HashMap -
        // это значение из первого, и выведите их.

        Map<String, Integer> stringIntegerMap = new HashMap<>();
        Map<Integer, List<String>> integerListMap = new HashMap<>();

        for (int i = 1; i <= 10; i++) {
            stringIntegerMap.put("String " + i, i);
        }

        integerListMap.put(1, new ArrayList<>(Arrays.asList("String 1", "String 2")));
        integerListMap.put(2, new ArrayList<>(Arrays.asList("String 2", "String 3")));
        integerListMap.put(3, new ArrayList<>(Arrays.asList("String 3", "String 4")));

        mapValueKeyCrossPairs(stringIntegerMap,integerListMap);
    }

    static void mapValueKeyCrossPairs(Map<String, Integer> stringIntegerMap, Map<Integer, List<String>> integerListMap) {
        for (String entry : stringIntegerMap.keySet()) {
            int temp = stringIntegerMap.get(entry);
            if (integerListMap.containsKey(temp) && integerListMap.get(temp).contains(entry)) {
                System.out.println("stringIntegerMap key = " + entry + ", stringIntegerMap value = "
                        + temp + ", integerListMap key = " + temp +
                        ", integerListMap value = " + integerListMap.get(temp));
            }
        }
    }
}
