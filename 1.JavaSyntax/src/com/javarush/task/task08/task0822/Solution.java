package com.javarush.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
Минимальное из N чисел
*/
public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }
    public static int getMinimum(List<Integer> array) {
        // Найти минимум тут
        return Collections.min(array);
    }
    public static List<Integer> getIntegerList() throws IOException {
        // Создать и заполнить список тут
        List<Integer> array = new ArrayList<>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Integer s = Integer.valueOf(bf.readLine());

        for (int i = 0; i < s; i++) {
            BufferedReader bf2 = new BufferedReader(new InputStreamReader(System.in));
            Integer b = Integer.valueOf(bf.readLine());
            array.add(b);
        }
        return array;
    }
}