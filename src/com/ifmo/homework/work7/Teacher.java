package com.ifmo.homework.work7;

public class Teacher extends Worker implements TeachAble{

    public Teacher (String name, int age, String subjects) {
        super(name, age, subjects);
    }

    @Override
    public void Teach(Worker student) {

    }

}
