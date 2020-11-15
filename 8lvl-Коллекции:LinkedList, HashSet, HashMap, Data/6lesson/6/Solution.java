package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Cамая длинная последовательность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            list.add(Integer.parseInt(read.readLine()));
        }
        int vspomog = 1;
        int maximumElement = 1;

        for(int i = 0; i<9; i++){
            if(list.get(i).equals(list.get(i + 1))){
                maximumElement++;
            }else if(maximumElement > vspomog){
                vspomog = maximumElement;
                maximumElement = 1;

            }else{
                maximumElement = 1;
            }
        }

        if(maximumElement > vspomog){
            vspomog = maximumElement;
        }
        System.out.println(vspomog);



    }
}
