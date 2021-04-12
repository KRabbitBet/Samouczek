package com.company;

public class Movie {
    private String title;
    private MovieGenre genre;
    private int price;
    private String director;

    public Movie(String title, MovieGenre genre, int price) {
        this.title = title;
        this.genre = genre;
        this.price = price;
    }

    public Movie(String title, MovieGenre genre, int price, String director) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public MovieGenre getGenre() {
        return genre;
    }

    public int getPrice() {
        return price;
    }

    public String getDirector() {
        return director;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(MovieGenre genre) {
        this.genre = genre;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void printMovieDetails() {
        System.out.printf("Title: %s, Genre: %s, Price: %d€", getTitle(), getGenre(), getPrice());
        if (director != null && director.length() > 0) {
            System.out.printf(", Director: %s", getDirector());
        }
        System.out.println();
    }
}
