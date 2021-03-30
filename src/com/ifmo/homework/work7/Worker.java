package com.ifmo.homework.work7;

abstract public class Worker extends People {
    protected String subjects;
    protected int learnLvl;

    public Worker (String name, int age, String subjects, int learnLvl) {
        super(name, age);
        this.subjects = subjects;
        this.learnLvl = learnLvl;
    }
    public void plusLearnLvl (int count) {
        learnLvl +=count;
    }

    public boolean isLearnAble() {
        return learnLvl > 20;
    }



    public int getLearnLvl() {
        return learnLvl;
    }

    public String getSubjects() {
        return subjects;
    }


}
