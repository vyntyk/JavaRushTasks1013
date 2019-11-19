package com.javarush.task.task07.task0712;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
/*
Самые-самые
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>(10);
        for (int i = 0; i<10; i++) {
            String s = reader.readLine();
            list.add(s);
        }
        String maxName = list.get(0);
        int max = list.get(0).length();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > max) {
                max = list.get(i).length();
                maxName = list.get(i);
            }
        }

        String minName = list.get(0);
        int min = list.get(0).length();

        for (int i = 0; i < list.size(); i++) {
            if (min > list.get(i).length()) {
                min = list.get(i).length();
                minName = list.get(i);
            }
        }
        if (list.indexOf(maxName) <list.indexOf(minName)) {
            System.out.println(maxName);
        }
        if (list.indexOf(maxName) > list.indexOf(minName)) {
            System.out.println(minName);
        }
    }
}