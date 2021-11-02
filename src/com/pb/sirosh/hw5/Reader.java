package com.pb.sirosh.hw5;

public class Reader {
    private String fio;
    private int number;
    private String faculty;
    private String data;
    private String tel;

    public Reader(String fio, int number, String faculty, String data, String tel) {
        this.fio = fio;
        this.number = number;
        this.faculty = faculty;
        this.data = data;
        this.tel = tel;
    }

    String getInfo() {
        return "[ФИО: " + fio + ", номер: " + number + ", факультет: "
                + faculty + ", дата: " + data + ", телефон: " + tel + "]";
    }

    public void takeBook(int number) {
        System.out.println(this.fio + " взял " + number + " книги.");
        System.out.println();
    }

    public void takeBook(String... books) {
        System.out.println(this.fio + " взял книги:");
        for (String book : books) {
            System.out.println(book);
        }
        System.out.println();
    }

    public void takeBook(Book... books) {
        System.out.println(this.fio + " взял книги:");
        for (Book book : books) {
            System.out.println(book.getName() + " (" + book.getAuthor() + " " + book.getYear() + ")" );
        }
        System.out.println();
    }

    public void returnBook(int number) {
        System.out.println(this.fio + " вернул " + number + " книги.");
        System.out.println();
    }

    public void returnBook(String... books) {
        System.out.println(this.fio + " вернул книги:");
        for (String book : books) {
            System.out.println(book);
        }
        System.out.println();
    }

    public void returnBook(Book... books) {
        System.out.println(this.fio + " вернул книги:");
        for (Book book : books) {
            System.out.println(book.getName() + " (" + book.getAuthor() + " " + book.getYear() + ")" );
        }
        System.out.println();
    }

    public String getFio() {
        return fio;
    }

    public int getNumber() {
        return number;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getData() {
        return data;
    }

    public String getTel() {
        return tel;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }


}
