package com.javarush.task.task07.task0702;

import java.util.Scanner;
/*
Массив из строчек в обратном порядке
*/
public class Solution {
    public static void main(String[] args) throws Exception {
        String [] arr = new String[10];
        Scanner sc = new Scanner(System.in);
        //напишите тут ваш код
        for (int i = 0; i <8; i++) {
            arr[i] = sc.nextLine();
        }
        for(int i = arr.length-1; i>=0; i--){
            System.out.println(arr[i]);
        }

    }
}