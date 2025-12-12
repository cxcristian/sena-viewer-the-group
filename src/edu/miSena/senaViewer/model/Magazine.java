package edu.miSena.senaViewer.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Magazine extends Publication {
    private int id;

    public Magazine(String title, Date edititionDate, String editorial) {
        super(title, edititionDate, editorial);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static List<Magazine> makeMagazinesList() {
        List<Magazine> magazines = new ArrayList<>();
        magazines.add(new Magazine("National Geographic", new Date(), "National Geographic Society"));
        magazines.add(new Magazine("Time", new Date(), "Time USA, LLC"));
        magazines.add(new Magazine("The New Yorker", new Date(), "Condé Nast"));
        magazines.add(new Magazine("Wired", new Date(), "Condé Nast"));
        return magazines;
    }

    @Override
    public String toString() {
        return "Magazine :: " +
                "Title: '" + getTitle() + "'" +
                ", Editorial: '" + getEditorial() + "'" +
                ", Edition Date: '" + getEdititionDate() + "'";
    }
}
