package com.javarush.task.task06.task0614;
import java.util.ArrayList;
/*
Статические коты
*/
public class Cat {
    public static ArrayList<Cat> cats = new ArrayList<>(10);

    public Cat() {

    }


    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i = 0; i < 10; i++) cats.add(new Cat());
        printCats();
    }

    public static void printCats() {
        //напишите тут ваш код
        for (Cat cat: cats) {
            System.out.println(cat);
        }
    }
}