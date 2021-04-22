package com.ifmo.homework.work11.pupils;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PupilTask {
    public static void main(String[] args) {

        Pupil pupil1 = new Pupil("Семен", Pupil.Gender.MALE, LocalDate.of(1996, 10, 16));
        Pupil pupil2 = new Pupil("Андрей", Pupil.Gender.MALE, LocalDate.of(1994, 2, 3));
        Pupil pupil3 = new Pupil("Елизавета", Pupil.Gender.FEMALE, LocalDate.of(1999, 11, 23));
        Pupil pupil4 = new Pupil("Андрей", Pupil.Gender.MALE, LocalDate.of(2000, 4, 19));
        Pupil pupil5 = new Pupil("Александра", Pupil.Gender.FEMALE, LocalDate.of(1990, 12, 31));
        Pupil pupil6 = new Pupil("Дарья", Pupil.Gender.FEMALE, LocalDate.of(1991, 7, 13));
        Pupil pupil7 = new Pupil("Дарья", Pupil.Gender.FEMALE, LocalDate.of(1996, 7, 7));
        Pupil pupil8 = new Pupil("Даниил", Pupil.Gender.MALE, LocalDate.of(1994, 3, 29));

        Pupil[] pupils = new Pupil[]{pupil1, pupil2, pupil3, pupil4, pupil5, pupil6, pupil7, pupil8};

        ArrayList<Pupil> pupils1 = new ArrayList<>(Arrays.asList(pupils));


        // 1. Разделить учеников на две группы: мальчиков и девочек. Результат: Map<Pupil.Gender, ArrayList<Pupil>>
        Map<Pupil.Gender, ArrayList<Pupil>> genderArrayListMap = pupils1.stream()
                .collect(Collectors.groupingBy((Pupil::getGender),
                        Collectors.toCollection(ArrayList::new)));
        System.out.println(genderArrayListMap);

        // 2. Найти средний возраст учеников

        ArrayList<LocalDate> avrAge = pupils1.stream()
                .map(Pupil::getBirth)
                .collect(Collectors.toCollection(ArrayList::new));
        Pupil.avrAge(avrAge);

        // 3. Найти самого младшего ученика

        Pupil minAge = pupils1.stream().max(Comparator.comparing(Pupil::getBirth)).orElse(null);
        System.out.println(minAge);
        System.out.println(pupils1.stream().map(Pupil::getBirth).max(Comparator.comparing(LocalDate::getYear).thenComparing(LocalDate::getMonth).thenComparing(LocalDate::getDayOfMonth)));

        // 4. Найти самого взрослого ученика

        Pupil maxAge = pupils1.stream().min(Comparator.comparing(Pupil::getBirth)).orElse(null);
        System.out.println(maxAge);
        System.out.println(pupils1.stream().map(Pupil::getBirth).min(Comparator.comparing(LocalDate::getYear).thenComparing(LocalDate::getMonth).thenComparing(LocalDate::getDayOfMonth)));

        // 5. Собрать учеников в группы по году рождения

        Map<Integer,ArrayList<Pupil>> birth = pupils1.stream()
                .collect(Collectors.groupingBy(birthYear -> birthYear.getBirth().getYear(),
                        Collectors.toCollection(ArrayList::new)));
        System.out.println(birth);

        // 6. Оставить учеников с неповторяющимися именами,
        // имена и дату рождения оставшихся вывести в консоль.
        // Например, [Иван, Александра, Ольга, Иван, Ольга] -> [Иван, Александра, Ольга]

        Map<String,ArrayList<Pupil>> nameMap = pupils1.stream()
                .collect(Collectors.groupingBy(Pupil::getName,              //не понимаю, как сделать имя ключом
                        Collectors.toCollection(ArrayList::new)));
        System.out.println(nameMap);





        // 7. Отсортировать по полу, потом по дате рождения, потом по имени (в обратном порядке), собрать в список (List)

        List<Pupil> pupilList = pupils1.stream()
                .sorted(Comparator.comparing(Pupil::getGender).thenComparing(Pupil::getBirth).thenComparing(Pupil::getName))
                .collect(Collectors.toList());
        System.out.println(pupilList);

        // 8. Вывести в консоль всех учеников в возрасте от N до M лет - или метод полностью принимающий на вход числа?

        pupils1.stream().filter(pupil -> pupil.getBirth().getYear() > 24 && pupil.getBirth().getYear() < 28).forEach(System.out::println);

        // 9. Собрать в список всех учеников с именем=someName

        List<Pupil> pupilName = pupils1.stream().filter(pupil -> pupil.getName().equals("Андрей")).collect(Collectors.toList());
        System.out.println(pupilName);

        // 10. Собрать Map<Pupil.Gender, Integer>, где Pupil.Gender - пол, Integer - суммарный возраст учеников данного пола

        Map<Pupil.Gender, Integer> ageMap = pupils1.stream()
                .collect(Collectors.groupingBy(pupil -> pupil.getGender(),
                        Collectors.summingInt(pupil -> LocalDate.now().getYear() - pupil.getBirth().getYear())));
        System.out.println(ageMap);
    }
}
