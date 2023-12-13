package javaProHomeworks.homework_13_12_23.task_one;

import java.util.Stack;

public class TaskOne {

    public static void main(String[] args) {


    }

    static String reverseString(String str) {
        char[] temp = str.toCharArray();
        Stack<String> stack = new Stack<>();
        for (char c : temp) {
            stack.push(String.valueOf(c));
        }
        StringBuilder sb = new StringBuilder(stack.pop());
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}
