package javaProHomeworks.homework_18_12_23.task_one;

public class TaskOne {

    public static void main(String[] args) {

        length(String::length,"String");
    }

    static int length(StringLength itf, String str) {
        return itf.getLength(str);
    }
}
