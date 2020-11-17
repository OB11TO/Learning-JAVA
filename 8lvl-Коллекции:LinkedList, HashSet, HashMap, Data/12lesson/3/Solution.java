package com.javarush.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        // Найти минимум тут
        List<Integer> list = new ArrayList<>(array);
        int min = list.get(0);
        for(Integer i : list){
            if(min > i){
                min = i;
            }
        }
        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {
        // Создать и заполнить список тут
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list  = new ArrayList<>();
        int n = Integer.parseInt(read.readLine());

        for(int i = 0; i < n; i++){
            String string = read.readLine();
            list.add(Integer.parseInt(string));
        }

        return list;
    }
}
