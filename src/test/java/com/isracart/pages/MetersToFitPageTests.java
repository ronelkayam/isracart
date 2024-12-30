package com.isracart.pages;

import com.isracart.common.Config;
import com.isracart.common.SeleniumBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MetersToFitPageTests extends SeleniumBase {

    private final String localUrl = "/length/meters-to-feet.htm";
    @Test
    public void testMetersToFeet() {
        HomePage homePage = new HomePage(getDriver());
        homePage.openHomePage(localUrl);
        MetersToFeetPage metersPage = new MetersToFeetPage(getDriver());
        metersPage.enterMeters(Config.getProperty("METER_TO_CONVERT"));
        String result = metersPage.getFeetResult();
        Assert.assertEquals(result, Config.getProperty("EXPECTED_FEET"), "Meters to Feet conversion failed");
        closeDriver();
    }
}
