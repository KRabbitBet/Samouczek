package com.company;

public class Book {
    private String title;
    private String author;
//    analogicznie jak w Movie czy to dobry pomysł żeby price było typu int?
    private int price;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void printBookDetails() {
        System.out.printf("Title: %s, Author: %s, Price: %d€\n", getTitle(), getAuthor(), getPrice());
    }
}
