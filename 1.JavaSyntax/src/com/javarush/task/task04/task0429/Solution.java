package com.javarush.task.task04.task0429;
/*
Положительные и отрицательные числа
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
        int a = Integer.parseInt(number1);
        int b = Integer.parseInt(number2);
        int c = Integer.parseInt(number3);
        int count1 = 0;
        int count2 = 0;
        if(a>0){
            count1++;
        }
        if (b>0){
            count1++;
        }
        if (c>0){
            count1++;
        }
        if(a<0){
            count2++;
        }
        if (b<0){
            count2++;
        }
        if (c<0){
            count2++;
        }
        System.out.println("количество отрицательных чисел: "+count2);
        System.out.println("количество положительных чисел: "+count1);
    }
}
