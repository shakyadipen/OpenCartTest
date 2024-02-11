package com.ecommerce.testCases;

import com.ecommerce.pageObjects.LogoutPage;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class LogoutTest extends BaseClass{
    LogoutPage lg;
    @Test
    public void logout(){
    lg=new LogoutPage(BaseClass.driver);
    String url=driver.getCurrentUrl();
    if(url.contains("https://ecommerce.tealiumdemo.com/customer/account/")){
        System.out.println("Login Successfull");
        logger.info("Login Successfull");
    }
    driver.navigate().refresh();
    driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
    try {
        lg.accountClick();
    }catch(StaleElementReferenceException e){
        WebElement account=driver.findElement(By.xpath("/html/body/div[2]/div/header/div/div[2]/div/a"));
        account.click();
        }
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
    lg.logoutClick();
        logger.info("Logout Successfull");
    String logoutUrl=driver.getCurrentUrl();
        if(logoutUrl.contains("https://ecommerce.tealiumdemo.com/customer/account/logoutSuccess/")){
            System.out.println("Logut Successfull");
            logger.info("Logout Successfull");
        }



}
}
