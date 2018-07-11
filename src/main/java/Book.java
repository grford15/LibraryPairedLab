public class Book {

    private int id;
    private String title;
    private String author;
    private boolean onLoan;
    private Borrower currentBorrower;
    private Genre genre;

    public Book(String title, String author, boolean onLoan, Borrower currentBorrower, Genre genre) {
        this.title = title;
        this.author = author;
        this.onLoan = onLoan;
        this.currentBorrower = currentBorrower;
        this.genre = genre;
    }
}
