package com.vtrack.pages;

import com.vtrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEventPage {
   public AddEventPage(){
       PageFactory.initElements(Driver.get(),this);}

       @FindBy(xpath = "//span[@class='title title-level-1']")
               public WebElement fleetButton;

   @FindBy(xpath = "//*[text()='Vehicles']")
    public WebElement vehicleButton;

   @FindBy(xpath = "//*[.='Cars']")
    public WebElement cars;

   @FindBy(xpath = "//*[text()='John Johnson']")
   public WebElement driver;

   @FindBy(xpath = "//*[text()='General']")
    public WebElement general;


}
