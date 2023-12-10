package javaProHomeworks.homework_22_11_23.task_one.Classes;

public class Developer extends Employee {

    private String programingLanguage;
    private boolean remote;

    @Override
    public void work() {
        super.work();
        System.out.println("This developer knows " + programingLanguage + ", isRemote: " + remote);
    }

    @Override
    public void takeBreak() {
        super.takeBreak();
        System.out.println("This developer knows " + programingLanguage + ", isRemote: " + remote);
    }
}
