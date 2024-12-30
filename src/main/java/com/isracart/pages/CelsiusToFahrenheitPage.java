package com.isracart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CelsiusToFahrenheitPage {

    private WebDriver driver;

    private By celsiusInput = By.id("celsius");
    private By fahrenheitOutput = By.id("fahrenheit");

    public CelsiusToFahrenheitPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterCelsius(String celsius) {
        WebElement inputField = driver.findElement(celsiusInput);
        inputField.clear();
        inputField.sendKeys(celsius);
    }

    public String getFahrenheitResult() {
        return driver.findElement(fahrenheitOutput).getText();
    }
}
