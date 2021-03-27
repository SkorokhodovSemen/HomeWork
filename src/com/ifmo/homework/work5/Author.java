package com.ifmo.homework.work5;

public class Author {

    private String authorName;
    private String authorSurname;

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        if (authorName == null || authorName.length()<2) {
            throw new IllegalArgumentException("Значение authorName < 2");
        }
        this.authorName = authorName;
    }


    public String getAuthorSurname() {
        return authorSurname;
    }


    public void setAuthorSurname(String authorSurname) {
        if (authorSurname == null || authorSurname.length()<3) {
            throw new IllegalArgumentException("Значение authorSurname < 3");
        }
        this.authorSurname = authorSurname;
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorName='" + authorName + '\'' +
                ", authorSurname='" + authorSurname + '\'' +
                '}';
    }
}
