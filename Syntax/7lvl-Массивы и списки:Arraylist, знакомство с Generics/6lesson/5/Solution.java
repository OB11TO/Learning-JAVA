package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Удалить и вставить
1. Создай список строк.
2. Добавь в него 5 строк с клавиатуры.
3. Выполни 13 раз: удалить последнюю строку и вставить её в начало.
4. Используя цикл выведи содержимое результирующего списка на экран, каждое значение с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();

        for(int i=0; i < 5; i++){
            strings.add(reader.readLine());
        }
        for(int i=0; i< 13; i++){
            String string = strings.remove(4);
            strings.add(0, string);
        }
        for(String strinng : strings){
            System.out.println(strinng);
        }
    }
}
/*
1
2
3
4
5
3
4
5
1
2

 */
