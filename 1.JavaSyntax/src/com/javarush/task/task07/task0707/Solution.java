package com.javarush.task.task07.task0707;
import java.util.ArrayList;
/*
Что за список такой?
*/
public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>(5);
        for(int i = 0; i<5; i++){
            list.add("s");
        }
        int n = list.size();
        System.out.println(n);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
