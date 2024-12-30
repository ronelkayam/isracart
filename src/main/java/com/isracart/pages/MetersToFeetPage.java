package com.isracart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MetersToFeetPage {

    private WebDriver driver;

    private String metersInput = "singleArg";
    private By feetOutput = By.id("answerDisplay");

    public MetersToFeetPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterMeters(String meters) {
        WebElement inputField = driver.findElement(By.className(metersInput));
        inputField.clear();
        inputField.sendKeys(meters);
    }

    public String getFeetResult() {
        return driver.findElement(feetOutput).getText();
    }
}