package com.ifmo.homework.work6;

import java.util.Arrays;
import java.util.Objects;

public class Cat {

//    Кот: имя, цвет, скорость, вес, пойманные мыши;
    private String nameCat;
    private String colorCat;
    private double speedCat;
    private double weightCat;
    private int eat[];

    public String getNameCat() {
        return nameCat;
    }

    public void setNameCat(String nameCat) {
        if (nameCat == null || nameCat.trim().length() < 2) {
            throw new IllegalArgumentException("nameCat >2");
        }
        this.nameCat = nameCat;
    }

    public String getColorCat() {
        return colorCat;
    }

    public void setColorCat(String colorCat) {
        if (colorCat == null || colorCat.trim().length() < 2) {
            throw new IllegalArgumentException("colorCat >2");
        }
        this.colorCat = colorCat;
    }

    public double getSpeedCat() {
        return speedCat;
    }

    public void setSpeedCat(double speedCat) {
        if (speedCat < 1 || speedCat>20) {
            throw new IllegalArgumentException("Не бывает таких котов");
        }
        this.speedCat = speedCat;
    }

    public double getWeightCat() {
        return weightCat;
    }

    public void setWeightCat(double weightCat) {
        if (weightCat < 1 || weightCat>20) {
            throw new IllegalArgumentException("Не бывает таких котов");
        }
        this.weightCat = weightCat;
    }

    public int[] getEat() {
        return eat;
    }

    public void addMouse(Mouse mouse){
        if (mouse.getSpeedMouse()<getSpeedCat()) {
            for (int i = 0; i < 100; i++) {
                if (eat[i] == 0) {
                    eat[i] = i+1;
                    return;
                } else System.out.println("У кота очень много мышей");
            }
        } else System.out.println("Не поймал");
    }

    public void fightCat(Cat cat1, Cat cat2) {
        if (cat1.getWeightCat() == cat2.getWeightCat()) {
            System.out.println("Драки не будет, они слишком круты");
            return;
        }
        if (cat1.getWeightCat() > cat2.getWeightCat()) {
            for (int i = 0; i < 100; i++) {
                cat2.getEat()[i] = 0;
                if (cat1.getSpeedCat() > cat2.getEat()[i].getSpeedMouse) {
                    for (int j = 0; j < 100; j++) {
                        if (eat[j] == 0) {
                            eat[j] = j + 1;
                            break;
                        }
                    }
                } else System.out.println("Мышонок сбежал");
            }
        } else {
            for (int i = 0; i < 100; i++) {
                cat1.getEat()[i] = 0;
                if (cat2.getSpeedCat() > (cat1.getEat()[i]).getSpeedMouse) {
                    for (int j = 0; j < 100; j++) {
                        if (eat[j] == 0) {
                            eat[j] = j + 1;
                            break;
                        }
                    }
                } else System.out.println("Мышонок сбежал");
            }
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "nameCat='" + nameCat + '\'' +
                ", colorCat='" + colorCat + '\'' +
                ", speedCat=" + speedCat +
                ", weightCat=" + weightCat +
                ", eat=" + Arrays.toString(eat) +
                '}';
    }
}
