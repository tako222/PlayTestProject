package models.result;

import java.util.List;

import com.google.api.client.util.Key;

public class WeatherResult {
    @Key
    public Coord coord;
    @Key
    public List<Weather> weather;
    @Key
    public String base;
    @Key
    public Main main;
    @Key
    public int visibility;
    @Key
    public Wind wind;
    @Key
    public Clouds clouds;
    @Key
    public int dt;
    @Key
    public Sys sys;
    @Key
    public int id;
    @Key
    public String name;
    @Key
    public int cod;
}
