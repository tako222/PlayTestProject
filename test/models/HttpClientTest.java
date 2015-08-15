package models;

import static org.junit.Assert.*;
import models.result.WeatherResult;

import org.junit.Test;

public class HttpClientTest {

    @Test
    public void testSearchURL() {
        WeatherResult result = HttpClient
                .searchURL("http://api.openweathermap.org/data/2.5/weather?q=Kyoto,jp");

        assertTrue(135.75 == result.coord.lon);
        assertTrue(35.02 == result.coord.lat);

    }

}
