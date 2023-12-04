package javaProHomeworks.homework_27_11.task_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskOne {

    public static void main(String[] args) {

        // Заданный массив целых чисел и целевая сумма
        int[] arr = {1, 2, 3, 4, 5};
        int x = 9;

        // Создание списка и заполнение его значениями
        List<Integer> integerList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        // Вызов метода для поиска пар чисел в массиве с заданной суммой
        arrToSum(arr, x);

        // Вызов метода для поиска пар чисел в списке с заданной суммой
        listToSum(integerList, x);
    }

    // Метод для поиска пар чисел в списке, сумма которых равна заданному числу
    static void listToSum(List<Integer> list, int x) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == x) {
                    // Вывод найденной пары
                    System.out.println(list.get(i) + " " + list.get(j));
                }
            }
        }
    }

    // Метод для поиска пар чисел в массиве, сумма которых равна заданному числу
    static void arrToSum(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == x) {
                    // Вывод найденной пары
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }
}
