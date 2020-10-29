package com.javarush.task.task01.task0130;

/*
Наш первый конвертер!
Метод convertCelsiusToFahrenheit(int celsius) принимает значение в градусах Цельсия. Метод должен переводить температуру и возвращать значение в градусах Фаренгейта.
Температура по Цельсию TC и температура по Фаренгейту TF связаны следующим соотношением:
TF = (9 / 5) * TC + 32
*/

public class Solution {
    public static void main(String[] args) {
        // выводим на экран значение - результат вызова метода
        // convertCelsiusToFahrenheit со значением аргумента 41
        System.out.println(convertCelsiusToFahrenheit(41));
    }

    // метод convertCelsiusToFahrenheit принимает в качестве аргумента celsius
    // значение температуры в градусах Цельсия, переводит в градусы Фаренгейта
    // и возвращает это значение в качестве результата
    public static double convertCelsiusToFahrenheit(int celsius) {
        // объявляем переменную fahrenheit типа double и присваиваем ей значение -
        // результат вычисления выражения 9 / 5.0 * celsius + 32
        double fahrenheit = 9 / 5.0 * celsius + 32;
        // возращаем значение переменной fahrenheit как результат работы метода
        return fahrenheit;
    }
}
