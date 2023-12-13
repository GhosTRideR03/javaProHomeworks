package javaProHomeworks.homework_11_12_23.task_one;

import java.util.Map;

public class TaskOne {
    // Вывести все ключи и значения
    public static void main(String[] args) {


    }

    void printMap(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
    }
}
