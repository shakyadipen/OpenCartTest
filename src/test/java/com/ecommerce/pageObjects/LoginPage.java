package com.ecommerce.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver ldriver;
    public LoginPage(WebDriver rdriver){

        ldriver=rdriver;
        PageFactory.initElements(ldriver,this);
    }
    @FindBy(id="email")
    @CacheLookup
    WebElement emailfield;
    @FindBy(id="pass")
    @CacheLookup
    WebElement passwordfield;

    @FindBy(xpath="li>a[class=\"f-left\"]")
    @CacheLookup
    WebElement forgotpassword;
    @FindBy(xpath="//*[@id=\"send2\"]")
    @CacheLookup
    WebElement loginButton;
    public void setEmail(){
        //emailfield.click();
        emailfield.sendKeys("Shakyadipen@gmail.com");

    }
    public void setPassword(){
        passwordfield.sendKeys("1234567890a");
    }
    public void loginClick(){
        loginButton.click();
    }
}
