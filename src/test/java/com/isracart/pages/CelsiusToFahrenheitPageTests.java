package com.isracart.pages;

import com.isracart.common.Config;
import com.isracart.common.SeleniumBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CelsiusToFahrenheitPageTests extends SeleniumBase {

    private final String localUrl = "/temperature/celsius-to-fahrenheit.htm";
    Config config = new Config();
    @Test
    public void testCelsiusToFahrenheit() {
        HomePage homePage = new HomePage(getDriver());
        homePage.openHomePage(localUrl);
        CelsiusToFahrenheitPage celsiusPage = new CelsiusToFahrenheitPage(getDriver());
        celsiusPage.enterCelsius(config.getProperty("CELSIUS_TO_CONVERT"));
        String result = celsiusPage.getFahrenheitResult();
        Assert.assertEquals(result, config.getProperty("EXPECTED_FAHRENHEIT"), "Celsius to Fahrenheit conversion failed");
        closeDriver();
    }
}
