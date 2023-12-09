package javaProHomeworks.homework_06_12_23.task_three;

import java.util.Collections;
import java.util.TreeMap;

public class TaskThree {

    public static void main(String[] args) {

//        3**Создайте класс User с полями name и age, реализующий Comparable
//        для сортировки по возрасту. Используйте TreeMap<User, String>
//                для хранения информации о пользователях и переберите его, чтобы напечатать имена.

        TreeMap<User, String> userStringTreeMap = new TreeMap<>();
        userStringTreeMap.put(new User("Vlad", 30), "Happy");
        userStringTreeMap.put(new User("Ivan", 40), "New");
        userStringTreeMap.put(new User("Michael", 50), "Year");
        userStringTreeMap.put(new User("Valentin", 60), "Guys");
        System.out.println(userStringTreeMap);
    }
}
