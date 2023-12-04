package javaProHomeworks.homework_04_12_23;

import java.util.*;

public class TaskThree {

    //HashMap<Integer, List<String>>: Для каждого ключа выведите все
    // строки из соответствующего списка, которые начинаются с гласной буквы.

    public static void main(String[] args) {

        Map<Integer, List<String>> listMap = new HashMap<>();
        List<String> strings = new ArrayList<>(Arrays.asList("Autumn", ""));
        listMap.put(1, strings);
    }



    static boolean isVowels(String str) {

        List<Character> characterList = new ArrayList<>(Arrays.asList('A', 'E', 'I', 'O', 'U', 'W', 'Y'));
        for (Character character : characterList) {
            if (str.charAt(0) == character) {
                return true;
            }
        }
        return false;
    }
}
