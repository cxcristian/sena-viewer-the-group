package edu.miSena.senaViewer.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Magazine extends Publication {
    private int id;

    public Magazine(String title, Date edititionDate, String editorial, String[] authors) {
        super(title, edititionDate, editorial, authors);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static List<Magazine> makeMagazinesList() {
        List<Magazine> magazines = new ArrayList<>();
        String[] authors = new String[1];
        authors[0] = "Varios";
        magazines.add(new Magazine("National Geographic", new Date(), "National Geographic Society", authors));
        magazines.add(new Magazine("Time", new Date(), "Time USA, LLC", authors));
        magazines.add(new Magazine("The New Yorker", new Date(), "Condé Nast", authors));
        magazines.add(new Magazine("Wired", new Date(), "Condé Nast", authors));
        return magazines;
    }

    @Override
    public String toString() {
        return "Magazine :: " +
                "\n Title: '" + getTitle() + "'" +
                "\n Editorial: '" + getEditorial() + "'" +
                "\n Edition Date: '" + getEdititionDate() + "'" +
                "\n Authors: " + String.join(", ", getAuthors());
    }
}
