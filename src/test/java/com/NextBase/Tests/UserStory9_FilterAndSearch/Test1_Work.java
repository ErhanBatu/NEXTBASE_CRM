package com.NextBase.Tests.UserStory9_FilterAndSearch;

import com.NextBase.Tests.TestBase;
import com.NextBase.pages.FilterAndSearch;
import com.NextBase.pages.LoginPage;
import com.NextBase.utilities.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1_Work extends TestBase{

    @Test
    public void Test1(){

        extentLogger = report.createTest("FilterSearchTest");
        extentLogger.info("Username, password, click-login button");
        LoginPage loginPage = new LoginPage();
        loginPage.login();

        FilterAndSearch filterAndSearch = new FilterAndSearch();
        extentLogger.info("Search box");
        filterAndSearch.FilterAndSearch.click();
        extentLogger.info("Work button");
        filterAndSearch.Work.click();
        extentLogger.info("Enter some values");
        filterAndSearch.FilterAndSearch.sendKeys("market");
        extentLogger.info("Search");
        filterAndSearch.Search.click();

        Assert.assertTrue(filterAndSearch.Search.isEnabled());
        extentLogger.pass("PASSED");

    }

}
