package org.example.HwBook;


public class Book implements Printable {
    private String bookName;
    private String author;
    private int year;

    public void setBookName(String name){
        this.bookName = name;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setYear(int year){
        this.year = year;
    }

    public String getBookName(){
        return this.bookName;
    }

    public String getAuthor(){
        return this.author;
    }

    public int getYear(){
        return this.year;
    }

    public void print() {
        System.out.println("Название книги: " + this.getBookName());
        System.out.println("Автор: " + this.getAuthor());
        System.out.println("Год издания: " + this.getYear());

    }
}
