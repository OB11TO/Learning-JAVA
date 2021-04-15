package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = "";
        s2 = s2 + s1.substring(0, 1).toUpperCase(); //делает 1 буку в новом списке заглавной

        //напишите тут ваш код
        for (int i = 1; i < s1.length(); i++){  // проходим по всему ссписку
            if(" ".equals(s1.substring(i-1, i))){  // проверяем на пробел
               s2 = s2 + s1.substring(i, i+1).toUpperCase();

            }
            else{
                s2 = s2 + s1.substring(i, i+1);
            }
        }
        System.out.println(s2);
    }
}
