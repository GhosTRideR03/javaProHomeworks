package javaProHomeworks.homework_27_11.task_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TaskOne {

    public static void main(String[] args) {

        //- Создать метод, который вычисляет среднее значение, медиану и стандартное отклонение для списка целых чисел.
        List<Integer> integerList = new ArrayList<>(Arrays.asList(1, 4, 5, 7, 8, 10, 11, 14, 15, 17, 19, 15, 14, 115, 12));
        System.out.println(standardDeviation(integerList));
        System.out.println(findMedian(integerList));
        System.out.println(averageNumberCalculator(integerList));
    }

    static double standardDeviation(List<Integer> list) {
        double averageNumber = averageNumberCalculator(list);
        double sum = 0;
        for (Integer element : list) {
            sum += Math.pow(element - averageNumber, 2);
        }
        return Math.sqrt(sum / (list.size() - 1));
    }

    static double findMedian(List<Integer> list) {
        Collections.sort(list);
        double median = 0;
        if (list.size() % 2 == 0) {
            median = ((double) list.get(list.size() / 2) + list.get(list.size() / 2 - 1)) / 2;
        } else {
            median = list.get(list.size() / 2);
        }
        return median;
    }

    static double averageNumberCalculator(List<Integer> list) {
        double result = 0;
        for (Integer element : list) {
            result += element;
        }
        return result / list.size();
    }
}
