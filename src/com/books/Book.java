package com.books;

import com.company.Person;

public class Book {
    private String title;
    private Person person;
    private double price;

    public Book(String title, Person person, double price) {
        this.title = title;
        this.person = person;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public Person getPerson() {
        return person;
    }

    public double getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void printBookDetails() {
        System.out.printf("Title: %s, Author: %s, Price: %f€\n", this.title, this.person, this.price);
    }

}