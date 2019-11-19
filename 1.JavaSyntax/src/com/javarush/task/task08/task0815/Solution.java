package com.javarush.task.task08.task0815;
import java.util.HashMap;
import java.util.Map;
/*
Перепись населения
*/
public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("Иванов", "Иван");
        map.put("Сидоров", "Сидор");
        map.put("Петров", "Петр");
        map.put("Васечкин", "Вася");
        map.put("Пуговкин", "Леша");
        map.put("Семенов", "Сема");
        map.put("Круглов", "Гена");
        map.put("Бунин", "Коля");
        map.put("Трудов", "Сева");
        map.put("Ленивцев", "Герман");
        return map;
    }
    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;
        for (String s : map.values()) {
            if (s.equals(name)) {
                count += 1;
            }
        }
        return count;
    }
    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        int count =0;
        for (String s : map.keySet()) {
            if (s.equals(lastName)) {
                count += 1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
    }
}
