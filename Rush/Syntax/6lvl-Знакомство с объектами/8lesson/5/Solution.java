package com.javarush.task.task06.task0611;

/*
Класс StringHelper


Сделать класс StringHelper, у которого будут 2 статических метода:
String multiply(String s, int count) - возвращает строку повторенную count раз.
String multiply(String s) - возвращает строку повторенную 5 раз.

Пример:
Амиго -> АмигоАмигоАмигоАмигоАмиго

*/

public class StringHelper {
    public static String multiply(String text) {
        return multiply(text,5);
    }

    public static String multiply(String text, int count) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < count; i++) {
            stringBuilder.append(text);
        }
         //напишите тут ваш код
        return stringBuilder.toString();
    }

    public static void main(String[] args) {

    }
}
