package javaProHomeworks.homework_27_11.task_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskThree {

    public static void main(String[] args) {

        //- Разработать метод, который объединяет строки из List в одну строку, разделяя их запятой
        List<String> stringList = new ArrayList<>
                (Arrays.asList("String 1", "String 2", "String 1", "String 3", "String 1", "String 4", "String 5"));
        String listElementsInOne = listElementsToString(stringList).toString();
        System.out.println(listElementsInOne);
    }

    static StringBuilder listElementsToString(List<String> stringList) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < stringList.size(); i++){
            if (i == stringList.size()-1) {
                sb.append(stringList.get(i)).append(".");
                break;
            }
            sb.append(stringList.get(i)).append(", ");
        }
            return sb;
    }
}
