package com.NextBase.Tests.UserStory9_FilterAndSearch;

import com.NextBase.Tests.TestBase;
import com.NextBase.pages.FilterAndSearch;
import com.NextBase.pages.LoginPage;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Test2_Favorites extends TestBase {

    @Test
    public void Test2() throws InterruptedException{

        LoginPage loginPage = new LoginPage();
        loginPage.login();
        FilterAndSearch filterAndSearch = new FilterAndSearch();
        filterAndSearch.FavoritesEnter("favorites","help");
        filterAndSearch.FavoritesEnter("work","market");

    }

}
