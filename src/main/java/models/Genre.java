package models;

public enum Genre {

    DRAMA("Drama"),
    SCIFI("Sci-FI"),
    ROMANCE("Romance"),
    HORROR("Horror"),
    FANTASY("Fantasy"),
    ADVENTURE("Adventure"),
    COMEDY("Comedy");

    private String title;

    Genre(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
