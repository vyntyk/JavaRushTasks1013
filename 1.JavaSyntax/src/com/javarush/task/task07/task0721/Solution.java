package com.javarush.task.task07.task0721;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
Минимаксы в массивах
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum;
        int minimum;
        //напишите тут ваш код
        int[] archiv = new int[20];
        for (int i = 0; i < 20; i++) {
            archiv [i] = Integer.parseInt(reader.readLine());
        }
        maximum = archiv[0];
        minimum = archiv[0];
        for (int i=0;i<archiv.length;i++){
            if (archiv[i] > maximum){
                maximum = archiv[i];
            }if (archiv[i] < minimum){
                minimum = archiv[i];
            }
        }
        System.out.print(maximum + " " + minimum);
    }
}
