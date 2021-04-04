package com.ifmo.homework.work7;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        Student student = new Student("Семен", 24, "Java", 40);
        Student student1 = new Student("Роман", 27, "Java", 25);
        Teacher teacher = new Teacher("Дарья", 31, "Java");
        Teacher teacher1 = new Teacher("Дарья", 32, "Java");
        Director director = new Director("Босс", 147);
        School school = new School("Итмо", director);
        school.addTeacher(teacher);
        school.addTeacher(teacher1);
        school.addStudent(student);
        school.addStudent(student1);
        school.dayInSchool();
        System.out.println(student.getLearnLvl());
        System.out.println(student1.getLearnLvl());


        // Для учителя. Компилирует. Обучает 1 ученика 1 раз. И все. То есть, если 2 учителя, с одинаковыми предметами,
        // Должно произойти двойное обучение, но не работает
        // Если 2 разных преподавателя 2 разных предметов, то оба ученика должны получить плюс знания, но не работает



    }
}
