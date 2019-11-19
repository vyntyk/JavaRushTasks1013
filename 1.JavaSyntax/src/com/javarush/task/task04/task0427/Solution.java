package com.javarush.task.task04.task0427;
/*
Описываем числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String number1 = bf.readLine();
        int a = Integer.parseInt(number1);
        if (a < 1 || a >=1000){
        }
        else if((a <=9)&&(a % 2 == 0)) {
            System.out.println("четное однозначное число");
        }else if((a <=9)&&(a % 2 != 0)){
            System.out.println("нечетное однозначное число");
        }else if ((a>9) &&(a <= 99)&&(a % 2 == 0)) {
            System.out.println("четное двузначное число");
        }else if ((a>9) &&(a <= 99)&&(a % 2 != 0)) {
            System.out.println("нечетное двузначное число");
        }else if ((a>99)&&(a<=999)&&(a % 2 == 0)) {
            System.out.println("четное трехзначное число");
        }else if ((a>99)&&(a<=999)&&(a % 2 != 0)){
            System.out.println("нечетное трехзначное число");
        }
    }
}
