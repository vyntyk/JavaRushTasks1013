package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number1 = reader.readLine();
        String number2 = reader.readLine();
        
        int a = Integer.parseInt(number1);
        int b = Integer.parseInt(number2);
        
        if(a<b){
            System.out.println(a);
        }
        if(a>b){
            System.out.println(b);

        }
        if(a==b) {
            System.out.println(b);
        }

    }
}