package com.company;

/* W ramach ćwiczenia utwórz nowy projekt, w nim utwórz 2 różne pakiety.
W pakietach utwórz klasy odpowiadające kilku rodzajom obiektów wraz z kilkoma atrybutami.
 */

public class Main {
    public static void main(String[] args) {
        Book lotr1 = new Book("The Fellowship of the Ring", "J. R. R. Tolkien", 10);
        Book lotr2 = new Book("The Two Towers", "J. R. R. Tolkien", 8);

        lotr1.printBookDetails();

        Movie ghostbusters = new Movie("Ghost Busters", MovieGenre.COMEDY, 5);
        Movie avengers = new Movie("The Avengers", MovieGenre.ACTION, 8, "Joss Whedon");

        avengers.printMovieDetails();

        Book[] books = {lotr1, lotr2};
        for (int i = 0; i < books.length; i++) {
            books[i].printBookDetails();
        }

        Movie goonies = new Movie("Goonies", MovieGenre.ACTION, 5, "Steven Spielberg");
        loopAndPrintMovies(ghostbusters, avengers, goonies);
    }

    public static void loopAndPrintMovies(Movie... movies) {

        for (int i = 0; i < movies.length; i++) {
            movies[i].printMovieDetails();
        }
    }
}