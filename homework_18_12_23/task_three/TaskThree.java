package javaProHomeworks.homework_18_12_23.task_three;

import java.util.Optional;

public class TaskThree {

    public static void main(String[] args) {

        double a = 5;
        double b = 5;

        System.out.println(safeDivision((a1, b1) -> {
            if (a1 == 0 || b1 == 0) {
                return Optional.of(0.0d);
            }
            return Optional.of(a1 / b1);
        }, a, b));


    }

    static Optional<Double> safeDivision(SafeDivision sf, double a, double b) {
        return sf.divide(a, b);
    }
}
