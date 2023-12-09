package javaProHomeworks.homework_06_12_23.task_nine;

import java.util.*;

public class TaskNine {

    public static void main(String[] args) {

        //**Создайте HashMap<String, List<Integer>>, где ключ - это имя, а значение - список оценок.
        //Используйте TreeMap<Integer, List<String>> для создания отображения
        //"средняя оценка - список студентов с этой оценкой".

        Map<String, List<Integer>> studentGradesMap = new HashMap<>();
        studentGradesMap.put("Student One", Arrays.asList(2, 5, 5, 5, 5, 5, 5, 8, 5));
        studentGradesMap.put("Student Two", Arrays.asList(9, 9, 9, 10, 8, 10, 10, 10, 10));
        studentGradesMap.put("Student Three", Arrays.asList(10, 10, 10, 10, 10, 10, 10, 10));
        studentGradesMap.put("Student Four", Arrays.asList(2, 5, 5, 5, 9, 7, 7, 7, 7, 6, 6, 5, 5, 5));
        studentGradesMap.put("Student Five", Arrays.asList(8, 9, 8, 9, 7, 9, 7, 8, 7, 8, 9, 9, 10));
        Map<Integer, List<String>> averageStudentsGradesTree = treeOfAverageGrades(studentGradesMap);
        System.out.println(averageStudentsGradesTree);
    }

    static Map<Integer, List<String>> treeOfAverageGrades(Map<String, List<Integer>> map) {
        Map<Integer, List<String>> averageGradeTree = new TreeMap<>();
        for (String mapKey : map.keySet()) {
            int averageGrade = averageGrade(map.get(mapKey));
            if (averageGradeTree.get(averageGrade) == null) {
                List<String> temp = new ArrayList<>();
                temp.add(mapKey);
                averageGradeTree.put(averageGrade, temp);
            } else {
                List<String> temp = averageGradeTree.get(averageGrade);
                temp.add(mapKey);
                averageGradeTree.put(averageGrade, temp);
            }
        }
        return averageGradeTree;
    }

    static int averageGrade(List<Integer> list) {
        int sumOfGrades = 0;
        for (Integer grade : list) {
            sumOfGrades += grade;
        }
        return sumOfGrades / list.size();
    }
}
