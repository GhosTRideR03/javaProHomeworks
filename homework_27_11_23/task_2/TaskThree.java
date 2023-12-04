package javaProHomeworks.homework_27_11_23.task_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskThree {

    public static void main(String[] args) {

        //- Дан List 1,написать метод который создает List 2, содержащий только те числа из List 1,
        // которые больше заданного значения.

        List<Integer> integerListOne = new ArrayList<>(Arrays.asList(1, 4, 5, 7, 8, 10, 11, 14, 15, 17, 19, 20, 14, 115, 12));
        int checkNum = 12;
        List<Integer> integerListTwo = listSeparator(integerListOne, checkNum);
        System.out.println(integerListTwo);
    }

    static List<Integer> listSeparator(List<Integer> list, int checkNum) {
        List<Integer> separatedList = new ArrayList<>();
        for (Integer element : list) {
            if (element > checkNum) {
                separatedList.add(element);
            }
        }
        return separatedList;
    }
}
