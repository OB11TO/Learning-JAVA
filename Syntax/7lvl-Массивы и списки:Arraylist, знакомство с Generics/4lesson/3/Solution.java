package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Общение одиноких массивов

1. Создать массив на 10 строк.
2. Создать массив на 10 чисел.
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.

Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] strings = new String[10];
        Integer[] num = new Integer[10];

        for(int i = 0; i < 10; i ++){
            strings[i] = reader.readLine(); //заполням массив строк
            num[i]  = strings[i].length(); // записываем длину массива строк
        }
        for (int i = 0; i <10; i++){
            System.out.println(num[i]);
        }

    }
}
/*  Ввод
qqwe
qweqwrqq
w
w
w
w
rqr
qr
qr
qr
    Вывод
4
8
1
1
1
1
3
2
2
2*/
