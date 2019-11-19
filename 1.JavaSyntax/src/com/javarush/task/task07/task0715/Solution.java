package com.javarush.task.task07.task0715;

import java.util.ArrayList;
/*
Продолжаем мыть раму
*/
public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        String s = "именно";
        list.add("мама");
        list.add("мыла");
        list.add("раму");
        for (int i = 0; i < 6; i++){
            if ((i == 1)|(i == 3)|(i == 5))
                list.add(i, s);
            System.out.println(list.get(i));
        }
    }
}
