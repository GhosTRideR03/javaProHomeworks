package javaProHomeworks.homework_22_11_23.task_one.Classes;

import javaProHomeworks.homework_22_11_23.task_one.Interfaces.EmployeeActions;

public abstract class Employee implements EmployeeActions {

    private String name;
    private int age;
    private Department department;
    private double salary;

    @Override
    public void work() {
        System.out.println(this.name + " is working!");
    }

    @Override
    public void takeBreak() {
        System.out.println(this.name + " took a break");
    }
}
