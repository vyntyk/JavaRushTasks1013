package com.javarush.task.task08.task0801;
/*
Set из растений
*/
import java.util.HashSet;
import java.util.Set;
public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Set<String> hash = new HashSet<>();
        hash.add("арбуз");
        hash.add("банан");
        hash.add("вишня");
        hash.add("груша");
        hash.add("дыня");
        hash.add("ежевика");
        hash.add("женьшень");
        hash.add("земляника");
        hash.add("ирис");
        hash.add("картофель");

        for (String text : hash) {
            System.out.println(text);
        }
    }
}
