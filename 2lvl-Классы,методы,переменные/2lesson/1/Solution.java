package com.javarush.task.task02.task0202;

/*
Откуда берутся Person?
В классе Person объяви следующие переменные: name типа String, age типа int, weight типа int, money типа int.
В методе main создай объект Person, занеси его ссылку в переменную person.

Подсказка: для создания объекта Person и занесения его ссылки в переменную person используй конструкцию:
ТипПеременной имяПеременной = new ТипСоздаваемогоОбъекта();
*/

public class Solution {
    public static void main(String[] args) {
        // создаем переменную person типа Person (Person person) и объект
        // Person (new Person()) и присваиваем переменной ссылку на объект
        Person person = new Person();
    }

    // класс Person
    public static class Person {
        // объявляем переменную name типа String
        String name;
        // объявляем переменную age типа int
        int age;
        // объявляем переменную weight типа int
        int weight;
        // объявляем переменную money типа int
        int money;
    }
}
