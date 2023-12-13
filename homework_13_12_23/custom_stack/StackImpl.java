package javaProHomeworks.homework_13_12_23.custom_stack;

import java.util.LinkedList;
import java.util.List;

public class StackImpl<T> implements Stack2023<T> {

    private LinkedList<T> stack;

    public StackImpl() {
        this.stack = new LinkedList<>();
    }


    @Override
    public void put(T element) {
        stack.add(element);
    }


    @Override
    public boolean isEmpty(List<T> stack) {
        return stack.isEmpty();
    }

    @Override
    public T get() {
        T temp = stack.getLast();
        stack.removeLast();
        return temp;
    }

    @Override
    public T peek() {
        return stack.getLast();
    }


}
