package javaProHomeworks.homework_04_12_23;

import java.util.*;

public class TaskThree {

    //HashMap<Integer, List<String>>: Для каждого ключа выведите все
    // строки из соответствующего списка, которые начинаются с гласной буквы.

    public static void main(String[] args) {

        Map<Integer, List<String>> listMap = new HashMap<>();
        List<String> stringsOne = new ArrayList<>(Arrays.asList("Autumn", "Empire", "Song", "Owl", "water", "Flight"));
        List<String> stringsTwo = new ArrayList<>(Arrays.asList("Internet", "Element", "Vlad", "Oleg", "minister", "blink"));
        List<String> stringsThree = new ArrayList<>(Arrays.asList("Array", "power", "time", "rush", "Language", "York"));
        listMap.put(1, stringsOne);
        listMap.put(2, stringsTwo);
        listMap.put(3, stringsThree);
        stringsPrinterFromListsOfMapList(listMap);
    }


    static void stringsPrinterFromListsOfMapList(Map<Integer, List<String>> map) {
        for (Map.Entry<Integer, List<String>> entry : map.entrySet()) {
            for (String element : entry.getValue()) {
                if (isVowels(element)) {
                    System.out.println(element);
                }
            }
        }
    }


    static boolean isVowels(String str) {
        List<Character> characterList = new ArrayList<>(Arrays.asList('A', 'E', 'I', 'O', 'U', 'W', 'Y', 'a', 'e',
                'i', 'o', 'u', 'w', 'y'));
        for (Character character : characterList) {
            if (str.charAt(0) == character) {
                return true;
            }
        }
        return false;
    }
}
