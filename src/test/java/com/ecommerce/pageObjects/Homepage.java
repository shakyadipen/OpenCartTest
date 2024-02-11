package com.ecommerce.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
    WebDriver ldriver;
    public Homepage(WebDriver rdriver){
        ldriver=rdriver;
        PageFactory.initElements(ldriver,this);

    }
    @FindBy(xpath = "//*[@id=\"header\"]/div/div[2]/div/a/span[2]")
            @CacheLookup
    WebElement Account;
    @FindBy(xpath="//html[@id='top']//div[@id='header-account']//a[@title='Log In']")
    //@FindBy()
            @CacheLookup
      //      #header-account > div > ul > li.last > a
    WebElement LoginButton;
    public void accountClick(){
        Account.click();
    }
    public void loginClick(){
        LoginButton.click();
    }
}
