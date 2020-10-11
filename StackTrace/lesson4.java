package com.javarush.task.task09.task0906;

/*
Логирование стек трейса
Реализовать метод log.
Он должен выводить на экран имя класса и имя метода (в котором вызывается метод log), а также переданное сообщение.
Имя класса, имя метода и сообщение разделить двоеточием с пробелом.
*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        String a = Thread.currentThread().getStackTrace()[2].getClassName();
        String b = Thread.currentThread().getStackTrace()[2].getMethodName();
        System.out.println(a + ": " + b + ": " + s ); //напишите тут ваш код
    }
}
