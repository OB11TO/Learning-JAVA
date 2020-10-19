package com.javarush.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
В начало списка

1. Создай список строк в методе main.
2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
3. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();
        String tmp;
        for(int i = 0; i < 10; i ++){
            tmp = in.readLine();
            strings.add(0, tmp); //авляет не в конец списка, а в начало
        }
        for(int i = 0; i<strings.size(); i++){
            System.out.println(strings.get(i));
        }

    }
}
/* ввод
11
22
3
4
5
6
7
8
9
2
  вывод
2
9
8
7
6
5
4
3
22
11
 */
