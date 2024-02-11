package com.ecommerce.testCases;

import com.ecommerce.pageObjects.Homepage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class homepageTest extends BaseClass {
    Homepage hp;

 @Test
    public void homePageTest(){
     hp=new Homepage(driver);
     logger.info("Homepage");
     hp.accountClick();
     logger.info("Account Button CLicked Successfully");
     driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
     hp.loginClick();
     logger.info("Login Link CLicked Successfully");




    }

}
