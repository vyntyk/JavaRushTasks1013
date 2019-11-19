package com.javarush.task.task03.task0318;
/*
План по захвату мира
*/
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        //System.out.println("число");
        String sAge = bufferedReader.readLine();
        //System.out.println("Имя");
        String name = bufferedReader.readLine();
        int nAge = Integer.parseInt(sAge);
        System.out.println(name+ " " + "захватит мир через"+ " " + nAge +" "+ "лет. Му-ха-ха!");
    }
}
