package com.ifmo.homework.work5;

import java.util.Arrays;
import java.util.Objects;

public class Book {

//    Книга: название, авторы, количество страниц, год издания (int);
    private String nameBook;
    private Author[] authors;
    private int page;
    private int years;


    public String getNameBook() {
        return nameBook;
    }


    public Book ( int bookCount) {
        //Проверка на null + исключение
        authors = new Author[bookCount];
    }

    public void setNameBook(String nameBook) {
        if (nameBook == null || nameBook.length()<3) {
            throw new IllegalArgumentException("Значение nameBook < 3");
        }
        this.nameBook = nameBook;
    }

    public void addAuthor(Author author){
        Objects.requireNonNull(author, "authors не может быть null");

        for (int i = 0; i < authors.length; i++) {
            if (authors[i] == null) {
                authors[i] = author;
                return; // в void методах используется для завершения работы метода
            }
        }
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        if (page < 10) {
            throw new IllegalArgumentException("Слишком маленькая книга");
        }
        this.page = page;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Название " + nameBook + '\'' +
                ", Автор='" + Arrays.toString(authors) + '\'' +
                ", Страниц=" + page +
                ", Год=" + years +
                '}';
    }
}
