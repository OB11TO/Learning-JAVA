package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //ДЕДУШКА
        String dedrName = reader.readLine();
        Cat catDed = new Cat(dedrName);
        //БАБУШКА
        String babarName = reader.readLine();
        Cat catBaba = new Cat(babarName);
        //ОТЕЦ
        String otrName = reader.readLine();
        Cat catOt = new Cat(otrName, catDed, null);
        //MAMA
        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName,null, catBaba);
        //СЫН
        String sinrName = reader.readLine();
        Cat catSin = new Cat(sinrName,catOt,catMother);
        //ДОЧКА
        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName,catOt, catMother);

        System.out.println(catDed);
        System.out.println(catBaba);
        System.out.println(catOt);
        System.out.println(catMother);
        System.out.println(catSin);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat parent_one;
        private Cat parent_two;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parent_one) {
            this.name = name;
            this.parent_one = parent_one;
        }
        Cat(String name, Cat parent_one, Cat parent_two){
            this.name = name;
            this.parent_one = parent_one;
            this.parent_two = parent_two;
        }
        @Override
        public String toString() {
            if (parent_one == null && parent_two == null)
                return "The cat's name is " + name + ", no mother" + ", no father";
           else if (parent_one == null)
                return "The cat's name is " + name + ", mother is " + parent_two.name + ", no father";
            else if(parent_two == null)
                return "The cat's name is " + name + ", no mother" + ", father is " + parent_one.name;
            else
                return "The cat's name is " + name + ", mother is " + parent_two.name + ", father is " + parent_one.name;
        }
    }

}
