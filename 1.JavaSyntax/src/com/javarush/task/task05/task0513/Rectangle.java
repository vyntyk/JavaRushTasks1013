package com.javarush.task.task05.task0513;
/*
Собираем прямоугольник
*/
public class Rectangle {
    //напишите тут ваш код
    int top;
    int left;
    int width;
    int height;

    public void initialize (int top, int width, int height, int left) {
        this.top = top;
        this.width = width;
        this.height = height;
        this.left = left;
    }

    public void initialize (int top, int left) {
        this.top = top;
        this.left = left;
        this.width = 0;
        this.height = 0;

    }

    public void initialize (int top, int width, int left) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = width;

    }

    public void initialize(Rectangle rectangle) {
        this.top = rectangle.top;
        this.left = rectangle.left;
        this.width = rectangle.width;
        this.height = rectangle.height;
    }

    public static void main(String[] args) {

    }
}
