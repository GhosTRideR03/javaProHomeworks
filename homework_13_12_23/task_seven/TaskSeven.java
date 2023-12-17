package javaProHomeworks.homework_13_12_23.task_seven;

import java.util.*;

public class TaskSeven {

    public static void main(String[] args) {

        //- Написать функцию, которая проверяет, являются ли две строки анаграммами друг друга.

        String strOne = "Rimmmr";
        String strTwo = "Mirmmr";
        System.out.println(areAnagrams(strOne, strTwo));
    }

    static boolean areAnagrams(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        char[] chr1 = str1.toCharArray();
        char[] chr2 = str2.toCharArray();
        if (chr1.length != chr2.length) {
            return false;
        }

        Queue<Character> characterQueue = new LinkedList<>();
        for (char c : chr1) {
            characterQueue.offer(c);
        }

        List<Character> characterList = new LinkedList<>();
        for (char c : chr2) {
            characterList.add(c);
        }

        int counter = chr1.length;
        for (char c : chr1) {
            if (characterList.contains(characterQueue.remove())) {
                counter--;
            }
        }
        return counter == 0;
    }
}
