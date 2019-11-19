package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/*
Только для богачей
*/
public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> map = new HashMap<>();
        map.put("Иванов", 250);
        map.put("Сидоров", 350);
        map.put("Петров", 450);
        map.put("Васечкин", 550);
        map.put("Пуговкин", 650);
        map.put("Семенов", 750);
        map.put("Круглов", 850);
        map.put("Бунин", 350);
        map.put("Трудов", 150);
        map.put("Ленивцев", 950);
        return map;
    }
    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Integer many = iterator.next().getValue();
            if (many < 500) {
                iterator.remove();
            }
        }
    }
    public static void main(String[] args) {
    }
}