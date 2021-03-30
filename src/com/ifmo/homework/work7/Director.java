package com.ifmo.homework.work7;

public class Director extends People{


    public Director (String name, int age) {
        super(name, age);
    }

    public void startDay(){
        System.out.println("Начало учебного дня");
    }

    public void endDay(){
        System.out.println("Окончание учебного дня");
    }



}
