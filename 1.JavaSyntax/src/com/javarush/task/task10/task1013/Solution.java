package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private String name;
        private String wes;
        private int age;
        private boolean dety;
        private String sex;
        private String hare;

        public Human() {//1
        }

        public Human(String hare, boolean dety) {//2
            this.hare = hare;
            this.dety = dety;
        }

        public Human(String name, String wes) {//3
            this.name = name;
            this.wes = wes;
        }

        public Human(int age) {//4
            this.age = age;
        }

        public Human(boolean dety) {//5
            this.dety = dety;
        }

        public Human(String name, String wes, int age) {//6
            this.name = name;
            this.wes = wes;
            this.age = age;
        }

        public Human(String name, String wes, int age, boolean dety) {//7
            this.name = name;
            this.wes = wes;
            this.age = age;
            this.dety = dety;
        }

        public Human(String name, String sex, int age, boolean dety, String hare) {//8
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.dety = dety;
            this.hare = hare;
        }

        public Human(int age, String hare) {//9
            this.age = age;
            this.hare = hare;
        }

        public Human(String name) {//10
            this.name = name;
        }
    }
}
