package com.javarush.task.task03.task0308;
/*
Произведение 10 чисел
*/
public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int [] myMassiv = {1,2,3,4,5,6,7,8,9,10};
        int s = 1;
        for(int i=0; i<myMassiv.length; i++) {
            s*= myMassiv[i];
        }
        System.out.println(s);
    }
}
