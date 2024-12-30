package com.isracart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OuncesToGramsPage {

    private WebDriver driver;

    private String ouncesInput = "singleArg";
    private By gramsOutput = By.id("answerDisplay");

    public OuncesToGramsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterOunces(String ounces) {
        WebElement inputField = driver.findElement(By.className(ouncesInput));
        inputField.clear();
        inputField.sendKeys(ounces);
    }

    public String getGramsResult() {
        return driver.findElement(gramsOutput).getText();
    }
}
