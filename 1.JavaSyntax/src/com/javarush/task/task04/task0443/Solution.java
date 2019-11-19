package com.javarush.task.task04.task0443;
/*
Как назвали, так назвали
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String name = bf.readLine();
        String number2 = bf.readLine();
        String number3 = bf.readLine();
        String number4 = bf.readLine();
        int y = Integer.parseInt(number2);
        int m = Integer.parseInt(number3);
        int d = Integer.parseInt(number4);
        System.out.println("Меня зовут " +name+".");
        System.out.println("Я родился "+d+"."+m+"."+y);
    }
}
