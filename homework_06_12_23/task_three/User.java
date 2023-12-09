package javaProHomeworks.homework_06_12_23.task_three;

public class User implements Comparable<User>{
//
//      3**Создайте класс User с полями name и age, реализующий Comparable
//    для сортировки по возрасту. Используйте TreeMap<User, String>
//    для хранения информации о пользователях и переберите его, чтобы напечатать имена.

        private String name;
        private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(User o) {
        return this.age - o.age;
    }
}
