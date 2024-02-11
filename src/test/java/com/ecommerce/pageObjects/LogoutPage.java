package com.ecommerce.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
    WebDriver ldriver;
    public LogoutPage(WebDriver rdriver){
        ldriver=rdriver;
        PageFactory.initElements(ldriver,this);
    }
    @FindBy(xpath = "/html/body/div[2]/div/header/div/div[2]/div/a")
    @CacheLookup
    WebElement acc;

    @FindBy(xpath="//*[@id=\"header-account\"]/div/ul/li[5]/a")
    @CacheLookup
    WebElement LogoutButton;
    public void accountClick(){
        acc.click();
    }
    public void logoutClick(){
        LogoutButton.click();
    }
}
