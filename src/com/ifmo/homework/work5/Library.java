package com.ifmo.homework.work5;

import java.util.Objects;
import java.util.Arrays;

public class Library {

    private Book books[];
    private int number;


    public void addBooks(Book book) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < books.length; j++) {
                if (books[j] == null && books[j] != books[i]) {
                    books[i] = book;
                    return; // в void методах используется для завершения работы метода
                }
            }
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if (number == 0) {
            throw new IllegalArgumentException("Номер хранилища не может быть 0");
        }
        this.number = number;
    }

    @Override
    public String toString() {
        return "Library{" +
                "book='" + books + '\'' +
                ", number=" + number +
                '}';
    }
}
