package com.vtrack.pages;

import com.vtrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LogoutPage {
    public LogoutPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//a[@class='dropdown-toggle']")
    public WebElement dropdown;

    @FindBy(xpath = "//a[@class='no-hash']")
    public WebElement logout;


}
