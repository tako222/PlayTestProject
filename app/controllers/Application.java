package controllers;

import models.HttpClient;
import models.result.WeatherResult;
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
        
        WeatherResult result = HttpClient.searchURL("http://api.openweathermap.org/data/2.5/weather?q=Kyoto,jp");
        String iconUrl = "http://openweathermap.org/img/w/" + result.weather.get(0).icon + ".png";
        
        return ok(main.render(iconUrl));
    }
}