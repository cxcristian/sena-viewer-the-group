public class Movie extends Film {

    private int timeViewed;

    // Constructor con el construc de la clase Film 
    public Movie(String title, String genre, String creator, int duration, int year) {
        super(title, genre, creator, duration);
        this.setYear(year);
    }

    // Getters - Setters
    public int getTimeViewed() {
        return timeViewed;
    }

    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
    }

    @Override
    public String toString() {
        return "Movie {" +
                "id=" + getId() +
                ", title='" + getTitle() + '\'' +
                ", genre='" + getGenre() + '\'' +
                ", creator='" + getCreator() + '\'' +
                ", duration=" + getDuration() +
                ", year=" + getYear() +
                ", viewed=" + isViewed() +
                ", timeViewed=" + timeViewed +
                '}';
    }
}
