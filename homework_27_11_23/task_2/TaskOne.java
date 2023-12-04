package javaProHomeworks.homework_27_11_23.task_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskOne {

    public static void main(String[] args) {

        // - Реализовать метод, который удаляет все вхождения заданной строки из List<String>.

        List<String> stringList = new ArrayList<>
                (Arrays.asList("String 1", "String 2", "String 1", "String 3", "String 1", "String 4", "String 5"));

        // Строка, которую нужно удалить из списка
        String checkString = "String 1";

        // Вызов метода для удаления указанной строки из списка
        removeElementFromStringList(stringList, checkString);

        // Вывод списка после удаления элементов
        System.out.println(stringList);
    }

    // Метод для удаления указанной строки из списка
    static void removeElementFromStringList(List<String> stringList, String checkString) {
        for (int i = 0; i < stringList.size(); i++) {
            // Проверка на совпадение строк (без учета регистра)
            if (stringList.get(i).equalsIgnoreCase(checkString)) {
                // Удаление найденной строки из списка
                stringList.remove(stringList.get(i));
            }
        }

        // Возвращение измененного списка
    }
}
