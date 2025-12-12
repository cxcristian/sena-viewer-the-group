package edu.miSena.senaViewer.model;

import java.util.Date;

public class Chapter {

    private static int counter = 0;

    private int id;
    private String title;
    private int duration;
    private int year;
    private boolean viewed;
    private int timeViewed;
    private int sessionNumber;
    private Date startViewingDate;

    public Chapter(String title, int duration, int year) {
        this.id = ++counter;
        this.title = title;
        this.duration = duration;
        this.year = year;
        this.viewed = false;
        this.timeViewed = 0;
    }

    public Date getStartViewingDate() {
        return startViewingDate;
    }

    public void setStartViewingDate(Date startViewingDate) {
        this.startViewingDate = startViewingDate;
    }


    // Getters y Setters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isViewed() {
        return viewed;
    }

    public void setViewed(boolean viewed) {
        this.viewed = viewed;
    }

    public int getTimeViewed() {
        return timeViewed;
    }

    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
    }

    public int getSessionNumber() {
        return sessionNumber;
    }

    public void setSessionNumber(int sessionNumber) {
        this.sessionNumber = sessionNumber;
    }

    @Override
    public String toString() {
        return "Chapter{"
                + "id=" + id +
                ", title='" + title + "'" +
                ", duration=" + duration +
                ", year=" + year +
                ", viewed=" + viewed +
                ", timeViewed=" + timeViewed +
                ", sessionNumber=" + sessionNumber +
                '}';
    }
}