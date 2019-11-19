package com.javarush.task.task03.task0303;
public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println(convertEurToUsd(63 , 1.5));
        System.out.print(convertEurToUsd(15 , 1.5));

    }

    public static double convertEurToUsd(int eur, double course) {
        //напишите тут ваш код
        double dollar = eur*course;
        return dollar;

    }
}