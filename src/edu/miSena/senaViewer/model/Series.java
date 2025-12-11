package edu.miSena.senaViewer.model;
public class Series extends Film {
    private int sessionQuantity; // número de temporadas o sesiones

    // Constructor obligatorio: title, genre, duration
    public Series(String title, String genre, int duration) {
        // Llamamos al constructor de Film
        // creator se deja null por defecto, year se asigna luego con setYear()
        super(title, genre, null, duration);
        this.sessionQuantity = 0;
    }

    // Getter y Setter de sessionQuantity
    public int getSessionQuantity() {
        return sessionQuantity;
    }

    public void setSessionQuantity(int sessionQuantity) {
        this.sessionQuantity = sessionQuantity;
    }

    // toString()
    @Override
    public String toString() {
        return "Series{" +
                "sessionQuantity=" + sessionQuantity +
                ", id=" + getId() +
                ", title='" + getTitle() + '\'' +
                ", genre='" + getGenre() + '\'' +
                ", creator='" + getCreator() + '\'' +
                ", duration=" + getDuration() +
                ", year=" + getYear() +
                ", viewed=" + isViewed() +
                '}';
    }
}   