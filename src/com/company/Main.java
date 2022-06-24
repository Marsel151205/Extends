package com.company;

public class Main {

    public static void main(String[] args) {
        Shelter shelter = new Shelter("Кожомбердиева");
        Dog objectA = new Dog("Путин", 3, Color.BLACK, new String[]{"Голос", "Сидеть"}, shelter);
        System.out.println(objectA.getInfo());
        objectA.dogSize(17);
        objectA.makeVoice("РГРРГРРГГГ");
        System.out.println("-------------------------------------------");

        Shelter shelter1 = new Shelter("Садовая");
        FightingDog objectB = new FightingDog("Рекс", 4, Color.WHITE,
                new String[]{"Фас", "Сидеть"},  shelter1, 5);
        System.out.println(objectB.getInfo());
        objectB.dogSize(25);
        objectB.makeVoice("ААААФФФФ");
        System.out.println("---------------------------------------------");

        Shelter shelter2 = new Shelter("Шопокова");
        FightingDog objectC = new FightingDog("Зеленский", 3,
                Color.GRAY, new String[]{"Фас", "Принеси"}, shelter2, 5);
        System.out.println(objectC.getInfo());
        objectC.dogSize(75);
        objectC.makeVoice("АВВВВВВ");
    }
}
