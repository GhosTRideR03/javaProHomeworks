package javaProHomeworks.homework_18_12_23.task_ten;

import java.util.Arrays;

public class TaskTen {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int pos = 2;

        rotateLeft(new ArrayRotator() {
            @Override
            public void rotator(int[] arr, int positions) {
                while (positions != 0) {
                    int temp = arr[0];
                    arr[0] = arr[arr.length - 1];
                    arr[arr.length - 1] = temp;
                    positions--;
                }
            }
        }, arr, pos);

        System.out.println(Arrays.toString(arr));
    }

    static void rotateLeft(ArrayRotator arrayRotator, int[] arr, int positions) {
        arrayRotator.rotator(arr, positions);
    }
}
