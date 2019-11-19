package com.javarush.task.task04.task0420;
/*
Сортировка трех чисел
*/

import java.util.Scanner;
public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        int max = Math.max(Math.max(x, y), z);
        int min = Math.min(Math.min(x, y),z);
        int mid = x + y + z - max - min;
        System.out.println(max+" "+mid+" "+ min);
    }
}