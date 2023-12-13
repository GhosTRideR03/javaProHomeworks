package javaProHomeworks.homework_13_12_23.task_two;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TaskTwo {

    public static void main(String[] args) {

        ////- Печать элементов Queue в обратном порядке

        Queue<String> queue = new LinkedList<>();
        queue.offer("ewqeqw");
        queue.offer("fsafasf");
        queue.offer("dsadwd");

        printInReverse(queue);

    }

    public static void printInReverse(Queue<String> queue) {
        Stack<String> stack = new Stack<>();
        for (String element : queue) {
            stack.push(element);
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
