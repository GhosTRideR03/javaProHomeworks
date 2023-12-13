package javaProHomeworks.homework_11_12_23.task_ten;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TaskTen {

    public static void main(String[] args) {

        //Создать мапу, где ключами являются символы, а значениями - количество раз, которое
        //строки начинающиеся на этот символ встречаются во всех вложенных сетах.
    }

    Map<Character, Integer> countStringOccurrences(Set<Map<Character, Set<String>>> complexSet) {
        Map<Character, Integer> result = new HashMap<>();

        for (Map<Character, Set<String>> map : complexSet) {
            for (Map.Entry<Character, Set<String>> setMap : map.entrySet()) {
                int counter = 0;
                for (String value : setMap.getValue()) {
                    if (value.charAt(0) == setMap.getKey()) {
                        counter++;
                    }
                }
                result.put(setMap.getKey(), counter);
            }
        }
        return result;
    }
}
