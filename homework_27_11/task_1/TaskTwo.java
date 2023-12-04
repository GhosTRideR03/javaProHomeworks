package javaProHomeworks.homework_27_11.task_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskTwo {

    public static void main(String[] args) {

        //  Дан массив/коллекция целых чисел. Необходимо подсчитать, сколько раз каждый элемент встречается в массив/коллекции.
        int[] arr = {1, 1, 1, 5, 6, 22, 22, 23, 11, 11, 10, 10};
        uniqueIntCounter(arr);
        List<Integer> integers = new ArrayList<>(Arrays.asList(1, 1, 3, 5, 4, 4, 3, 6, 7, 9, 10, 0, 3, 5, 0));
        System.out.println("_____________");
        listElementCounter(integers);
    }

    static void listElementCounter(List<Integer> list) {
        List<Integer> temp = listUnificator(list);
        int counter = 0;
        for (int i = 0; i < temp.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (temp.get(i) == list.get(j)) {
                    counter++;
                }
            }
            System.out.println(temp.get(i) + " is repeated " + counter + " times");
            counter = 0;
        }
    }

    static List<Integer> listUnificator(List<Integer> list) {
        List<Integer> uniqueIntList = new ArrayList<>();
        for (Integer value : list) {
            if (!uniqueIntList.contains(value)) {
                uniqueIntList.add(value);
            }
        }
        return uniqueIntList;
    }

    static void uniqueIntCounter(int[] arr) {
//        Arrays.sort(arr);
        int[] temp = intCounter(arr);
        int counter = 0;
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (temp[i] == arr[j]) {
                    counter++;
                }
            }
            System.out.println(temp[i] + " repeated " + counter + " times.");
            counter = 0;
        }
    }

    static int[] intCounter(int[] arr) {
        int[] uniqueArr = new int[counter(arr)];
        int counter = 1;
        uniqueArr[0] = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                uniqueArr[counter++] = arr[i + 1];
            }
        }
        return uniqueArr;
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
}
