package com.javarush.task.task06.task0610;

import java.util.Scanner;
/*
Класс ConsoleReader
*/
public class ConsoleReader {
    public static String readString() throws Exception {
        //напишите тут ваш код
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();
        return S;
    }

    public static int readInt() throws Exception {
        //напишите тут ваш код
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        return num;
    }

    public static double readDouble() throws Exception {
        //напишите тут ваш код
        Scanner in = new Scanner(System.in);
        double num2 = in.nextDouble();
        return num2;
    }

    public static boolean readBoolean() throws Exception {
        //напишите тут ваш код
        Scanner in = new Scanner(System.in);
        boolean num3 = in.nextBoolean();
        return num3;
    }

    public static void main(String[] args) throws Exception {

    }
}
