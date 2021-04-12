package com.company;

public class Movie {
    private String title;
    private MovieGenre genre;
//    czy price na pewno powinno być typu int? jaki lepszy typ można by tutaj użyć?
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
        // do zastanowienia: czy program działałby tak sami gdyby zamiast getterów użyć this.title itd.
        System.out.printf("Title: %s, Genre: %s, Price: %d€", getTitle(), getGenre(), getPrice());
        if (director != null && director.length() > 0) {
            System.out.printf(", Director: %s", getDirector());
        }
        // czy ten pusty System.out.println jest potrzebny? Zastanów się co można zrobić żeby program działał tak samo ale tego pustego printa by nie było.
        System.out.println();
    }
}
