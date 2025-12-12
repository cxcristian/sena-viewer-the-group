package edu.miSena.senaViewer.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Publication {
    private String title;
    private Date edititionDate;
    private String editorial;
    private String[] authors;
    private Date startReadingDate;

    public Publication(String title, Date edititionDate, String editorial, String[] authors) {
        this.title = title;
        this.edititionDate = edititionDate;
        this.editorial = editorial;
        this.authors = authors;
    }

    public Date getStartReadingDate() {
        return startReadingDate;
    }

    public void setStartReadingDate(Date startReadingDate) {
        this.startReadingDate = startReadingDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getEdititionDate() {
        return edititionDate;
    }

    public void setEdititionDate(Date edititionDate) {
        this.edititionDate = edititionDate;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }
}
