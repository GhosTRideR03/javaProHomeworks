package javaProHomeworks.homework_10_01_24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TaskFour {

    //Задача: Соединение строк через запятую.
    static String joinByComma(List<String> input) {
        if (input.isEmpty()) {
            return "";
        }

        return String.join(", ", input);
    }
}
