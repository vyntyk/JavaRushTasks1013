package com.javarush.task.task04.task0442;
/*
Суммирование
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int summa = 0;
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int num = Integer.parseInt(scan.readLine());
            summa += num;
            if (num == -1) {
                break;
            }

        }
        System.out.println(summa);
    }
}

