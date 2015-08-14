package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.main;

/**
 * トップページ
 * 
 * @author tako
 *
 */
public class Application extends Controller {

    public static Result index() {
        return ok(main.render());
    }
}