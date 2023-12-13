package javaProHomeworks.homework_13_12_23.custom_queue;

import java.util.List;

public interface CustomQueue<T> {

    void put(T element); //put
    boolean isEmpty(List<T> list); //
    T get();
    T peek();

}
