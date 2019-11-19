package com.javarush.task.task04.task0416;
/*
Переходим дорогу вслепую
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number1 = reader.readLine();
        double t = Double.parseDouble(number1);
        double b = t % 5;
        if (b>=0 && b<3){System.out.println("зелёный");}
        else if (b>=3 && b<4) {System.out.println("жёлтый");}
        else if (b>=4 && b<5) {System.out.println("красный");}
    }
}