package com.javarush.task.task09.task0905;

/*
Там, в синих глубинах стек-трейса…
*/

public class Solution {
    public static void main(String[] args) {
        int deep = getStackTraceDepth();
    }

    public static int getStackTraceDepth() {
        //напишите тут ваш код
         StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
         int result = stackTraceElements.length;
        System.out.println(result);
        return result;
    }
}
