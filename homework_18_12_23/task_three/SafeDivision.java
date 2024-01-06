package javaProHomeworks.homework_18_12_23.task_three;

import java.util.Optional;

@FunctionalInterface
public interface SafeDivision {

    Optional<Double> divide(double a, double b);
}
