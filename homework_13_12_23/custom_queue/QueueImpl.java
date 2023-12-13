package javaProHomeworks.homework_13_12_23.custom_queue;

import java.util.LinkedList;
import java.util.List;

public class QueueImpl<T> implements CustomQueue<T> {

    private LinkedList<T> queue;

    public QueueImpl() {
        this.queue = new LinkedList<>();
    }


    @Override
    public void put(T element) {
        queue.addFirst(element);
    }


    @Override
    public boolean isEmpty(List<T> stack) {
        return stack.isEmpty();
    }

    @Override
    public T get() {
        T temp = queue.getFirst();
        queue.removeFirst();
        return temp;
    }

    @Override
    public T peek() {
        return queue.getFirst();
    }

}
