import java.util.List;

public class Book extends Publication {
    private int id;            // Identificador único del libro
    private String isbn;       // Código ISBN
    private boolean readed;    // Indicador si fue leído
    private int timeReaded;    // Tiempo total de lectura en minutos

    // Constructor obligatorio: title, editionDate, editorial, isbn
    public Book(String title, String editionDate, String editorial, String isbn) {
        super(title, editionDate, editorial); // inicializa atributos heredados
        this.isbn = isbn;
        this.readed = false;
        this.timeReaded = 0;
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    public boolean isReaded() { return readed; }
    public void setReaded(boolean readed) { this.readed = readed; }

    public int getTimeReaded() { return timeReaded; }
    public void setTimeReaded(int timeReaded) { this.timeReaded = timeReaded; }

    // toString()
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + getTitle() + '\'' +
                ", editionDate='" + getEditionDate() + '\'' +
                ", editorial='" + getEditorial() + '\'' +
                ", authors=" + getAuthors() +
                ", isbn='" + isbn + '\'' +
                ", readed=" + readed +
                ", timeReaded=" + timeReaded +
                '}';
    }
}