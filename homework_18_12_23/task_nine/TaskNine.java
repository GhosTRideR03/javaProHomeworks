package javaProHomeworks.homework_18_12_23.task_nine;

import java.util.Arrays;

public class TaskNine {

    public static void main(String[] args) {
        int[] arr = {1, 20, 50, 30, -5, -10, 15};

        arrayProcessor(new NumberProcessor() {
            @Override
            public void process(int[] arr) {
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = arr[i] * -1;
                }
            }
        }, arr);

        System.out.println(Arrays.toString(arr));
    }

    static int[] arrayProcessor(NumberProcessor processor, int[] arr) {
        processor.process(arr);
        return arr;
    }
}
