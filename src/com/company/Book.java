package com.company;

public class Book {
    private int number;
    private String title;
    private int releaseYear;


    //CONSTRUCTOR
    public Book(int number, String title, int releaseYear) {
        this.number = number;
        this.title = title;
        this.releaseYear = releaseYear;
    }


    //GETTERS
    public int getNumber() {
        return number;
    }

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }


    //SETTERS
    public void setNumber(int number) {
        this.number = number;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    //TOSTRING

    @Override
    public String toString() {
        return "Book{" +
                "number=" + number +
                ", title='" + title + '\'' +
                ", releaseYear=" + releaseYear +
                '}';
    }
}
