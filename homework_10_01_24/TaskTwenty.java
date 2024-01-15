package javaProHomeworks.homework_10_01_24;

import java.util.List;

public class TaskTwenty {

    //Задача: Округление всех чисел в списке до ближайшего целого.
    List<Integer> roundNumbers(List<Float> input) {
        return input.stream()
                .map(Math::round)
                .toList();
    }
}
