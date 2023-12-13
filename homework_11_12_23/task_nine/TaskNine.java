package javaProHomeworks.homework_11_12_23.task_nine;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TaskNine {

    public static void main(String[] args) {

        //Найти все строки, которые начинаются с заданного символа во всех вложенных сетах.
    }

    Set<String> findAllStringsWithChar(Set<Map<Character, Set<String>>> complexSet, char c) {
        Set<String> result = new HashSet<>();
        for (Map<Character, Set<String>> map : complexSet) {
            for (Set<String> set : map.values()) {
                for (String element : set) {
                    if (element.charAt(0) == c) {
                        result.add(element);
                    }
                }
            }
        }
        return result;
    }
}
