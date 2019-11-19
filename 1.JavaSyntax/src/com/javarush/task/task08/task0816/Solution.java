package com.javarush.task.task08.task0816;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
/*
Добрая Зинаида и летние каникулы
*/
public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Сталин", dateFormat.parse("JUNE 1 1980"));
        map.put("Батистута", dateFormat.parse("JUNE 1 1980"));
        map.put("Матиз", dateFormat.parse("SEPTEMBER 1 1980"));
        map.put("Борис", dateFormat.parse("FEBRUARY 1 1980"));
        map.put("Новел", dateFormat.parse("MARCH 1 1980"));
        map.put("Виолла", dateFormat.parse("MAY 1 1980"));
        map.put("Шокин", dateFormat.parse("MAY 1 1980"));
        map.put("Феликс", dateFormat.parse("JUNE 1 1980"));
        map.put("Эдмунд", dateFormat.parse("JUNE 1 1980"));
        return map;
        //напишите тут ваш код
    }
    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            int month = iterator.next().getValue().getMonth() + 1;
            if (6 <= month && month <= 8) {
                iterator.remove();
            }
        }
    }
    public static void main(String[] args) {
    }
}
