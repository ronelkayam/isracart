package com.isracart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MetersToFeetPage {

    private WebDriver driver;

    private By metersInput = By.id("meters");
    private By feetOutput = By.id("feet");

    public MetersToFeetPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterMeters(String meters) {
        WebElement inputField = driver.findElement(metersInput);
        inputField.clear();
        inputField.sendKeys(meters);
    }

    public String getFeetResult() {
        return driver.findElement(feetOutput).getText();
    }
}