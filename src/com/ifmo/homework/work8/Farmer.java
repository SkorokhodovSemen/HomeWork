package com.ifmo.homework.work8;

import java.util.Arrays;
import java.util.Random;

import static com.ifmo.homework.work8.Settings.*;



public class Farmer implements HitAnimalAble,KillAnimalAble, EatAnimalAble, ResourceAble{
    private int resourceFarm;
    private HomeAnimal[] zoo;
    private WildAnimal[] wildZoo;
    private int a;
    private int b;
    private int c;
    private int d;

//    public Farmer(int resourceFarm, HomeAnimal[] zoo,WildAnimal[] wildZoo) {
//        resourceFarm = RESOURCE_FARM;
//        generateZoo();
//        generateWildZoo();
//    }

    public Farmer() {
        resourceFarm = RESOURCE_FARM;
        generateZoo();
        generateWildZoo();
    }

    public void generateZoo() {
        zoo = new HomeAnimal[VOLUME_ZOO];
        for (int i = 0; i < zoo.length; i++) {
            if (zoo[i] == null) {
                zoo[i] = HomeAnimal.getHomeAnimal();
            }
        }
    }

    public void generateWildZoo() {
        if (LVL_FORCE == 1) {
            wildZoo = new WildAnimal[3];
            for (int i = 0; i < wildZoo.length; i++) {
                if (wildZoo[i] == null) {
                    wildZoo[i] = WildAnimal.getWildAnimal();
                }
            }
        }
        if (LVL_FORCE == 2) {
            wildZoo = new WildAnimal[5];
            for (int i = 0; i < wildZoo.length; i++) {
                if (wildZoo[i] == null) {
                    wildZoo[i] = WildAnimal.getWildAnimal();
                }
            }
        }
        if (LVL_FORCE == 3) {
            wildZoo = new WildAnimal[7];
            for (int i = 0; i < wildZoo.length; i++) {
                if (wildZoo[i] == null) {
                    wildZoo[i] = WildAnimal.getWildAnimal();
                }
            }
        }
    }

    public int getResourceFarm() {
        return resourceFarm;
    }

    public HomeAnimal[] getZoo() {
        return zoo;
    }

    public void plusResourceFarm() {
        resourceFarm += HomeAnimal.getHomeAnimal().getResource();
    }

    public WildAnimal[] getWildZoo() {
        return wildZoo;
    }

    //День на ферме (метод passDay класса Farm):
//1. Фермер тратит 2 единицы ресурсов (если ресурсов не осталось, игра заканчивается).
//2. Приходит дикое животное (выбирается рандомно из массива с дикими животными),
//   пытается поймать (съесть, либо ранить) домашнее животное (выбирается рандомно).
//   Если домашнее животное убежало, дикое уходит ни с чем.
//3. Иногда (рандомно) фермер может прогнать дикое животное.
//4. Фермер кормит всех животных (животные восполняют здоровье)
//5. Фермер собирает ресурсы с животных, с которых можно их собирать.
//   Если таких не осталось, съедает животное, пригодное в пищу (если такие остались).

    public void passDay (Farmer farmer){
        resourceFarm=getResourceFarm()-RESOURCE_WORK;
        a = (int)(Math.random()* wildZoo.length);
        d = (int)(Math.random()* zoo.length);
        b = (int)(Math.random()* 2);    //Прогнать
        c = (int)(Math.random()* 2);    //Убить животное
        if (b == 0) {
            if (c == 1){
                killAnimal(d);
            }
            if (c == 0){
                hitAnimal(d,a);
            }
        }
        if (b == 1) {
//            Завести счетчик на количество прогнаных раз
        }
        eatAnimal();
        resource();
    }

//    Запутался в интерфейсах


    @Override
    public String toString() {
        return "Farmer{" +
                "resourceFarm=" + resourceFarm +
                ", zoo=" + Arrays.toString(zoo) +
                '}';
    }

    @Override
    public void hitAnimal(int count1, int count2) {
        zoo[count1].minusHealth(wildZoo[count2].getForce());
    }

    @Override
    public void killAnimal(int count) {
        zoo[count] = null;
    }

    @Override
    public void eatAnimal() {
        for (int i = 0; i < zoo.length; i++) {
            if (zoo[i] != null) {
                zoo[i].plusHealth();
            }
        }
    }

    @Override
    public void resource() {
        for (int i = 0; i < zoo.length; i++) {
            if (zoo[i] == null) continue;
            if (zoo[i].isFarm()) {
                resourceFarm += zoo[i].getResource();
//                plusResourceFarm();
            }
        }
    }


}

