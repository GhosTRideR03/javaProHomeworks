package javaProHomeworks.homework_18_12_23.task_five;

public class TaskFive {

    public static void main(String[] args) {

        logging(new Logger() {
            @Override
            public void log(String str) {
                System.out.println(str);
            }
        },"String");
    }

    static void logging(Logger log, String str) {
        log.log(str);
    }
}
