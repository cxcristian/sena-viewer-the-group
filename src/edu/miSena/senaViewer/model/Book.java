package edu.miSena.senaViewer.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Book extends Publication {
    private int id;
    private String isbn;
    private boolean readed;
    private int timeReaded;

    public Book(String title, Date edititionDate, String editorial, String[] authors, String isbn) {
        super(title, edititionDate, editorial, authors);
        this.isbn = isbn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isReaded() {
        return readed;
    }

    public void setReaded(boolean readed) {
        this.readed = readed;
    }

    public int getTimeReaded() {
        return timeReaded;
    }

    public void setTimeReaded(int timeReaded) {
        this.timeReaded = timeReaded;
    }

    public static List<Book> makeBooksList() {
        List<Book> books = new ArrayList<>();
        String[] authors = new String[1];
        authors[0] = "Gabriel García Márquez";
        books.add(new Book("Cien Años de Soledad", new Date(), "Harper & Row", authors, "978-0060883287"));

        authors = new String[1];
        authors[0] = "George Orwell";
        books.add(new Book("1984", new Date(), "Secker & Warburg", authors, "978-0451524935"));
        
        authors = new String[1];
        authors[0] = "J.R.R. Tolkien";
        books.add(new Book("El Señor de los Anillos", new Date(), "Allen & Unwin", authors, "978-0618640157"));
        
        authors = new String[1];
        authors[0] = "Antoine de Saint-Exupéry";
        books.add(new Book("El Principito", new Date(), "Reynal & Hitchcock", authors, "978-0156012195"));
        
        return books;
    }

    @Override
    public String toString() {
        return "Book :: " +
                "\n Title: '" + getTitle() + "'" +
                "\n Editorial: '" + getEditorial() + "'" +
                "\n Edition Date: '" + getEdititionDate() + "'" +
                "\n Authors: " + String.join(", ", getAuthors()) +
                "\n ISBN: '" + isbn + "'";
    }
}