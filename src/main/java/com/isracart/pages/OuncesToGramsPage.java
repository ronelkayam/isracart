package com.isracart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OuncesToGramsPage {

    private WebDriver driver;

    private By ouncesInput = By.id("ounces");
    private By gramsOutput = By.id("grams");

    public OuncesToGramsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterOunces(String ounces) {
        WebElement inputField = driver.findElement(ouncesInput);
        inputField.clear();
        inputField.sendKeys(ounces);
    }

    public String getGramsResult() {
        return driver.findElement(gramsOutput).getText();
    }
}
