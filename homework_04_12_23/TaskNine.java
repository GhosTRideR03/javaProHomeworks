package javaProHomeworks.homework_04_12_23;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskNine {

    private static Faker FAKER = new Faker();

    public static void main(String[] args) {

        //HashMap<String, String>: Определите, можно ли преобразовать HashMap в List<String>, где каждый элемент -
        //это конкатенация ключа и значения, так, чтобы все элементы списка были уникальными.

        //ОНИ В ЛЮБОМ СЛУЧАЕ БУДУТ УНИКАЛЬНЫ, Т.К. ПАРА КЛЮЧ-ЗНАЧЕНИЕ УНИКАЛЬНА, И ЕСЛИ ЕЕ ПОВТОРИТЬ ТО ОНА ПЕРЕЗАПИШИТСЯ...
        Map<String, String> stringMap = new HashMap<>();
        for (int i = 1; i <= 10; i++) {
            stringMap.put("Number " + i, FAKER.name().name());
        }
        System.out.println(mapToUniqueList(stringMap));
    }

    static boolean mapToUniqueList(Map<String, String> map) {
        List<String> uniqueList = new ArrayList<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String temp = entry.getKey() + entry.getValue();
            if (!uniqueList.contains(temp)) {
                uniqueList.add(temp);
            } else {
                return false;
            }
        }

        return true;
    }
}
