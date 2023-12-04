package javaProHomeworks.homework_27_11.task_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskOneVTwo {

    public static void main(String[] args) {
        // Код мой, комменты от чата GPT :)

        // Заданный массив целых чисел и целевая сумма
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 5;

        // Вызов метода для поиска пар чисел в массиве
        arrayElementToSum(arr, sum);

        // Создание списка и заполнение его значениями
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);

        // Вызов метода для поиска пар чисел в списке
        listElementToSum(integerList, sum);
    }

    // Метод для поиска пар чисел в списке, сумма которых равна заданному числу
    static void listElementToSum(List<Integer> integerList, int sum) {
        int head = 0;
        int tail = integerList.size() - 1;

        // Используем два указателя (head и tail), приближая их друг к другу
        while (head != tail) {
            if (integerList.get(head) + integerList.get(tail) < sum) {
                // Увеличиваем указатель head
                head++;
            }
            if (integerList.get(head) + integerList.get(tail) > sum) {
                // Уменьшаем указатель tail
                tail--;
            }
            if (integerList.get(head) + integerList.get(tail) == sum) {
                // Выводим найденную пару
                System.out.println(integerList.get(head) + " + " + integerList.get(tail) + " = " + sum);
                // Перемещаем указатель head для поиска следующей пары
                head++;
            }
        }
    }

    // Метод для поиска пар чисел в массиве, сумма которых равна заданному числу
    static void arrayElementToSum(int[] arr, int sum) {
        int head = 0;
        int tail = arr.length - 1;

        // Используем два указателя (head и tail), приближая их друг к другу
        while (head != tail) {
            if (arr[head] + arr[tail] < sum) {
                // Увеличиваем указатель head
                head++;
            }
            if (arr[head] + arr[tail] > sum) {
                // Уменьшаем указатель tail
                tail--;
            }
            if (arr[head] + arr[tail] == sum) {
                // Выводим найденную пару
                System.out.println(arr[head] + " + " + arr[tail] + " = " + sum);
                // Перемещаем указатель head для поиска следующей пары
                head++;
            }
        }
    }
}