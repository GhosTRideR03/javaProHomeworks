package javaProHomeworks.homework_29_11_23.interfaces;

import javaProHomeworks.homework_29_11_23.classes.User;

public interface Borrowable {

     void borrowItem (User user);
     void returnItem (User user);
     boolean isAvailable();
}
