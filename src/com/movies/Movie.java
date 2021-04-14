package com.movies;

import com.company.Person;

public class Movie {
    private String title;
    private MovieGenre genre;
    private double price;
    private Person person;

    public Movie(String title, MovieGenre genre, double price, Person person) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.person = person;
    }

    public String getTitle() {
        return title;
    }

    public MovieGenre getGenre() {
        return genre;
    }

    public double getPrice() {
        return price;
    }

    public Person getPerson() {
        return person;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(MovieGenre genre) {
        this.genre = genre;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void printMovieDetails() {
        System.out.printf("Title: %s, Genre: %s, Price: %f€, Director: %s\n", this.title, this.genre, this.price, this.person);
    }

}