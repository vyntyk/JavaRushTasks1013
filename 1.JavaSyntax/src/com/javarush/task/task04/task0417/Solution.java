package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
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

        if((a==b)&&(b==c)){
            System.out.print(a + " "+ b + " " + c+" " );
        } if((a==b)&&(a!=c)){
            System.out.println(a+ " " +b);
        }if((a==c)&&(a!=b)){
            System.out.print(a+ " " +c);
        }if((b==c)&&(b!=a))
            System.out.print(b+ " " +c);
    }
}
