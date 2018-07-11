package Controllers;

import db.DBHelper;
import db.Seeds;
import models.Book;
import models.Borrower;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static spark.Spark.get;

public class LibraryController {

    public static void main(String[] args) {

        Seeds.seedData();

        get("/library", (req, res) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            List<Book> books = DBHelper.getAll(Book.class);
            List<Borrower> borrowers = DBHelper.getAll(Borrower.class);
            model.put("books", books);
            model.put("borrowers", borrowers);
            model.put("template", "library/index.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, new VelocityTemplateEngine());
    }
}
