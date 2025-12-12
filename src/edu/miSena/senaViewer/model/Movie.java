package edu.miSena.senaViewer.model;

import java.util.ArrayList;
import java.util.List;

public class Movie extends Film {

    public Movie(String title, String genre, String creator, int duration, int year) {
        super(title, genre, creator, duration);
        setYear(year);
    }

    public static List<Movie> makeMoviesList() {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Inception", "Sci-Fi", "Christopher Nolan", 148, 2010));
        movies.add(new Movie("The Dark Knight", "Action", "Christopher Nolan", 152, 2008));
        movies.add(new Movie("Interstellar", "Sci-Fi", "Christopher Nolan", 169, 2014));
        movies.add(new Movie("Parasite", "Thriller", "Bong Joon Ho", 132, 2019));
        movies.add(new Movie("The Godfather", "Crime", "Francis Ford Coppola", 175, 1972));
        return movies;
    }

    @Override
    public String toString() {
        return "Movie :: " +
                "Title: '" + getTitle() + "'" +
                ", Genre: '" + getGenre() + "'" +
                ", Creator: '" + getCreator() + "'" +
                ", Duration: " + getDuration() +
                ", Year: " + getYear();
    }
}
