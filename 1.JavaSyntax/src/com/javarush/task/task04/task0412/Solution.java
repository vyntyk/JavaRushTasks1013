package com.javarush.task.task04.task0412;
/*
Положительное и отрицательное число
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();
        int a = Integer.parseInt(number);
        if (a > 0){
            a = a * 2;
            System.out.println(a);
            return;
        }
        if(a < 0){
            a=a+1;
            System.out.println(a);
            return;
        }
        if (a == 0){
            a = 0;
            System.out.println(a);
            return;
        }

    }

}