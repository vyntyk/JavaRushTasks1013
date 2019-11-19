package com.javarush.task.task07.task0713;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
/*
Играем в Jолушку
*/
public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list1 = new ArrayList<>(20);
        ArrayList<Integer> list2 = new ArrayList<>(20);
        ArrayList<Integer> list3 = new ArrayList<>(20);
        ArrayList<Integer> list4 = new ArrayList<>(20);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            Integer s = Integer.parseInt(reader.readLine());
            list1.add(s);
        }
        for (int i = 0; i < 20; i++) {
            if (list1.get(i) % 3 == 0 && list1.get(i) % 2 == 0) {
                list2.add(list1.get(i));
                list3.add(list1.get(i));
            } else if (list1.get(i) % 3 == 0) {
                list2.add(list1.get(i));
            } else if (list1.get(i) % 2 == 0) {
                    list3.add(list1.get(i));
            } else {
                list4.add(list1.get(i));

            }
        }
            printList(list2);
            printList(list3);
            printList(list4);
        }
    public static void printList(ArrayList<Integer> list){
        //напишите тут ваш код
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
