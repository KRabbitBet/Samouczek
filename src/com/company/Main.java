package com.company;

/* W ramach ćwiczenia utwórz nowy projekt, w nim utwórz 2 różne pakiety.
W pakietach utwórz klasy odpowiadające kilku rodzajom obiektów wraz z kilkoma atrybutami.
 */

/*
Dodatkowe zadanie:
Niech Author i Director będą również obiekrami potomnymi klasy Person.
 */

public class Main {
//     W zadaniu chodzi nie chodziło o stworzenie dwóch klas ale dwoch pakietow (folderów).
//     Masz już dwie klasy więc wrzuć je do jakiegoś jednego pakietu i do projektu dodaj nowy pakiet z innym rodzajem klas
    public static void main(String[] args) {
        Book lotr1 = new Book("The Fellowship of the Ring", "J. R. R. Tolkien", 10);
        Book lotr2 = new Book("The Two Towers", "J. R. R. Tolkien", 8);

        lotr1.printBookDetails();

        Movie ghostbusters = new Movie("Ghost Busters", MovieGenre.COMEDY, 5);
        Movie avengers = new Movie("The Avengers", MovieGenre.ACTION, 8, "Joss Whedon");

        avengers.printMovieDetails();

        Book[] books = {lotr1, lotr2};
//        poniższą pętlę napisz rownież dwoma innymi kostrukcjami fora tj. foreach (ten z :) oraz .foreach(book-> ...) czyli lambdą
//         zastanów się który zapis z tych trzech forów będzie najczytelniejszy
//         oraz w jakiej sytuacji poniższy zapis fora jest najbardziej odpowiedni (co on ma czego inne fory nie mają)
        for (int i = 0; i < books.length; i++) {
            books[i].printBookDetails();
        }

        Movie goonies = new Movie("Goonies", MovieGenre.ACTION, 5, "Steven Spielberg");
        loopAndPrintMovies(ghostbusters, avengers, goonies);
    }
//do zastanowienia: w jaki inny sposób można zapisać argument tej metody? czy ... to jedyny sposób?
    public static void loopAndPrintMovies(Movie... movies) {

        for (int i = 0; i < movies.length; i++) {
            movies[i].printMovieDetails();
        }
    }
}
