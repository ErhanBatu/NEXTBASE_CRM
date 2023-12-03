package com.NextBase.pages;

import com.NextBase.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.text.html.CSS;

public class FilterAndSearch {

    public FilterAndSearch() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy (css = "#LIVEFEED_search")
    public WebElement FilterAndSearch;

    @FindBy(xpath = "//div[@data-id='work']")
    public WebElement Work;

    @FindBy(xpath = "//*[contains(@class,\"main-ui-search\")]")
    public WebElement Search;

    @FindBy(xpath = "//div[@data-id='favorites']")
    public WebElement Favorites;

    public void FavoritesEnter(String element, String sendKey) throws InterruptedException {

        FilterAndSearch.click();
        WebElement Element = Driver.get().findElement(By.xpath("//div[@data-id='"+element.toLowerCase()+"']"));
        Element.click();
        FilterAndSearch.click();
        FilterAndSearch.sendKeys(sendKey);
        Search.click();
        Thread.sleep(2000);
        FilterAndSearch.clear();

    }

}
