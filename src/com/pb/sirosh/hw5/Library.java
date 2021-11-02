package com.pb.sirosh.hw5;

public class Library {
    public static void main(String[] args) {

        Reader reader1 = new Reader("Петров B. B.", 125, "Исторический факультет", "25.11.2001", "0663118787");
        Reader reader2 = new Reader("Сидоров А. B.", 123, "Исторический факультет", "15.10.1998", "0663118787");
        Reader reader3 = new Reader("Иванов П. П.", 154, "Исторический факультет", "14.08.2006", "0663118787");
        Book book1 = new Book("Приключения", "Иванов И. И.", "2000 г.");
        Book book2 = new Book("Словарь", "Сидоров А. В.", "1980 г.");
        Book book3 = new Book("Энциклопедия", "Гусев К. В.", "2010 г.");

        //Печатаем читателя и книги
        System.out.println("Читатели:");
        System.out.println(reader1.getInfo());
        System.out.println(reader2.getInfo());
        System.out.println(reader3.getInfo());
        System.out.println("Книги:");
        System.out.println(book1.getInfo());
        System.out.println(book2.getInfo());
        System.out.println(book3.getInfo());
        System.out.println("\n");

        // takeBook
        reader1.takeBook(3);
        reader1.takeBook(book1.getName(), book2.getName(), book3.getName());
        reader1.takeBook(book1, book2, book3);

        // returnBook
        reader1.returnBook(3);
        reader1.returnBook(book1.getName(), book2.getName(), book3.getName());
        reader1.returnBook(book1, book2, book3);

    }
}


