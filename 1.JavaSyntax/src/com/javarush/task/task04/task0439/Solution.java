package com.javarush.task.task04.task0439;
/*
Письмо счастья
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String imya = bf.readLine();
        for (int i = 0; i <10; i++) {
            System.out.println(imya+" любит меня.");
        }
    }
}
