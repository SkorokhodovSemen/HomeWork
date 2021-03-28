package com.ifmo.homework.work6;

public class Application {
    public static void main(String[] args) {
        //    Кот: имя, цвет, скорость, вес, пойманные мыши;
//    Мышь: скорость.
//    Кот хранит информацию о пойманных мышах (максимум 100).
//    Кот ловит мышь, только, если его скорость выше, чем у мыши.
//    Кот может напасть на другого кота и, если он больше противника (по весу),
//    то может отобрать его мышей (если скорость мыши выше, чем скорость кота, она убежит),
//    массив с мышами противника нужно обнулить (всем элементам присвоить значение null).



        Cat cat1 = new Cat();
        cat1.setColorCat("Серый");
        cat1.setNameCat("Тирион");
        cat1.setWeightCat(4);
        cat1.setSpeedCat(15);
        Mouse mouse1 = new Mouse();
        mouse1.setSpeedMouse(4);
        Mouse mouse2 = new Mouse();
        mouse1.setSpeedMouse(5);
        Mouse mouse3 = new Mouse();
        mouse1.setSpeedMouse(16);
        Mouse mouse4 = new Mouse();
        mouse1.setSpeedMouse(3);
        Mouse mouse5 = new Mouse();
        mouse1.setSpeedMouse(8);
        cat1.addMouse(mouse1);
        cat1.addMouse(mouse2);
        cat1.addMouse(mouse4);
        Cat cat2 = new Cat();
        cat2.setColorCat("Черный");
        cat2.setNameCat("Джон");
        cat2.setWeightCat(2);
        cat2.setSpeedCat(20);
        cat2.addMouse(mouse3);
        cat2.addMouse(mouse5);
        System.out.println(cat1);
        System.out.println(cat2);
        cat1.fightCat(cat1,cat2);
        System.out.println(cat1);
        System.out.println(cat2);







    }
}


