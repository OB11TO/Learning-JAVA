package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/*
Самая длинная строка

1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        strings = new ArrayList<String>();

        Scanner sc = new Scanner(System.in);

        int str_max = 0;
        String tmp;
        int tmp_len;

        for(int i = 0; i<5; i++){
            tmp = sc.nextLine();
            tmp_len = tmp.length();

            if(tmp_len > str_max)
                str_max = tmp_len;

            strings.add(tmp);
        }

        for(int i = 0; i<strings.size(); i++){
            if(strings.get(i).length == str_max)
                System.out.println(strings.get(i));
        }

    }
}
