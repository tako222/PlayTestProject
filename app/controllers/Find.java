package controllers;

import java.util.List;

import com.avaje.ebean.Query;

import models.User;
import play.db.ebean.Model.Finder;
import play.mvc.Controller;
import play.mvc.Result;
import utils.FormUtil;
import views.html.find;
import views.html.view;

/**
 * 検索
 * @author tako
 *
 */
public class Find extends Controller {

    public static Result index() {
        return ok(find.render());
    }

    public static Result find() {

        final String name = FormUtil.getData("name");
        Finder<Long, User> finder = new Finder<>(Long.class, User.class);
        Query<User> query = finder.where("name like '%" + name + "%'");
        List<User> users = query.findList();

        return ok(view.render(users));
    }
}