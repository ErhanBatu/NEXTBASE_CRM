package com.NextBase.pages;


import com.NextBase.utilities.ConfigurationReader;
import com.NextBase.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(),this);
    }
    //driver.findElement(By.id("prependedInput"));
    @FindAll({
            @FindBy(xpath = "//input[@type='text']"),
            @FindBy(name ="USER_LOGIN")
    })
    public WebElement usernameInput;
    @FindBy(name = "USER_PASSWORD")
    public WebElement passwordInput;
    //driver.findElement(By.id("_submit"));
    @FindBy(xpath = "//input[@type='submit']")
    public WebElement loginBtn;

    public void login(){
        usernameInput.sendKeys(ConfigurationReader.get("username"));
        passwordInput.sendKeys(ConfigurationReader.get("password"));
        loginBtn.click();
    }


}
