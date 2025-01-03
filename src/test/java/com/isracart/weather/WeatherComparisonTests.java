package com.isracart.weather;
import com.isracart.api.WeatherApi;
import com.isracart.common.SeleniumBase;
import com.isracart.pages.WeatherPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WeatherComparisonTests extends SeleniumBase {

    WeatherApi weatherApi = new WeatherApi();

    WeatherPage weatherPage = new WeatherPage(getDriver());

    @Test
    public void testTemperatureComparison() throws InterruptedException {

        double apiTemperature = weatherApi.getTemperatureFromWeatherAPI();
        double seleniumTemperature = weatherPage.getTemperatureFromWeatherUI();
        double difference = Math.abs(seleniumTemperature - apiTemperature);
        double maxAllowedDifference = 10.0;

        Assert.assertTrue(difference <= maxAllowedDifference, "The difference between temperatures is more than 10%");
    }
}
