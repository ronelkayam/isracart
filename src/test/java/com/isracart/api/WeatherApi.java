package com.isracart.api;

import com.isracart.common.Config;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class WeatherApi {

    private static final String BASE_API_URL = "https://api.weatherapi.com/v1/current.json?key=";
    private static final String API_KEY = Config.getProperty("WEATHER_API_KEY");
    private static final String ZIP_CODE = Config.getProperty("ZIP_CODE");


    public static double getTemperatureFromWeatherAPI() {
        String url = BASE_API_URL + API_KEY + "&q=" + ZIP_CODE;

        Response response = RestAssured.get(url);

        double temperature = response.jsonPath().getDouble("current.temp_f");
        return temperature;
    }

}
