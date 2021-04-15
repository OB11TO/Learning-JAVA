package com.javarush.task.task02.task0204;

/*
О семейных отношениях

В методе main создай объект Man, сохрани ссылку на него в переменную man.
Создай также объект Woman и сохрани ссылку на него в переменную woman.

Подсказка: для создания объекта Woman и занесения его ссылки в переменную woman используй конструкцию:
ТипПеременной имяПеременной = new ТипСоздаваемогоОбъекта();
В man.wife сохрани ссылку на ранее созданный объект Woman.
В woman.husband сохрани ссылку на ранее созданный объект Man (подсказка: woman.husband = man;).
*/

public class Solution {
    public static void main(String[] args) {
        // создаем переменную woman типа Woman (Woman woman) и объект Woman
        // (new Woman()) и присваиваем переменной ссылку на объект
        Woman woman = new Woman();
        // создаем переменную man типа Man (Man man) и объект Man (new Man())
        // и присваиваем переменной ссылку на объект
        Man man = new Man();
        // в woman.husband сохраняем ссылку на ранее созданный объект Man
        woman.husband = man;
        // в man.wife сохраняем ссылку на ранее созданный объект Woman
        man.wife = woman;
    }

    // class Man
    public static class Man {
        // объявляем переменную age типа int
        public int age;
        // объявляем переменную height типа int
        public int height;
        // объявляем переменную wife типа Woman
        public Woman wife;
    }

    // class Woman
    public static class Woman {
        // объявляем переменную age типа int
        public int age;
        // объявляем переменную height типа int
        public int height;
        // объявляем переменную husband типа Man
        public Man husband;
    }
}
