package models;

import models.Book;

import java.util.ArrayList;

public class Library {
    private int id;
    private String name;
    private ArrayList<Book> books;
    private ArrayList<Borrower> borrowers;

    public Library(String name, ArrayList<Book> books, ArrayList<Borrower> borrowers) {
        this.name = name;
        this.books = books;
        this.borrowers = borrowers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Borrower> getBorrowers() {
        return borrowers;
    }

    public void setBorrowers(ArrayList<Borrower> borrowers) {
        this.borrowers = borrowers;
    }
}
