package com.ifmo.homework.work7;

import com.ifmo.homework.work5.Book;

import java.util.Arrays;

public class School implements TeachAble, LearnAble{
    private String title;
    private Director director;
    private Teacher[] teachers;
    private Student[] students;

    public School (String title, Director director){
        this.title = title;
        this.director = director;
        teachers = new Teacher[10]; //Пусть в школе 10 учителей
        students = new Student[10]; //Пусть в школе 10 учеников
    }

//    public School() {
//        teachers = new Teacher[10]; //Пусть в школе 10 учителей
//        students = new Student[10]; //Пусть в школе 10 учеников
//    }

    public void addTeacher (Teacher teacher){
        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i] == null) {
                teachers[i] = teacher;
                return;
            }
        }
    }

    public void addStudent (Student student){
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                return;
            }
        }
    }

    public void dayInSchool(){
        director.startDay();
        for (int i = 0; i < teachers.length; i++) {
            for (int j = 0; j < students.length; j++) {
                Teach(students[j]);{
                    students[j].Learn();
                    break;
                }
            }
            break;
        }
        director.endDay();
    }

    @Override
    public void Teach(Worker student) {
    }

    @Override
    public void Learn() {
    }
}
