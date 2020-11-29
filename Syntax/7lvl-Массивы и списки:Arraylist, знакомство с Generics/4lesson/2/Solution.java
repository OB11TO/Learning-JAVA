package com.javarush.task.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Меняем функциональность
 Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
Потом программа строит новый список. Если в строке чётное число букв, строка удваивается, если нечётное - утраивается.
Программа выводит содержимое нового списка на экран.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //читаем из терминала

        ArrayList<String> strings = new ArrayList<>();
        while (true) {   //вводим
            String string = reader.readLine();
            if (string == null || string.isEmpty()) break; //получили null вышли
            strings.add(string);
        }

        ArrayList<String> resultStrings = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) { // проходимся по списку
            String string = strings.get(i);   //берем слово из списка
            String result; // слово для результата

            if(string.length() % 2 == 0){
                result = string + " " + string;
            } else {
                result = string + " " + string + " " + string;
            }
            resultStrings.add(result); // добавляем его в новый массив
        }

        for (int i = 0; i < resultStrings.size(); i++) {
            System.out.println(resultStrings.get(i));
        }
    }
}
