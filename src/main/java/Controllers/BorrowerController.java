package Controllers;

import db.DBHelper;
import models.Book;
import models.Borrower;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static spark.Spark.get;

public class BorrowerController {

    public BorrowerController() {
        this.setupEndpoints();
    }

    private void setupEndpoints() {

        get("/borrowers", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            List<Borrower> borrowers = DBHelper.getAll(Borrower.class);
            model.put("template", "templates/borrowers/index.vtl");
            model.put("borrowers", borrowers);
            return new ModelAndView(model, "templates/layout.vtl");
        }, new VelocityTemplateEngine());

        get ("/borrowers/new", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            List<Book> books = DBHelper.getAll(Book.class);
            model.put("books", books);
            model.put("template", "templates/borrowers/create.vtl");
            return new ModelAndView(model, "templates/layout.vtl");
        }, new VelocityTemplateEngine());


        get("/borrowers/:id", (req, res) -> {
            HashMap<String, Object> model = new HashMap<>();
           Borrower borrower = DBHelper.find(Borrower.class, Integer.parseInt(req.params(":id")));
            model.put("Borrower", borrower);
            model.put("template", "templates/borrowers/show.vtl");
            return new ModelAndView(model, "templates/layout.vtl");
        }, new VelocityTemplateEngine());




    }


//
//    private String name;
//    private Set<Book> itemsBorrowed;
}
