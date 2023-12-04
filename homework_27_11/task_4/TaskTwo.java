package javaProHomeworks.homework_27_11.task_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class TaskTwo {

    public static void main(String[] args) {

        //- Написать метод, который возвращает список строк, которые встречаются в исходном списке более заданного количества раз.
        List<String> stringList = new ArrayList<>
                (Arrays.asList("String 1", "String 2", "String 1", "String 3", "String 1", "String 4", "String 5"));
        int checkNum = 2;
        List<String> duplicatedStringsInList = duplicatedStringsInListToList(stringList,checkNum);
        System.out.println(duplicatedStringsInList);
    }

    static List<String> duplicatedStringsInListToList(List<String> stringList, int checkNum) {
        List<String> result = new ArrayList<>();
        List<String> clone = new ArrayList<>(stringList);
        int counter = 0;
        for (int i = 0; i < stringList.size(); i++) {
            for (int j = 0; j < clone.size(); j++) {
                if (stringList.get(i).equals(clone.get(j))) {
                    counter++;
                }
            }
            if (counter >= checkNum) {
                if (!result.contains(stringList.get(i))) {
                    result.add(stringList.get(i));
                }
            }
            counter = 0;
        }
        return result;
    }
}
