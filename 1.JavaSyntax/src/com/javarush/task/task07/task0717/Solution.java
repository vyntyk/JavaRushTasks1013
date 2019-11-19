package com.javarush.task.task07.task0717;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
/*
Удваиваем слова
*/
public class Solution {
    public static void main(String[] args) throws Exception {
        // Считать строки с консоли и объявить ArrayList list тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> result = doubleValues(list);
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s);
        }
        for (String x: result) {
            System.out.println(x);
            System.out.println(x);
        }
    }
    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        for (int i = 0; i < list.size();i++){
            list.add(i + 1, list.get(i));
            i++;
        }
        return list;
    }
}