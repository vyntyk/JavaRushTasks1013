package com.javarush.task.task04.task0419;
/*
Максимум четырех чисел
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number1 = reader.readLine();
        String number2 = reader.readLine();
        String number3 = reader.readLine();
        String number4 = reader.readLine();

        int a = Integer.parseInt(number1);
        int b = Integer.parseInt(number2);
        int c = Integer.parseInt(number3);
        int d = Integer.parseInt(number4);
        int max = Math.max(Math.max(a,b),c);
        int max2 = Math.max(max,d);

        System.out.println(max2);
    }
}
