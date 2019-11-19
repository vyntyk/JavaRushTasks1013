package com.javarush.task.task06.task0609;
/*
Расстояние между двумя точками
*/
public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        //напишите тут ваш код
        double catet1 = x2 - x1;
        double catet2 = y2 - y1;
        double hypotenusa = (double) Math.sqrt((catet1 * catet1) + (catet2 * catet2));
        return hypotenusa;
    }

    public static void main(String[] args) {
        System.out.println(getDistance(8,5,15,9));
    }
}
