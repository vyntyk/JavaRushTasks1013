package com.javarush.task.task04.task0421;
/*
Настя или Настя?
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String x= reader.readLine();
        String y = reader.readLine();
        if(x.equals(y)){
            System.out.println("Имена идентичны");
        }
        if (x.equals(y)==false && x.length() ==y.length()){
            System.out.println("Длины имен равны");
        }
        if (x.equals(y)==false && x.length() !=y.length()){

        }

    }
}
