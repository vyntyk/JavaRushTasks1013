package com.javarush.task.task07.task0705;
import java.util.Scanner;
/*
Один большой массив и два маленьких
*/
public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] array = new int[20];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            array[i] = sc.nextInt();
        }
        int[] array2 = new int[10];
        int[] array3 = new int[10];

        for (int q = 0; q <10; q++) {
            array2[q] = array[q];
        }
        for (int t = 0; t <10; t++) {
            array3[t] = array[t+10];

        }
        for (int i = 0; i < 10; i++) {
            System.out.println(array3[i]);
        }

    }

}
