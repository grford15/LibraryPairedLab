package models;

public class Book {

    private int id;
    private String title;
    private String author;
    private boolean onLoan;
    private Borrower currentBorrower;
    private Genre genre;

    public Book(String title, String author, boolean onLoan, Genre genre) {
        this.title = title;
        this.author = author;
        this.onLoan = false;
        this.currentBorrower = currentBorrower;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isOnLoan() {
        return onLoan;
    }

    public void setOnLoan(boolean onLoan) {
        this.onLoan = onLoan;
    }

    public Borrower getCurrentBorrower() {
        return currentBorrower;
    }

    public void setCurrentBorrower(Borrower currentBorrower) {
        this.currentBorrower = currentBorrower;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
