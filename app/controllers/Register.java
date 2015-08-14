package controllers;

import models.User;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import utils.FormUtil;
import views.html.register;

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