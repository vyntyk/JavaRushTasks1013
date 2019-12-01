package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
/*
Метод в try..catch
*/
public class Solution {
    public static void main(String[] args) throws Exception{
        readData();
    }
    public static void readData() {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        try {
            while (true) {
                int chislo = Integer.parseInt(reader.readLine());
                list.add(chislo);
            }
        } catch (Exception e) {
            for (int chisla : list) {
                System.out.println(chisla);
            }
        }
    }
}
