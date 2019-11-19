package com.javarush.task.task04.task0428;
/*
Положительное число
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
        int count = 0;
        if(a>0){
            count++;
                    }
        if (b>0){
            count++;
        }
        if (c>0){
            count++;
        }
        System.out.println(count);
    }
}
