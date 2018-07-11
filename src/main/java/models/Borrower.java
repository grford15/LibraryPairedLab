package models;

import java.util.ArrayList;

public class Borrower {
    private int id;
    private String name;
    private ArrayList<Book> itemsBorrowed;

    public Borrower(String name, ArrayList<Book> itemsBorrowed) {
        this.name = name;
        this.itemsBorrowed = itemsBorrowed;
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

    public ArrayList<Book> getItemsBorrowed() {
        return itemsBorrowed;
    }

    public void setItemsBorrowed(ArrayList<Book> itemsBorrowed) {
        this.itemsBorrowed = itemsBorrowed;
    }
}
