package com.javarush.task.task07.task0719;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
/*
Вывести числа в обратном порядке
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            Integer s = Integer.parseInt(reader.readLine());
            list.add(s);
        }
        for (int i = list.size()-1; i>=0; i--){
            System.out.println(list.get(i));
        }
    }
}
