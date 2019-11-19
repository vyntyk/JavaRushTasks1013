package com.javarush.task.task07.task0724;
/*
Семейная перепись
*/
public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human grandpa = new Human("Борис", true, 60);
        Human grandpa1 = new Human("Вася", true, 61);
        Human grandma = new Human("Оля", false, 58);
        Human grandma1 = new Human("Катя", false, 58);
        Human father = new Human("Сергей", true, 38, grandpa, grandma);
        Human mother = new Human("Аня", false, 36, grandpa1, grandma1);
        Human son1 = new Human("Павел", true, 18, father, mother);
        Human son2 = new Human("Олег", true, 15, father, mother);
        Human son3 = new Human("Дима", true, 10, father, mother);

        System.out.println(grandpa);
        System.out.println(grandpa1);
        System.out.println(grandma);
        System.out.println(grandma1);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son1);
        System.out.println(son2);
        System.out.println(son3);
    }
    public static class Human {
        // напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }
        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;
            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }
            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }
            return text;
        }
    }
}