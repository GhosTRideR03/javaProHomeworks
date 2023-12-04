package javaProHomeworks.homework_27_11_23.task_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskThree {

    public static void main(String[] args) {


        //- Дан массив/коллекция. Удалить все дубликаты из массива/коллекции.

        int[] arr = {1, 1, 1, 5, 6, 22, 22, 23, 11, 11, 10, 10};
        noDuplicateArray(arr);

        List<Integer> integers = new ArrayList<>(Arrays.asList(1, 1, 3, 5, 4, 4, 3, 6, 7, 9, 10, 0, 3, 5, 0));
        noDuplicateList(integers);
    }

    static void noDuplicateArray(int[] arr) {
        int[] noDuplicateArray = new int[counter(arr)];
        int counter = 1;
        noDuplicateArray[0] = arr[0];
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                noDuplicateArray[counter++] = arr[i + 1];
            }
        }
        System.out.println(Arrays.toString(noDuplicateArray));
    }

    static int counter(int[] arr) {
        int counter = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                counter++;
            }
        }
        return counter;
    }

    static void noDuplicateList(List<Integer> list) {
        List<Integer> temp = new ArrayList<>();
        for (Integer element : list) {
            if (!temp.contains(element)) {
                temp.add(element);
            }
        }
        System.out.println(temp);
    }
}
