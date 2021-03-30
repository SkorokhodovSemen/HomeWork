package com.ifmo.homework.work7;

abstract public class Worker extends People {
    protected String subjects;


    public Worker (String name, int age, String subjects) {
        super(name, age);
        this.subjects = subjects;
    }


    public boolean isLearnAble() {
        return this.getSubjects().equals(this.getSubjects());
    }




    public String getSubjects() {
        return subjects;
    }


}
