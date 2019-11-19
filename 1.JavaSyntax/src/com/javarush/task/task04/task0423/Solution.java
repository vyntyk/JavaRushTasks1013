package com.javarush.task.task04.task0423;
/*
Фейс-контроль
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number1 = reader.readLine();
        String number2 = reader.readLine();
        int a = Integer.parseInt(number2);
        if (a > 20) {
            System.out.println("И 18-ти достаточно");
        }
        else if (a <= 20) {

        }
    }
}
