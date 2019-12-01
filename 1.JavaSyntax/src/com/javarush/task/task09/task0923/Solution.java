package com.javarush.task.task09.task0923;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
/*
Гласные и согласные
*/
public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char [] charArray = s.toCharArray();

        ArrayList <Character> listCharVowels = new ArrayList<Character>();
        ArrayList <Character> listCharNonVowels = new ArrayList <Character>();

        for (int i=0; i < charArray.length; i++){
            if (isVowel(charArray[i])){
                listCharVowels.add(charArray[i]);
            }else if (charArray [i] == ' '){
                continue;
            }else{
                listCharNonVowels.add(charArray[i]);
            }
        }
        for (char c : listCharVowels){
            System.out.print(c + " ");
        }
        System.out.println();

        for (char c : listCharNonVowels) {
            System.out.print(c + " ");
        }
    }
    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}