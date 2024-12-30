package com.isracart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CelsiusToFahrenheitPage {

    private WebDriver driver;
    private String celsiusInput = "singleArg";
    private By fahrenheitOutput = By.id("answerDisplay");

    public CelsiusToFahrenheitPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterCelsius(String celsius) {
        WebElement inputField = driver.findElement(By.className(celsiusInput));
        inputField.clear();
        inputField.sendKeys(celsius);
    }

    public String getFahrenheitResult() {
        return driver.findElement(fahrenheitOutput).getText();
    }
}
