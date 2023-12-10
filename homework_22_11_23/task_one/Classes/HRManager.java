package javaProHomeworks.homework_22_11_23.task_one.Classes;

import java.util.Arrays;

public class HRManager extends Employee {

    private int numberOfRecruitments;
    private int[] candidateList;

    @Override
    public void work() {
        super.work();
        System.out.println("This HR Manager has recruited " + numberOfRecruitments + " recruits, and he has "
                + candidateList + " more candidates");
    }

    @Override
    public void takeBreak() {
        super.takeBreak();
        System.out.println("This HR Manager has recruited " + numberOfRecruitments + " recruits, and he has "
                + Arrays.toString(candidateList) + " more candidates");
    }
}
