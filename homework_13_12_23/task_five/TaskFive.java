package javaProHomeworks.homework_13_12_23.task_five;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class TaskFive {

    public static void main(String[] args) {

        //- Инвертируйте Map<String, String>, чтобы ключи стали значениями, а значения ключами.

        Map<String, String> stringStringHashMap = new HashMap<>();
        stringStringHashMap.put("String One", "1");
        stringStringHashMap.put("String Two", "2");
        stringStringHashMap.put("String Three", "3");
        stringStringHashMap.put("String Four", "4");
        stringStringHashMap.put("String Five", "5");
        stringStringHashMap.put("String Six", "5");
        System.out.println(stringStringHashMap);
        Map<String, String> stringStringHashMapTwo = invert(stringStringHashMap);
        System.out.println(stringStringHashMapTwo);

    }

    public static Map<String, String> invert(Map<String, String> map) {
        Map<String, String> result = new HashMap<>();
        Stack<String> stack = new Stack<>();
        stack.addAll(map.keySet());
        while (!map.isEmpty()) {
            if (result.containsKey(map.get(stack.peek()))) {
                String temp = map.get(stack.peek()) + " Dublicate";
                result.put(temp, map.get(stack.peek()));
                map.remove(stack.pop());
            } else {
                result.put(map.get(stack.peek()), stack.peek());
                map.remove(stack.pop());
            }
        }


        return result;
    }
}
