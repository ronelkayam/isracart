package com.isracart.pages;

import com.isracart.common.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WeatherPage {

    static String base_url;
    static WebDriver driver;

    public WeatherPage(WebDriver driver) {
        this.driver = driver;
        this.base_url = "https://weather.com/weather/today/l/";
    }

    public static int getTemperatureFromWeatherUI() throws InterruptedException {
        driver.get(base_url + Config.getProperty("ZIP_CODE") + ":4:US");
        driver.wait(10);
        String tempText = driver.findElement(By.xpath("//span[@class='CurrentConditions--tempValue--3KcTQ']")).getText();
        return Integer.parseInt(tempText.replace("°", "").trim());
    }
}
