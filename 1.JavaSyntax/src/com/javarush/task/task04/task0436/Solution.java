package com.javarush.task.task04.task0436;
/*
Рисуем прямоугольник
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String number1 = bf.readLine();
        String number2 = bf.readLine();
        int m = Integer.parseInt(number1);
        int n = Integer.parseInt(number2);
        for ( int i=0; i < m; i++){
            for (int y=0; y < n ; y++){
                System.out.print("8");
            }
            int y=0;
            System.out.println("");

        }

    }
}
