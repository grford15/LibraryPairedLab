import models.Book;
import models.Genre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book animalFarm;

    @Before
    public void setUp() throws Exception {
        Book animalFarm = new Book("Animal Farm", "George Orwell", Genre.FANTASY);
    }

    @Test
    public void bookIsNotOnLoan() {
        assertEquals(false, animalFarm.isOnLoan());
    }
}
