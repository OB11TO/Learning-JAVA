package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Улицы и дома

1. Создать массив на 15 целых чисел.
2. Ввести в него значения с клавиатуры.
3. Пускай индекс элемента массива является номером дома, а значение - числом жителей, проживающих в доме.
Дома с нечетными номерами расположены на одной стороне улицы, с четными - на другой. Выяснить, на какой стороне улицы проживает больше жителей.
4. Вывести на экран сообщение: "В домах с нечетными номерами проживает больше жителей." или "В домах с четными номерами проживает больше жителей."

i - nu
[i]- z
Примечание:
дом с порядковым номером 0 считать четным.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] num = new int[15];
        int max = 0;
        int min = 0;
        for(int i = 0; i < 15; i++){
            num[i] = Integer.parseInt(reader.readLine());
            if(i % 2 == 0){
                max = max + num[i];
            }else{
                min = min + num[i];
            }
        }
        if(max > min) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }
        else {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }

    }
}

/*  Ввод
4
1
4
1
4
1
4
1
4
1
4
1
4
1
4
    Вывод
В домах с четными номерами проживает больше жителей.
 */
