package com.ifmo.homework.work7;

public class Student extends Worker implements LearnAble{
    private int learnLvl;

    public Student (String name, int age, String subjects, int learnLvl) {
        super(name, age, subjects);
        this.learnLvl = learnLvl;
    }

    public void plusLearnLvl (int count) {
        if (!(isLearnAble())) return;
        if (isLearnAble()) learnLvl += count;   //Math.random()*
    }

    public int getLearnLvl() {
        return learnLvl;
    }


    @Override
    public void Learn() {
        plusLearnLvl(5);
    }


}
