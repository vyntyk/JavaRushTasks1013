package com.javarush.task.task06.task0622;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/*
Числа по возрастанию
*/
public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //напишите тут ваш код
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i <5; i++) {
            nums.add(sc.nextInt());
        }
        Collections.sort(nums);
        for (int i : nums) {
            System.out.println(i);
        }
    }
}
