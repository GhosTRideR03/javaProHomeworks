package javaProHomeworks.homework_08_01_24;

import java.util.Arrays;
import java.util.List;

public class TaskFive {

    public static void main(String[] args) {

      //  * -- Отфильтровать строки на те которые начинаются на 'a' и преобразовать из в верхний регистр

        List<String> words = Arrays.asList("apple", "banana", "apricot", "cherry", "kiwi");

        words = words.stream()
                .filter(e -> e.charAt(0) == 'a')
                .map(String::toUpperCase)
                .toList();
        System.out.println(words);
    }
}
