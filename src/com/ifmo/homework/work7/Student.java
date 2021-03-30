package com.ifmo.homework.work7;

public class Student extends Worker implements LearnAble{

    public Student (String name, int age, String subjects, int learnLvl) {
        super(name, age, subjects, learnLvl);
    }


    @Override
    public void Learn(Worker teacher, Worker student) {
        student.plusLearnLvl(teacher,student);
    }


}
