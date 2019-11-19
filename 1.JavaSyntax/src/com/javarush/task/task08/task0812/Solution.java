package com.javarush.task.task08.task0812;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Scanner sc = new Scanner (System.in);
        List<Integer> list = new ArrayList<>(10);
        for (int i=0; i<10; i++) {
            list.add(sc.nextInt());
        }
        int max = 1;
        for (int i = 0; i < 10; i ++){
            int count = 1;
            for (int f = i; f <9; f = f+1 ){
                if (list.get(f).equals(list.get(f + 1))){
                    count ++;
                }
                if (!list.get(f).equals(list.get(f + 1))){
                    count =1;
                }
                if (count > max){
                    max = count;
                }
            }
        }
        System.out.println(max);
    }
}