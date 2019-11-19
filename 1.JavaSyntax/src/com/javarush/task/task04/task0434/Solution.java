package com.javarush.task.task04.task0434;
/*
Таблица умножения
*/
public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int i = 1, y = 1;
        while (i<=10) {
            System.out.print(i + " ");
            while (y<10) {
                y++;
                System.out.print(i * y + " ");
            }
            i++;
            y=1;
            System.out.println(" ");
        }
    }
}