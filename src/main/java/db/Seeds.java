package db;

import models.Book;
import models.Borrower;
import models.Genre;

public class Seeds {

    public static void seedData(){

        Book animalFarm = new Book("Animal Farm", "George Orwell", Genre.FANTASY);
        DBHelper.save(animalFarm);

        Borrower borrower = new Borrower("Harjit" );
        DBHelper.save(borrower);
    }
}
