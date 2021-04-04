package com.ifmo.homework.work8;

import com.ifmo.homework.work8.utils.Randoms;

import static com.ifmo.homework.work8.HomeAnimal.getHomeAnimal;

public class WildAnimal{
    private static String name;
    protected final int weight;
    protected final int speed;
    protected final int force;

    public WildAnimal(String name, int weight, int speed, int force) {
        this.name = name;
        this.weight = weight;
        this.speed = speed;
        this.force = force;
    }

//    А должны быть одинаковые дикие животные? Или 2 волка и 1 медведь? Или 5 медведей?
    public static WildAnimal getWildAnimal() {
        String[] types = {"wolf", "bear", "fox"};
        WildAnimal animal=null;
        switch (types[Randoms.getRandomInt(types.length)]){
            case "wolf":
                animal = new Wolf(
                        name = "Grey",
                        Randoms.getRandomInt(10, 15),
                        Randoms.getRandomInt(10, 30),
                        Randoms.getRandomInt(3, 7)
                        );
                break;

            case "bear":
                animal = new Bear(
                        name = "Brown",
                        Randoms.getRandomInt(20, 30),
                        Randoms.getRandomInt(5, 15),
                        Randoms.getRandomInt(5, 13)
                        );
                break;

            case "fox":
                animal = new Fox(
                        name = "Orange",
                        Randoms.getRandomInt(5, 12),
                        Randoms.getRandomInt(20, 30),
                        Randoms.getRandomInt(1, 4)
                        );
                break;
        }
        return animal;
    }

    public static String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getSpeed() {
        return speed;
    }

    public int getForce() {
        return force;
    }



}
