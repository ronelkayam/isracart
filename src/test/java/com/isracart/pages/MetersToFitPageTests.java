package com.isracart.pages;

import com.isracart.common.Config;
import com.isracart.common.Conversion;
import com.isracart.common.SeleniumBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MetersToFitPageTests extends SeleniumBase {

    Config config = new Config();
    private final String localUrl = "/length/meters-to-feet.htm";

    Conversion conversion = new Conversion();

    @Test
    public void testMetersToFeet() {
        HomePage homePage = new HomePage(getDriver());
        homePage.openHomePage(localUrl);
        MetersToFeetPage metersPage = new MetersToFeetPage(getDriver());
        metersPage.enterMeters(config.getProperty("METER_TO_CONVERT"));
        String result = conversion.getNumberOnly(metersPage.getFeetResult());
        Assert.assertEquals(result, config.getProperty("EXPECTED_FEET"), "Meters to Feet conversion failed");
    }
}
