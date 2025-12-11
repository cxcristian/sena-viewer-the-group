import java.util.List;
import java.util.ArrayList;

public class Publication {
    private String title;
    private String editionDate;
    private String editorial;
    private List<String> authors;

    // Constructor obligatorio
    public Publication(String title, String editionDate, String editorial) {
        this.title = title;
        this.editionDate = editionDate;
        this.editorial = editorial;
        this.authors = new ArrayList<>(); // inicialización de la lista
    }

    // Getters y Setters
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getEditionDate() { return editionDate; }
    public void setEditionDate(String editionDate) { this.editionDate = editionDate; }

    public String getEditorial() { return editorial; }
    public void setEditorial(String editorial) { this.editorial = editorial; }

    public List<String> getAuthors() { return authors; }
    public void setAuthors(List<String> authors) { this.authors = authors; }
    public void addAuthor(String author) { this.authors.add(author); }

    // toString()
    @Override
    public String toString() {
        return "Publication{" +
                "title='" + title + '\'' +
                ", editionDate='" + editionDate + '\'' +
                ", editorial='" + editorial + '\'' +
                ", authors=" + authors +
                '}';
    }
}