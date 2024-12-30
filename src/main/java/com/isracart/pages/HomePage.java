package com.isracart.pages;

import com.isracart.common.Config;
import org.openqa.selenium.WebDriver;


public class HomePage {

    Config config = new Config();
    WebDriver driver;

    private final String BASE_URL = config.getProperty("BASE_URL_METRIC");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void openHomePage(String url){
        driver.get(BASE_URL + url);
    }
}
