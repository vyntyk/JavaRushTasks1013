package com.javarush.task.task06.task0606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
Чётные и нечётные циферки
*/
public class Solution {
    public static int even;
    public static int odd;
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String S = buffer.readLine();

        int s = Integer.parseInt(S);
        int a = 0;
        int b = 0;
        for( int i = 0; i<S.length(); i ++){
            int d = s%10;
            int c =d%2;
            s = s/10;
            if(c==0){
                a++;
            } else b++;
        }
        even = a;
        odd = b;
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}

