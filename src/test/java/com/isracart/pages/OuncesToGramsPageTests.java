package com.isracart.pages;

import com.isracart.common.Config;
import com.isracart.common.SeleniumBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OuncesToGramsPageTests extends SeleniumBase {

    @Test
    public void testOuncesToGrams() {
        HomePage homePage = new HomePage(getDriver());
        homePage.openHomePage();
        OuncesToGramsPage ouncesPage = new OuncesToGramsPage(getDriver());
        ouncesPage.enterOunces(Config.getProperty("OCUNIT_TO_CONVERT"));
        String result = ouncesPage.getGramsResult();
        Assert.assertEquals(result, Config.getProperty("EXPECTED_GRAMS"), "Ounces to Grams conversion failed");
        closeDriver();
    }
}