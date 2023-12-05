package javaProHomeworks.homework_04_12_23;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskSix {

    public static void main(String[] args) {

        //HashMap<String, Integer>: Переберите HashMap и преобразуйте его в HashMap<String, String>,
        //где каждое значение - это строковое представление исходного числа, умноженного на 2.
        Map<String, Integer> stringIntegerMap = new HashMap<>();
        for (int i = 1; i <= 10; i++) {
            stringIntegerMap.put("String " + i, i);
        }
        System.out.println(stringIntegerMap);
        System.out.println(intValueToString(stringIntegerMap));
    }

    static Map<String, String> intValueToString(Map<String, Integer> map) {
        Map<String, String> resultMap = new HashMap<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            Integer temp = entry.getValue() * 2;
            resultMap.put(entry.getKey(), temp.toString());
        }

        return resultMap;
    }
}
