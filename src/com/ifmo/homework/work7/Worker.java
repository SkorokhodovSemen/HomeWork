package com.ifmo.homework.work7;

abstract public class Worker extends People {
    protected String subjects;
    protected int learnLvl;

    public Worker (String name, int age, String subjects, int learnLvl) {
        super(name, age);
        this.subjects = subjects;
        this.learnLvl = learnLvl;
    }


    public boolean isLearnAble(Worker teacher, Worker student) {
        return  teacher.getSubjects().equals(student.getSubjects());
    }

    public void plusLearnLvl (Worker teacher, Worker student) {
        if (!(isLearnAble(teacher, student))) return;
        if (isLearnAble(teacher, student)) learnLvl = student.getLearnLvl() + teacher.getLearnLvl();
    }

    public int getLearnLvl() {
        return learnLvl;
    }



    public String getSubjects() {
        return subjects;
    }


}
