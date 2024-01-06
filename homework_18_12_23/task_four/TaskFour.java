package javaProHomeworks.homework_18_12_23.task_four;

public class TaskFour {

    public static void main(String[] args) {

        toUpperCase(new UpperCaseConverter() {
            @Override
            public String convert(String str) {
                return str.toUpperCase();
            }
        }, "String");
    }

    static String toUpperCase(UpperCaseConverter converter, String str) {
        return converter.convert(str);
    }
}
