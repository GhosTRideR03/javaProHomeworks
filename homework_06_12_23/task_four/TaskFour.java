package javaProHomeworks.homework_06_12_23.task_four;


import java.util.*;

public class TaskFour {

    public static void main(String[] args) {

        Map<User, String> userStringTreeMap = new TreeMap<>(new CompareUserByName());
        userStringTreeMap.put(new User("Vlad", 30), "Happy");
        userStringTreeMap.put(new User("Ivan", 40), "New");
        userStringTreeMap.put(new User("Michael", 50), "Year");
        userStringTreeMap.put(new User("AValentin", 60), "Guys");
        System.out.println(userStringTreeMap);
    }
}
