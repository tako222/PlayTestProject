package models.result;

import com.google.api.client.util.Key;

public class Sys {
    @Key
    public int type;
    @Key
    public int id;
    @Key
    public double message;
    @Key
    public String country;
    @Key
    public int sunrise;
    @Key
    public int sunset;
}
