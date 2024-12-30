package com.isracart.pages;

import com.isracart.common.Config;
import com.isracart.common.Conversion;
import com.isracart.common.SeleniumBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OuncesToGramsPageTests extends SeleniumBase {

    Config config = new Config();
    Conversion conversion = new Conversion();
    private final String localUrl = "/weight/ounces-to-grams.htm";

    @Test
    public void testOuncesToGrams() {
        HomePage homePage = new HomePage(getDriver());
        homePage.openHomePage(localUrl);
        OuncesToGramsPage ouncesPage = new OuncesToGramsPage(getDriver());
        ouncesPage.enterOunces(config.getProperty("OCUNIT_TO_CONVERT"));
        String result = conversion.getNumberOnly(ouncesPage.getGramsResult());
        Assert.assertEquals(result, config.getProperty("EXPECTED_GRAMS"), "Ounces to Grams conversion failed");
    }
}
