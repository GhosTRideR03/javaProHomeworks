package javaProHomeworks.homework_18_12_23.task_two;

public class TaskTwo {

    public static void main(String[] args) {

        int a = 5;
        int b = 5;

        add(Integer::sum,a,b);

        sub((a1, b1) -> a1 - b1, a, b);

        div((a12, b12) -> a12 / b12, a, b);

        mul((a13, b13) -> a13 * b13, a, b);
    }

    static int add(NumberOperation operation, int a, int b) {
        return operation.operate(a, b);
    }

    static int sub(NumberOperation operation, int a, int b) {
        return operation.operate(a, b);

    }

    static int div(NumberOperation operation, int a, int b) {
        return operation.operate(a, b);
    }

    static int mul(NumberOperation operation, int a, int b) {
        return operation.operate(a, b);
    }
}
