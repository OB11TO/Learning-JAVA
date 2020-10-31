package com.javarush.task.task04.task0403;

/*
Как зовут кота?
Помогите коту обрести имя с помощью метода setName.

Требования:

*/

public class Cat {
    private String name = "безымянный кот";

    public void setName(String name) {
        //напишите тут ваш код
        this.name = name;

    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Жужик");
        System.out.println(cat.name);
    }
}
