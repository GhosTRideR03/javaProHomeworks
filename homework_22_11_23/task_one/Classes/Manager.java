package javaProHomeworks.homework_22_11_23.task_one.Classes;

import java.util.Arrays;

public class Manager extends Employee {

    private int teamSize;
    private Employee[] teamMembers;

    @Override
    public void work() {
        super.work();
        System.out.println("Managers team size is " + teamSize + ", members of he's team: " + teamMembers);
    }

    @Override
    public void takeBreak() {
        super.takeBreak();
        System.out.println("Managers team size is " + teamSize + ", members of he's team: " + Arrays.toString(teamMembers));
    }
}
