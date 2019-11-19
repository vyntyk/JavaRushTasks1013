package com.javarush.task.task06.task0611;
class StringHelper {

        public void makeSound() {
            System.out.println("Grr...");
        }
    }
    class Cat extends StringHelper{
        public void makeSound() {
            System.out.println("Meow");
        }
    }
    class Program {
        public static void main(String [] args) {
            Cat c = new Cat();
            c.makeSound();
        }
    }
