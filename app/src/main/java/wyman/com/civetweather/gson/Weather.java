package wyman.com.civetweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather {
    public String atatus;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
