import models.Book;
import models.Borrower;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {


    Borrower borrower;

    @Before
    public void setUp() throws Exception {
        borrower = new Borrower("Harjit" );

    }

    @Test
    public void getName() {
        assertEquals("Harjit", borrower.getName());

    }
}

