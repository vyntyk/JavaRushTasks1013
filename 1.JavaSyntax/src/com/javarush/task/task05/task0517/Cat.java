package com.javarush.task.task05.task0517;
/*
Конструируем котиков
*/
public class Cat {
    //напишите тут ваш код
    String name = null;
    int age = 2;
    int weight = 6;
    String address = null;
    String color = "black";

    public  Cat(String name){
        this.name = name;
        this.age=this.age;
        this.weight=this.weight;
        this.color=this.color;
    }
    public Cat(String name, int weight, int age){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color= this.color;
    }
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = this.weight;
        this.color=this.color;
    }
    public Cat(int weight, String color){
        this.age = this.age;
        this.weight = weight;
        this.color = color;
    }
    public Cat(int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address= address;
        this.age = this.age;
    }
    public static void main(String[] args) {

    }
}
