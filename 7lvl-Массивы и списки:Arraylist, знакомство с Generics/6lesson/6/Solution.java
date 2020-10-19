package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Самые-самые

1. Создай список строк.
2. Добавь в него 10 строчек с клавиатуры.
3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
Если таких строк несколько, то должны быть учтены самые первые из них.
4. Выведи на экран строку из п.3. Должна быть выведена одна строка.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String string = reader.readLine();
            strings.add(string);
        }
        //создаем 2 строки макс и мин
        String minSizeElement = strings.get(0);
        int posMinElement = 0;
        String maxSizeElement = strings.get(0);
        int posMaxElement = 0;
        for (int i = 0; i < 10; i++) { //проходимя по списку
            if (strings.get(i).length() < minSizeElement.length()) {  //если длина слова < мин длины слова, то записывам её
                minSizeElement = strings.get(i);
                posMinElement = i;
            } else if (strings.get(i).length() > maxSizeElement.length()) {
                maxSizeElement = strings.get(i);
                posMaxElement = i;
            }
        }

        if (posMinElement < posMaxElement) {
            System.out.println(minSizeElement);
        } else {
            System.out.println(maxSizeElement);
        }
    }
}
