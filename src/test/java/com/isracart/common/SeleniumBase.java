package com.isracart.common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class SeleniumBase {


    private static WebDriver driver;


    public static WebDriver getDriver() {
        if (driver == null) {
                    System.out.println("Starting Test...");
                    WebDriverManager.chromedriver().driverVersion("131.0.6778.205").setup();
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--start-maximized");
                    options.addArguments("--remote-allow-origins=*");
                    driver = new ChromeDriver(options);
                }
        return driver;
    }


    @AfterAll
    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
