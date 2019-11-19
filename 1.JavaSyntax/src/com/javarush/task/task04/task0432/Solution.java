package com.javarush.task.task04.task0432;
/*
Хорошего много не бывает
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
        int i = 0;
        while (i<a){
            System.out.println(number1);
            i++;
        }
    }
}
