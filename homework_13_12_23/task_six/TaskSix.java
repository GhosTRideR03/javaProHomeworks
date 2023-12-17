package javaProHomeworks.homework_13_12_23.task_six;

import java.util.HashMap;
import java.util.Map;

public class TaskSix {

    public static void main(String[] args) {

        //- Написать функцию, которая выполняет факторизацию(погуглить) числа и возвращает
        //  ее в виде Map, где ключ - это простой множитель, а значение - степень этого множителя.
        int number = 9;
        Map<Integer, Integer> integerMap = primeFactorization(number);
        for (Map.Entry<Integer, Integer> entry : integerMap.entrySet()) {
            System.out.println(entry.getKey() + "^" + entry.getValue());
        }
    }

    public static Map<Integer, Integer> primeFactorization(int number) {
        Map<Integer, Integer> result = new HashMap<>();
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                result.put(i, result.getOrDefault(i, 0) + 1);
                number /= i;
            }
        }

        return result;
    }
}
