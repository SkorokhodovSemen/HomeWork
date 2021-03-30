package com.ifmo.homework.work7;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        Student student = new Student("Семен", 14, "Java", 40);
        Teacher teacher = new Teacher("Дарья", 31, "Java", 15);
        Director director = new Director("Босс", 147);
        School school = new School("Итмо", director);
        school.addTeacher(teacher);
        school.addStudent(student);
        school.dayInSchool();
        System.out.println(student);



    }
}
