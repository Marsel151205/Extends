package com.company;

public final class FightingDog extends Dog{
    private final int numberOfFight;

    public FightingDog(String name, int age, Color color, String[] commands, Shelter shelter, int numberOfFight) {
        super(name, age, color, commands, shelter);
        this.numberOfFight = numberOfFight;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nКоличество Боев: " + numberOfFight;
    }
}
