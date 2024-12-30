package com.isracart.api;

import com.isracart.common.Config;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class WeatherApi {

    Config config = new Config();
    private static String base_api_url;
    private static String api_key;
    private static String zip_code;

    public WeatherApi() {
        this.base_api_url = config.getProperty("WEATHER_API_URL");
        this.api_key = config.getProperty("WEATHER_API_KEY");
        this.zip_code = config.getProperty("ZIP_CODE");
        ;
    }

    public static double getTemperatureFromWeatherAPI() {
        String url = base_api_url + "?key=" + api_key + "&q=" + zip_code;

        Response response = RestAssured.get(url);

        return response.jsonPath().getDouble("current.temp_f");
    }

}
