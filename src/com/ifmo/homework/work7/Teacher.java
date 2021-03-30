package com.ifmo.homework.work7;

public class Teacher extends Worker implements TeachAble{

    public Teacher (String name, int age, String subjects, int learnLvl) {
        super(name, age, subjects,learnLvl);
    }

    @Override
    public void Teach(Worker student, Worker teacher) {
        teacher.plusLearnLvl(teacher,student);
    }

}
