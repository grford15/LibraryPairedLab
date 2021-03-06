package controllers;

import db.DBHelper;
import models.Book;
import models.Borrower;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static spark.Spark.get;
import static spark.Spark.post;

public class BookController {
    public BookController() {
        this.setupEndpoints();
    }

    private void setupEndpoints() {

        get("/books", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            List<Book> books = DBHelper.getAll(Book.class);
            model.put("template", "templates/books/index.vtl");
            model.put("books", books);
            return new ModelAndView(model, "templates/layout.vtl");
        }, new VelocityTemplateEngine());

        get ("/books/new", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            model.put("template", "templates/books/create.vtl");
            return new ModelAndView(model, "templates/layout.vtl");
        }, new VelocityTemplateEngine());

//        post ("/books", (req, res) -> {
//            String title = req.queryParams("title");
//            String author = req.queryParams("author");
//            boolean onLoan = req.queryParams();
//            int budget = Integer.parseInt(req.queryParams("budget"));
//            Book book = new book(firstName, lastName, salary, department, budget);
//            DBHelper.save(book);
//            res.redirect("/books");
//            return null;
//        }, new VelocityTemplateEngine());
    }
}