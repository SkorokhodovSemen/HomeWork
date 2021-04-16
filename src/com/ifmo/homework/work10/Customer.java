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

    public static void shop1( int from, int to, HashMap<String,Customer> customerMap) {
        HashMap<String, Customer> count = new HashMap<>();
        for (Map.Entry<String, Customer> stringCustomerEntry : customerMap.entrySet()) {
            if (stringCustomerEntry.getValue().getAge() >= from && stringCustomerEntry.getValue().getAge() < to) {
                count.put(stringCustomerEntry.getKey(), stringCustomerEntry.getValue());
            }
        }
        System.out.println(count);
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

