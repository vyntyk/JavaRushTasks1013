package com.javarush.task.task07.task0706;
import java.io.IOException;
import java.util.Scanner;
/*
Улицы и дома
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        int[] array = new int[15];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 15; i++) {
            array[i] = sc.nextInt();
        }
        int summa1 = 0;
        for (int i = 0; i < array.length; i = i + 2) {
            summa1 += array[i];
        }
        int summa2 = 0;
        for (int i = 1; i < array.length; i = i + 2) {
            summa2 += array[i];
        }
        if (summa1 > summa2) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        } else {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");

        }
    }
}
