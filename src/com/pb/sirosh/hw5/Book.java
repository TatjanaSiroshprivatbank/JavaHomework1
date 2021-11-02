package com.pb.sirosh.hw5;

public class Book {
    private String name;
    private String author;
    private String year;


    public Book(String name, String author, String year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void takeBook(String name) {
        System.out.println("Звонит " + name);
    }

    String getInfo() {
        return "[Наименование: " + name + ", автор: " + author + ", год: " + year + "]";
    }
}