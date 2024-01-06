package javaProHomeworks.homework_18_12_23.task_six;

public class TaskSix {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        arrPow(new ArrayTransformer() {
            @Override
            public int[] transform(int[] x) {
                int[] result = new int[x.length];
                for (int i = 0; i < x.length; i++) {
                    result[i] = x[i] * 2;
                }
                return result;
            }
        }, arr);
    }

    static int[] arrPow(ArrayTransformer transformer, int[] arr) {
        return transformer.transform(arr);
    }
}
