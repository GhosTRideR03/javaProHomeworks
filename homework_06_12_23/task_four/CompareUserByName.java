package javaProHomeworks.homework_06_12_23.task_four;


import java.util.Comparator;

public class CompareUserByName implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        return o1.getName().compareTo(o2.getName());
    }

    //**Создайте TreeMap<User, String> (класс User как в задаче 3), но на
    //этот раз реализуйте Comparator<User>, чтобы сортировать пользователей по имени.



}
