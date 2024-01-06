package javaProHomeworks.homework_18_12_23.task_seven;

import java.util.*;

public class TaskSeven {

    public static void main(String[] args) {

        String str = "Bla Bla bla s ff weq";


        System.out.println(uniqueWordsCounter(new TextAnalyzer() {
            @Override
            public int analyze(String str) {
                if (str.isEmpty() || str.isBlank()) {
                    return 0;
                }
                str = str.toUpperCase().replaceAll("\\p{Punct}", "");
                String[] arr = str.split(" ");
                if (arr.length == 1) {
                    return 1;
                }
                List<String> strings = new ArrayList<>(Arrays.asList(arr));
                Set<String> set = new HashSet<>(strings);
                int result = 0;
                for (String element : set) {
                    int counter = 0;
                    for (String word : strings) {
                        if (element.equals(word)) {
                            counter++;
                        }
                    }
                    if (counter == 1) {
                        result++;
                    }
                }

                return result;
            }
        }, str));
    }

    static int uniqueWordsCounter(TextAnalyzer textAnalyzer, String str) {
        return textAnalyzer.analyze(str);
    }
}
