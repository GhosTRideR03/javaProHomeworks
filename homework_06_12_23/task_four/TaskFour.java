package javaProHomeworks.homework_06_12_23.task_four;


import java.util.*;

public class TaskFour {

    public static void main(String[] args) {

        Map<User, String> userStringTreeMap = new TreeMap<>(new CompareUserByName());
        userStringTreeMap.put(new User("Vlad", 30), "Happy");
        userStringTreeMap.put(new User("Ivan", 40), "New");
        userStringTreeMap.put(new User("Michael", 50), "Year");
        userStringTreeMap.put(new User("AValentin", 60), "Guys");
        System.out.println(userStringTreeMap);
//        Map<User, String> test = sortTreeByComparator(userStringTreeMap);
//        System.out.println(test);
//        List<Map.Entry<User,String>> entryList = new ArrayList<>(userStringTreeMap.entrySet());
//        Collections.sort(entryList,new CompareUserByName());
    }

//    static Map<User, String> sortTreeByComparator(Map<User, String> map) {
//        List<User> userList = new ArrayList<>(map.keySet());
//        Map<User, String> result = new TreeMap<>();
//        Collections.sort(userList, new CompareUserByName());
//        System.out.println(userList);
//        for (User element : userList) {
//            result.put(element, map.get(element));
//        }
//        return result;
//    }
}
