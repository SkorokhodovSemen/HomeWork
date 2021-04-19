package com.ifmo.homework.work10;

import java.util.*;

public class Customer {
    private String name;
    private String uuid;
    private int age;

    public static void city1(HashMap<String, String> hashMap, String city) {
        ArrayList<String> login = new ArrayList<>();
        for (Map.Entry<String, String> stringStringEntry : hashMap.entrySet()) {
            if (stringStringEntry.getValue().equals(city)) {
                login.add(stringStringEntry.getKey());
            }
        }
        System.out.println(login);
    }

    public static void month1(List<String> stringList) {
        HashMap<String, Integer> count = new HashMap<>();
        for (String s : stringList) {
            count.put(s, count.getOrDefault(s, 0) + 1);
        }
        System.out.println(count);
    }

    public static void shop1(int from, int to, HashMap<String, Customer> customerMap) {
        HashMap<String, Customer> count = new HashMap<>();
        for (Map.Entry<String, Customer> stringCustomerEntry : customerMap.entrySet()) {
            if (stringCustomerEntry.getValue().getAge() >= from && stringCustomerEntry.getValue().getAge() < to) {
                count.put(stringCustomerEntry.getKey(), stringCustomerEntry.getValue());
            }
        }
        System.out.println(count);
    }

    public static void word(String text, String word) {
        int a = 0;
        String[] text1 = text.split(" ");
        for (int i = 0; i < text1.length; i++) {
            if (text1[i].equalsIgnoreCase(word)) {
                a += 1;
            }
        }
        System.out.println("Слово " + word + " встречается " + a + " раз ");
    }

    //    Добавляет только последние элементы массива, как бы перезаписывает его. Не понимаю, как добавить внутри цикла в коллекцию все встречающиеся
//    Слова
    public static void group(String text) {
        String[] text1 = text.split(" ");
        HashMap<Integer, ArrayList<String>> count = new HashMap<>();
        for (int i = 0; i < text1.length; i++) {
            count.put(text1[i].length(), new ArrayList<>(Arrays.asList(text1[i])));
        }
        System.out.println(count);
    }

    public static void top(String text) {
        int b =0;
        String[] text1 = text.split(" ");
        HashMap<String, Integer> count = new HashMap<>();
        for (int i = 0; i < text1.length; i++) {
            count.put(text1[i].toLowerCase(Locale.ROOT), b);
        }
        System.out.println(count);
    }

    public static void abc(String text) {
        int b = 0;
        text = text.replaceAll("\\s+", "");
        text = text.toLowerCase(Locale.ROOT);
        char[] formStr = text.toCharArray();
        char a = 'a';
        HashMap<Character, Integer> abcd = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            abcd.put(a, 0);
            a++;
        }
        for (Map.Entry<Character, Integer> characterIntegerEntry : abcd.entrySet()) {
            for (int i = 0; i < formStr.length; i++) {
                if (formStr[i] == characterIntegerEntry.getKey()) {
                    b = characterIntegerEntry.getValue();
                    b+=1;
                    abcd.put(characterIntegerEntry.getKey(), b);
                }
            }
            System.out.println(characterIntegerEntry.getKey() + " в процентах " + (double)(characterIntegerEntry.getValue())*100/(formStr.length));
        }
        System.out.println(abcd);
    }


    public Customer(String name, String uuid, int age) {
        this.name = name;
        this.uuid = uuid;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", uuid='" + uuid + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return age == customer.age && Objects.equals(name, customer.name) && Objects.equals(uuid, customer.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, uuid, age);
    }

    // TODO: переопределить все необходимые методы
}

