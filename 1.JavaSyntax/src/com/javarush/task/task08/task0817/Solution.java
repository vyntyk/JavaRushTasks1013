package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* 
Нам повторы не нужны
*/
public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map =new HashMap<>();
        map.put("Иванов", "Иван");
        map.put("Васин", "Иван");
        map.put("Кузькин", "Петр");
        map.put("Петров", "Петр");
        map.put("Сидоров", "Сидр");
        map.put("Прутков", "Кузьма");
        map.put("Толстый", "Алексей");
        map.put("Тонкий", "Лев");
        map.put("Пушкин", "Михаил");
        map.put("Кукушкин", "Сергей");
        return map;
    }
    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        List valueList = new ArrayList(map.values());
        for(int i=0; i<valueList.size()-1; i++) {
            for(int j = i+1; j < valueList.size(); j++) {
                if (valueList.get(i).equals(valueList.get(j))) {
                    removeItemFromMapByValue(map, (String) valueList.get(i));
                }
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }
    public static void main(String[] args) {
    }
}
