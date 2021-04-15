package com.javarush.task.task04.task0437;

/*
Треугольник из восьмерок
8
88
888
8888
88888
888888
8888888
88888888
888888888
8888888888
*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print('8');
            }

            System.out.println();
        }
    }
}
