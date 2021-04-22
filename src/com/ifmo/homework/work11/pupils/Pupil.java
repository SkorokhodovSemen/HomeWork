package com.ifmo.homework.work11.pupils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;
import java.util.UUID;

public class Pupil {
    enum Gender {
        MALE, FEMALE
    }
    private UUID number; // уникальное значение для каждого ученика
    private String name;
    private Gender gender;
    private LocalDate birth;

    public static void avrAge (ArrayList<LocalDate> arrayList){
        double avrAge1 =0;
        for (LocalDate localDate : arrayList) {
            avrAge1 = LocalDate.now().getYear() - localDate.getYear() + avrAge1;
        }
        avrAge1=avrAge1/arrayList.size();
        System.out.println(avrAge1);
    }

    public Pupil(String name, Gender gender, LocalDate birth) {
        this.number = UUID.randomUUID();
        this.name = name;
        this.gender = gender;
        this.birth = birth;
    }

    public UUID getNumber() {
        return number;
    }


    public String getName() {
        return name;
    }


    public Gender getGender() {
        return this.gender;
    }

    public LocalDate getBirth() {
        return birth;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pupil)) return false;
        Pupil pupil = (Pupil) o;
        return Objects.equals(name, pupil.name) && gender == pupil.gender && Objects.equals(birth, pupil.birth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, name, gender, birth);
    }

    @Override
    public String toString() {
        return "Pupil{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", birth=" + birth +
                '}';
    }

    // TODO: добавить все необходимые методы
}
