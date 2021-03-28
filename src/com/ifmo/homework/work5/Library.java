package com.ifmo.homework.work5;

import java.util.Objects;
import java.util.Arrays;

public class Library {

    private Book[] books;
    private int number;

    public void setNumber(int number) {
        if (number == 0) {
            throw new IllegalArgumentException("Номер хранилища не может быть 0");
        }
        this.number = number;
    }

    public Library() {
        books = new Book[20];
    }


    public void addBooks(Book book) {
        Objects.requireNonNull(book, "book не может быть null");
        for (int i = 0; i < 20; i++) {
            if (books[i] == null) {
                books[i] = book;
                return; // в void методах используется для завершения работы метода
            } else {
                if (book.getNameBook().equalsIgnoreCase(books[i].getNameBook())) {
                    System.out.println("Такая книга уже есть, выберите другое хранилище");
                    return;
                }
            }
        }
        System.out.println("Хранилище заполнено, выберите другое");
    }

    public int getNumber() {
        return number;
    }


    @Override
    public String toString() {
        return "Library{" +
                "book='" + Arrays.toString(books) + '\'' +
                ", number=" + number +
                '}';
    }
}
