package com.isracart.pages;

import com.isracart.common.Config;
import com.isracart.common.SeleniumBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CelsiusToFahrenheitPageTests extends SeleniumBase {

    @Test
    public void testCelsiusToFahrenheit() {
        HomePage homePage = new HomePage(getDriver());
        homePage.openHomePage();
        CelsiusToFahrenheitPage celsiusPage = new CelsiusToFahrenheitPage(getDriver());
        celsiusPage.enterCelsius(Config.getProperty("CELSIUS_TO_CONVERT"));
        String result = celsiusPage.getFahrenheitResult();
        Assert.assertEquals(result, Config.getProperty("EXPECTED_FAHRENHEIT"), "Celsius to Fahrenheit conversion failed");
        closeDriver();
    }
}
