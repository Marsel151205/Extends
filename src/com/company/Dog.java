package com.company;

import java.util.Arrays;

public class Dog extends Animal {
    private String[] commands;
    private Shelter shelter;

    public Dog(String name, int age, Color color, String[] commands, Shelter shelter) {
        super(name, age, color);
        this.commands = commands;
        this.shelter = shelter;
    }

    public void makeVoice(String voice) {
        System.out.println("Голоc: " + voice);
    }

    public void dogSize(int dogSize) {
        System.out.println("Размер Собаки: " + dogSize);
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nКоманды: " + Arrays.toString(commands) + "\nПриют: " + shelter.getAddress();
    }
}
