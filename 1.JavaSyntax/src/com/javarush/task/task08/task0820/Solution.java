package com.javarush.task.task08.task0820;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/*
Множество всех животных
*/
public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }
    public static Set <Cat> createCats(){
        HashSet <Cat> result = new HashSet<Cat>();
        //напишите тут ваш код
        for (int i = 0; i < 4; i++) {
            Cat cat = new Cat();
            result.add(cat);
        }
        return result;
    }
    public static Set<Dog> createDogs() {
        //напишите тут ваш код
        Set<Dog> result = new HashSet<Dog>();
        for (int i = 0; i < 3; i++) {
            Dog dog = new Dog();
            result.add(dog);
        }
        return result;
    }
    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш код
        Set<Object> pets = new HashSet<Object>();
        pets.addAll(cats);
        pets.addAll(dogs);

        return pets;
    }
    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код
        pets.removeAll(cats);
    }
    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        for (Iterator iterator = pets.iterator(); iterator.hasNext(); ) {
            System.out.println(iterator.next());
        }
    }
    //напишите тут ваш код
    public static class Cat{
    }
    public static class Dog {
    }

}
