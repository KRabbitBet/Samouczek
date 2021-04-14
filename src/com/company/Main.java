package com.company;

/* W ramach ćwiczenia utwórz nowy projekt, w nim utwórz 2 różne pakiety.
W pakietach utwórz klasy odpowiadające kilku rodzajom obiektów wraz z kilkoma atrybutami.
 */

import com.movies.Movie;
import com.movies.MovieGenre;
import com.books.Book;

public class Main {
    public static void main(String[] args) {
        Book lotr1 = new Book("The Fellowship of the Ring", Person.Tolkien, 10);
        Book lotr2 = new Book("The Two Towers", Person.Tolkien, 8);


        Movie ghostbusters = new Movie("Ghost Busters", MovieGenre.COMEDY, 5, Person.Reitman);
        Movie goonies = new Movie("Goonies", MovieGenre.ACTION, 5, Person.Spielberg);


        Book[] books = {lotr1, lotr2};
        for (int i = 0; i < books.length; i++) {
            books[i].printBookDetails();
        }

        Movie[] movies = {ghostbusters, goonies};
        for (int i = 0; i < movies.length; i++) {
            movies[i].printMovieDetails();
        }
    }

}