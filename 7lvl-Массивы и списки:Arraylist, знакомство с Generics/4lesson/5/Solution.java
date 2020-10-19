package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = new int[20];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = Integer.parseInt(reader.readLine());//вводим массив и парсим в int
        }
        int[] num_one = new int[10];
        int[] num_two = new int[10];

        for(int i = 0; i < 10; i ++){
            num_one[i] = numbers[i]; // вводим первым массив от 1 до 10
            num_two[i] = numbers[i + 10];  // вводим второй массив от 10 до 20
        }
        for(int i = 0; i < 10; i ++){
            System.out.println(num_two[i]);
        }
    }

}


/*  Ввод
1
2
3
4
5
6
7
8
9
10
1
12
13
14
15
16
17
18
19
20
    Вывод
1
12
13
14
15
16
17
18
19
20
 */
