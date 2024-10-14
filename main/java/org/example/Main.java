package org.example;

import org.example.HwBook.Book;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setBookName("Name");
        book1.setAuthor("Author");
        book1.setYear(2024);
        book1.print();
    };
}
