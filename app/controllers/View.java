package controllers;

import java.util.List;
import models.User;
import play.db.ebean.Model.Finder;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.view;

public class View extends Controller {

    public static Result index() {

        // 現在のParentを全検索して表示
        Finder<Long, User> finder = new Finder<>(Long.class, User.class);
        List<User> users = finder.all();

        return ok(view.render(users));
    }
}