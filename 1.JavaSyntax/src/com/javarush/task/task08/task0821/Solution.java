package com.javarush.task.task08.task0821;
import java.util.HashMap;
import java.util.Map;
/*
Однофамильцы и тёзки
*/
public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }
    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("Иванов", "Иван");
        map.put("Сидоров", "Сидор");
        map.put("Петров", "Петр");
        map.put("Васечкин", "Вася");
        map.put("Иванов", "Леша");
        map.put("Семенов", "Сема");
        map.put("Круглов", "Гена");
        map.put("Бунин", "Иван");
        map.put("Трудов", "Иван");
        map.put("Ленивцев", "Герман");

        return map;
    }
    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
