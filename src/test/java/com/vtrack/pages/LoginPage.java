package com.vtrack.pages;

import com.vtrack.utilities.Driver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "prependedInput")
    public WebElement usernameBox;

    @FindBy(id = "prependedInput2")
    public WebElement passwordBox;

    @FindBy(id = "_submit")
    public WebElement loginButton;

    @FindBy(xpath = "//div[@class='alert alert-error']")
    public WebElement invalidError;

    @FindBy(xpath = "//a[@class='no-hash']")
    public WebElement logOut;

    @FindBy(xpath = "//a[@href='/user/reset-request']")
    public WebElement forgotPassword;

    @FindBy(css = "[type=text]")
    public WebElement forgotPasswordInputBox;

    @FindBy(css = "[type=submit]")
    public WebElement request;

    @FindBy(xpath = "//div[@class='alert alert-warn']")
    public WebElement unableError;

    @FindBy(xpath = "//span[@class='custom-checkbox__text']")
    public WebElement rememberMe;

    @FindBy(xpath = "//*[@id=\"organization-switcher\"]/div/h1")
    public WebElement fleet;

    @FindBy(xpath = "//*[@id=\"user-menu\"]/a")
    public WebElement name;

    public void login(String username, String password) {
        usernameBox.sendKeys(username);
        passwordBox.sendKeys(password);
        loginButton.click();
    }

    public void loginAsDriver() {
        usernameBox.sendKeys("user10");
        passwordBox.sendKeys("UserUser123");
        loginButton.click();
    }

    public void loginStoreManager() {
        usernameBox.sendKeys("storemanager85");
        passwordBox.sendKeys("UserUser123");
        loginButton.click();

    }

    public void loginAsSalesManager() {
        usernameBox.sendKeys("salesmanager101");
        passwordBox.sendKeys("UserUser123");
        loginButton.click();

    }

}