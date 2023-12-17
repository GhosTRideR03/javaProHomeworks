package javaProHomeworks.homework_13_12_23.task_three;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TaskThree {

    public static void main(String[] args) {

        //- Реализуйте функцию, которая осуществляет циклический сдвиг элементов в Queue<String>.
        Queue<String> queue = new LinkedList<>();
        queue.offer("1");
        queue.offer("2");
        queue.offer("3");
        queue.offer("4");
        queue.offer("5");

        rotate(queue, 3);
        System.out.println(queue);
    }

    public static void rotate(Queue<String> queue, int k) {
        for (int i = 0; i < k; i++) {
            Stack<String> temp = new Stack<>();
            temp.addAll(queue);
            queue.removeAll(temp);
            queue.offer(temp.pop());
            Stack<String> tempTwo = new Stack<>();
            tempTwo.addAll(temp);
            queue.addAll(tempTwo);
        }
    }
}
