package com.javarush.task.task07.task0703;
import java.util.Scanner;
/*
Общение одиноких массивов
*/
public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] array1= new int[10];
        String [] array2 = new String[10];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <=9; i++){
            array2[i] = sc.nextLine();
        }
        for (int i =10; i<19;i++){
            array1[i]=array2[i].length();
            System.out.println(array1[i]);
        }
    }
}
