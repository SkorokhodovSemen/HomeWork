package com.ifmo.homework.work5;

public class Exercise {

    public static void main(String[] args) {

        Library library1 = new Library();
        Author author1 = new Author();
        Book book1 = new Book(1);
        author1.setAuthorName("Михаил");
        author1.setAuthorSurname("Булгаков");
        book1.setNameBook("Мастер и Маргарита");
        book1.setPage(758);
        book1.setYears(1956);
        book1.addAuthor(author1);
        System.out.println(book1);
        library1.setNumber(1);
        library1.addBooks(book1);
        System.out.println(library1);





//    1. Реализовать объектную модель:
//    Хранилище: книги, номер хранилища;
//    Книга: название, авторы, количество страниц, год издания (int);
//    Автор: имя, фамилия.
//    Книга может быть написана несколькоми авторами.
//    Каждое хранилище расчитано на 20 книг (максимум).
//    * Необходимо реализовать возможность добавления книг в хранилище по 1й.
//    * В одно хранилище не может быть добавлено несколько книг с одинаковым названием.





    }
}
