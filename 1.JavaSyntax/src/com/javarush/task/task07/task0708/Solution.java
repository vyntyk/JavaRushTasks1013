package com.javarush.task.task07.task0708;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
/*
Самая длинная строка
*/
public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        strings = new ArrayList<String>(5);
        ArrayList<Object> string = new ArrayList<>(5);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            strings.add(s);
        }
        int max = strings.get(0).length();
        for (int i = 0; i < strings.size(); i++) {
            if (max < strings.get(i).length()) {
                max = strings.get(i).length();
            }
        }
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() == max) {
                System.out.println(strings.get(i));
            }
        }
    }
}