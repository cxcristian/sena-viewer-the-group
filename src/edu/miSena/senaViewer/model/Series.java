package edu.miSena.senaViewer.model;

import java.util.ArrayList;
import java.util.List;

public class Series extends Film {
    private int sessionQuantity;
    private List<Chapter> chapters;

    public Series(String title, String genre, String creator, int duration, int sessionQuantity) {
        super(title, genre, creator, duration);
        this.sessionQuantity = sessionQuantity;
        this.chapters = new ArrayList<>();
    }
    
    public int getSessionQuantity() {
        return sessionQuantity;
    }

    public void setSessionQuantity(int sessionQuantity) {
        this.sessionQuantity = sessionQuantity;
    }

    public List<Chapter> getChapters() {
        return chapters;
    }

    public void setChapters(List<Chapter> chapters) {
        this.chapters = chapters;
    }

    public static List<Series> makeSeriesList() {
        List<Series> series = new ArrayList<>();
        Series breakingBad = new Series("Breaking Bad", "Crime Drama", "Vince Gilligan", 45, 5);
        breakingBad.getChapters().add(new Chapter("Pilot", 58, 2008));
        breakingBad.getChapters().add(new Chapter("Cat's in the Bag...", 48, 2008));
        series.add(breakingBad);

        Series gameOfThrones = new Series("Game of Thrones", "Fantasy", "David Benioff, D. B. Weiss", 60, 8);
        gameOfThrones.getChapters().add(new Chapter("Winter Is Coming", 62, 2011));
        gameOfThrones.getChapters().add(new Chapter("The Kingsroad", 56, 2011));
        series.add(gameOfThrones);
        
        series.add(new Series("Black Mirror", "Sci-Fi", "Charlie Brooker", 50, 5));
        series.add(new Series("The Mandalorian", "Sci-Fi", "Jon Favreau", 40, 3));

        return series;
    }

    @Override
    public String toString() {
        return "Serie :: " +
                "Title: '" + getTitle() + "'" +
                ", Genre: '" + getGenre() + "'" +
                ", Creator: '" + getCreator() + "'" +
                ", Duration: " + getDuration() +
                ", Sessions: " + sessionQuantity;
    }
}
