package com.javarush.task.task08.task0809;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
/*
Время для 10 тысяч вставок
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getInsertTimeInMs(new ArrayList()));
        System.out.println(getInsertTimeInMs(new LinkedList()));
    }
    public static long getInsertTimeInMs(List list) {
        // напишите тут ваш код
        Date newDate1 = new Date();
        insert10000(list);
        Date newDate2 = new Date();
        long time = newDate2.getTime()-newDate1.getTime();
        return time;
        // напишите тут ваш код
    }
    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++){
            list.add(0, new Object());
        }
    }
}
