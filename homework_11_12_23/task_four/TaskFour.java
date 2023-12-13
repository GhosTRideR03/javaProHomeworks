package javaProHomeworks.homework_11_12_23.task_four;

import java.util.HashMap;
import java.util.Map;

public class TaskFour {

    public static void main(String[] args) {

        //Инвертировать мапу (ключи становятся значениями и наоборот).
    }

    Map<String, String> invertMap(Map<String, String> map) {
        Map<String, String> result = new HashMap<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (!result.containsKey(entry.getValue())) {
                result.put(entry.getValue(), entry.getKey());
            } else {
                String temp = entry.getValue();
                temp += " dublicated";
                result.put(temp, entry.getKey());
            }
        }
        return result;
    }
}
