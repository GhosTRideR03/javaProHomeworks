package javaProHomeworks.homework_27_11.task_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskFour {

    public static void main(String[] args) {
        //- Дан массив/коллекция целых чисел. Необходимо переставить элементы массив/коллекции в обратном порядке.
        //Array/List
        // Заданный массив целых чисел
        int[] arr = {1, 1, 1, 5, 6, 22, 22, 23, 11, 11, 10, 10};

        // Вызов метода для перестановки элементов массива в обратном порядке
        arr = reverseArray(arr);
        System.out.println(Arrays.toString(arr));

        // Создание списка и заполнение его значениями
        List<Integer> integers = new ArrayList<>(Arrays.asList(1, 1, 3, 5, 4, 4, 3, 6, 7, 9, 10, 0, 3, 5, 0));

        // Вызов метода для перестановки элементов списка в обратном порядке
        integers = reverseList(integers);
        System.out.println(integers);
    }

    // Метод для перестановки элементов списка в обратном порядке
    static List<Integer> reverseList(List<Integer> list) {
        List<Integer> temp = new ArrayList<>();
        // Итерация по исходному списку в обратном порядке
        for (int i = list.size() - 1; i >= 0; i--) {
            // Добавление элемента во временный список
            temp.add(list.get(i));
        }
        // Возвращение временного списка с элементами в обратном порядке
        return temp;
    }

    // Метод для перестановки элементов массива в обратном порядке
    static int[] reverseArray(int[] arr) {
        int[] temp = new int[arr.length];
        int index = 0;
        // Итерация по исходному массиву в обратном порядке
        for (int i = arr.length - 1; i >= 0; i--) {
            // Заполнение временного массива элементами в обратном порядке
            temp[index++] = arr[i];
        }
        // Возвращение временного массива с элементами в обратном порядке
        return temp;
    }
}