package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Переверни массив

Переверни массив
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Вывести на экран элементы массива в обратном порядке, каждое значение выводить с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list =  new int[10];

        for (int i = 0; i < list.length; i++){
            list[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 9; i >= 0; i--){
          System.out.println(list[i]);
        }
    }
}
/*  Ввод
1
23
4
5
6
7
9
0
8
6
    Вывод
6
8
0
9
7
6
5
4
23
1
*/
