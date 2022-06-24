package com.company;

public class Animal {
    private String name;
    private int age;
    private Color color;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Color getColor() {
        return color;
    }

    public Animal(String name, int age, Color color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getInfo() {
        return "\nКличка: " + name + "\n Возраст: " + age + "\nЦвет: " + color;
    }
}
