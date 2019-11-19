package com.javarush.task.task03.task0307;
/*
Привет StarCraft!
*/
public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Zerg zerg1 = new Zerg();
        Zerg zerg2 = new Zerg();
        Zerg zerg3 = new Zerg();
        Zerg zerg4 = new Zerg();
        Zerg zerg5 = new Zerg();

        zerg1.name = "Quin";
        zerg2.name = "Wert";
        zerg3.name = "Erty";
        zerg4.name = "Tyui";
        zerg5.name = "UpandGo";

        Protoss protoss1 = new Protoss();
        Protoss protoss2 = new Protoss();
        Protoss protoss3 = new Protoss();

        protoss1.name = "Asde";
        protoss2.name = "Sderty";
        protoss3.name = "Fertyl";

        Terran terran1 = new Terran();
        Terran terran2 = new Terran();
        Terran terran3 = new Terran();
        Terran terran4 = new Terran();

        terran1.name = "Seryy";
        terran2.name = "Belyy";
        terran3.name = "Chotry";
        terran4.name = "Ghost";
        }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
