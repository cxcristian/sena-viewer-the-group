package edu.miSena.senaViewer.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Book extends Publication {
    private int id;
    private String isbn;
    private boolean readed;
    private int timeReaded;
    private Date startReadingDate;

    public Book(String title, Date edititionDate, String editorial, String isbn) {
        super(title, edititionDate, editorial);
        this.isbn = isbn;
    }

    public Date getStartReadingDate() {
        return startReadingDate;
    }

    public void setStartReadingDate(Date startReadingDate) {
        this.startReadingDate = startReadingDate;
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
        books.add(new Book("One Hundred Years of Solitude", new Date(), "Harper & Row", "978-0060883287"));
        books.add(new Book("1984", new Date(), "Secker & Warburg", "978-0451524935"));
        books.add(new Book("The Lord of the Rings", new Date(), "Allen & Unwin", "978-0618640157"));
        books.add(new Book("The Little Prince", new Date(), "Reynal & Hitchcock", "978-0156012195"));
        return books;
    }

    @Override
    public String toString() {
        return "Book :: " +
                "Title: '" + getTitle() + "'" +
                ", Editorial: '" + getEditorial() + "'" +
                ", Edition Date: '" + getEdititionDate() + "'" +
                ", ISBN: '" + isbn + "'";
    }
}