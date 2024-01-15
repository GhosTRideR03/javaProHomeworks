package javaProHomeworks.homework_10_01_24;

import java.util.List;

public class TaskThirteen {

    //Задача: Проверка, все ли символы в списке заглавные.
    boolean areAllUpperCase(List<Character> input) {
        return input.stream()
                .allMatch(Character::isUpperCase);
    }
}
