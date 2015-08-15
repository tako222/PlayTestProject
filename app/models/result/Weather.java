package models.result;

import com.google.api.client.util.Key;

public class Weather {
    @Key
    public int id;
    @Key
    public String main;
    @Key
    public String description;
    @Key
    public String icon;
}
