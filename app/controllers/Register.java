package controllers;

import models.User;
import play.mvc.Controller;
import play.mvc.Result;
import utils.FormUtil;
import views.html.register;

/**
 * 登録
 * @author tako
 *
 */
public class Register extends Controller {

    public static Result index() {
        return ok(register.render());
    }

    public static Result save() {

        User user = new User();
        user.name = FormUtil.getData("name");
        user.save();

        return (index());
    }
}