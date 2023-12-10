package javaProHomeworks.homework_06_12_23.task_five;


import java.util.HashMap;
import java.util.Map;

public class TaskFive {

    public static void main(String[] args) {

        //**Создайте два HashMap<String, User> (класс User как в задаче 3) и
        //объедините их в один, удалив дубликаты пользователей.
        Map<String, User> stringUserMapOne = new HashMap<>();
        stringUserMapOne.put("String 1", new User("User 1", 25));
        stringUserMapOne.put("String 2", new User("User 2", 25));
        stringUserMapOne.put("String 3", new User("User 3", 30));
        stringUserMapOne.put("String 4", new User("User 4", 35));
        stringUserMapOne.put("String 5", new User("User 5", 40));
        stringUserMapOne.put("String 6", new User("User 6", 45));
        Map<String, User> stringUserMapTwo = new HashMap<>();
        stringUserMapTwo.put("String 7", new User("User 1", 25));
        stringUserMapTwo.put("String 8", new User("User 2", 25));
        stringUserMapTwo.put("String 9", new User("User 3", 30));
        stringUserMapTwo.put("String 10", new User("User 4", 35));
        stringUserMapTwo.put("String 1", new User("User 7", 35));
        stringUserMapTwo.put("String 12", new User("User 5", 40));
        Map<String, User> uniqueElementsMap = mapElementsUnifier(stringUserMapOne, stringUserMapTwo);
        System.out.println(uniqueElementsMap);
    }

    static Map<String, User> mapElementsUnifier(Map<String, User> mapOne, Map<String, User> mapTwo) {
        Map<String, User> result = new HashMap<>(mapOne);
        for (Map.Entry<String, User> entry : mapTwo.entrySet()) {
            if (!result.containsValue(entry.getValue())) {
                if (result.containsKey(entry.getKey())) {
                    String temp = entry.getKey();
                    temp = temp + " dublicated key";
                    result.put(temp, entry.getValue());
                } else {
                    result.put(entry.getKey(), entry.getValue());
                }
            }
        }
        return result;
    }
}
