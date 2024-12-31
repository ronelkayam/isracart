package com.isracart.pages;

import com.isracart.common.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WeatherPage {

    static String base_url = "https://weather.com/weather/today/l/";
    static WebDriver driver;

    public WeatherPage(WebDriver driver) {
        this.driver = driver;
    }

    public static int getTemperatureFromWeatherUI() throws InterruptedException {
        driver.get(base_url + Config.getProperty("ZIP_CODE") + ":4:US");
        String tempText = driver.findElement(By.xpath("//span[@class='CurrentConditions--tempValue--zUBSz']")).getText();
        return Integer.parseInt(tempText.replace("°", "").trim());
    }
}
