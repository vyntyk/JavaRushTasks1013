package com.javarush.task.task05.task0522;
/*
Максимум конструкторов
*/
public class Circle {
    public double x;
    public double y;
    public double radius;

    //напишите тут ваш код
    public Circle (double x){
        this.x = x;
        this.y = 2;
        this.radius = 10.0;
    }

    public Circle (double x, double y, double radius){
        this.x = 0;
        this.y = 0;
        this.radius = radius;
    }
    public Circle (double y, double radius){
        this.x = 0;
        this.y = y;
        this.radius = radius;
    }
    public Circle (){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public static void main(String[] args) {

    }
}