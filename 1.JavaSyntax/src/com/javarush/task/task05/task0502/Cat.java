package com.javarush.task.task05.task0502;
/*
Реализовать метод fight
*/
public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }
    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        int count = 0;
        if (this.age > anotherCat.age)
            count++;
        else if (this.age < anotherCat.age)
            count--;
        if (this.weight > anotherCat.weight)
            count++;
        else if (this.weight < anotherCat.weight)
            count--;
        if (this.strength > anotherCat.strength)
            count++;
        else if (this.strength < anotherCat.strength)
            count--;
        return count > 0;
    }

    public static void main(String[] args) {

    }
}
