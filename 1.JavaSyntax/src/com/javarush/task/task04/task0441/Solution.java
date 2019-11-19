package com.javarush.task.task04.task0441;
/*
Как-то средненько
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String number1 = bf.readLine();
        String number2 = bf.readLine();
        String number3 = bf.readLine();
        int a = Integer.parseInt(number1);
        int b = Integer.parseInt(number2);
        int c = Integer.parseInt(number3);

        if ((a > b && b > c)||(a < b && b < c)) {
            System.out.println(b);
        } else if ((a > c && c > b)||(a < c && c < b)){
            System.out.println(c);
        } else if ((b >a && a > c) || (b <a && a < c)){
            System.out.println(a);
        } else if (a == b && b == c) {
            System.out.println(b);
        } else if (a == c && b!=c) {
            System.out.println(c);
        } else  if(b==c && a!=c){
            System.out.println(b);
        } else if (a==b && a!=c){
            System.out.println(a);
        }

    }
}