package com.ifmo.homework.work8;
import com.ifmo.homework.work8.utils.Randoms;

import static com.ifmo.homework.work8.Settings.UP_HEALTH;

public class HomeAnimal implements EatAnimalAble{
    protected final int weight;
    protected final int speed;
    protected int healthScore;
    protected final int maxHealthScore;
    protected static boolean flag;
    protected final int resource;

    public HomeAnimal(int weight, int speed, int healthScore, boolean flag, int resource) {
        this.weight = weight;
        this.speed = speed;
        this.healthScore = healthScore;
        this.maxHealthScore = healthScore;
        this.flag = flag;
        this.resource = resource;
    }

    public boolean isFarm() {
        return healthScore > 0;
    }

    public void plusHealth() {
        this.healthScore = UP_HEALTH + healthScore >= maxHealthScore ? maxHealthScore : UP_HEALTH + healthScore;
    }

    public void minusHealth(int count) {
        this.healthScore = healthScore - count <= 0 ? 0 : healthScore - count;
    }

    public static HomeAnimal getHomeAnimal() {
        String[] types = {"cat", "cow", "rabbit", "chicken"};
        HomeAnimal animal=null;
        switch (types[Randoms.getRandomInt(types.length)]){
            case "cat":
                animal = new Cat(
                        Randoms.getRandomInt(2, 5),
                        Randoms.getRandomInt(10, 30),
                        Randoms.getRandomInt(10, 15),
                        flag=false,
                        0);
                break;

            case "cow":
                animal = new Cow(
                        Randoms.getRandomInt(10, 20),
                        Randoms.getRandomInt(3, 10),
                        Randoms.getRandomInt(20, 30),
                        flag=true,
                        Randoms.getRandomInt(1, 3));
                break;

            case "rabbit":
                animal = new Rabbit(
                        Randoms.getRandomInt(2, 7),
                        Randoms.getRandomInt(20, 30),
                        Randoms.getRandomInt(8, 17),
                        flag=false,
                        0);
                break;

            case "chicken":
                animal = new Chicken(
                        Randoms.getRandomInt(2, 7),
                        Randoms.getRandomInt(5, 12),
                        Randoms.getRandomInt(5, 10),
                        flag=false,
                        Randoms.getRandomInt(1, 3));
                break;
        }
        return animal;
    }

    public int getWeight() {
        return weight;
    }

    public int getSpeed() {
        return speed;
    }

    public int getHealthScore() {
        return healthScore;
    }

    public int getMaxHealthScore() {
        return maxHealthScore;
    }

    public static boolean isFlag() {
        return flag;
    }

    public int getResource() {
        return resource;
    }

    @Override
    public String toString() {
        return "HomeAnimal{" +
                "weight=" + weight +
                ", speed=" + speed +
                ", healthScore=" + healthScore +
                ", maxHealthScore=" + maxHealthScore +
                ", resource=" + resource +
                '}';
    }

    @Override
    public void eatAnimal() {
        plusHealth();
    }
}
