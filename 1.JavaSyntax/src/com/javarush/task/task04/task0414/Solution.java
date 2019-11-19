package com.javarush.task.task04.task0414;
/*
Количество дней в году
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();
        int god = Integer.parseInt(number);
        int vis = 366;
        int nevis = 365;
        if (god % 400 == 0) {
            System.out.println("количество дней в году: " + vis);
        } else if (god % 100 == 0) {
            System.out.println("количество дней в году: " + nevis);
        } else if (god % 4 == 0) {
            System.out.println("количество дней в году: " + vis);
        } else {
            System.out.println("количество дней в году: " + nevis);
        }
    }
}

