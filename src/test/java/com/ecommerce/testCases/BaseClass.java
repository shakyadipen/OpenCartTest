package com.ecommerce.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
//import java.util.logging.Logger;
//import java.util.logging.Logger;

public class BaseClass {
    public static WebDriver driver;
   //ChromeOptions options;
    public static Logger logger;
   @BeforeSuite
    public void setup(){
       logger=Logger.getLogger("OpenCartTesting");
        PropertyConfigurator.configure("log4j.properties");
       String path=System.getProperty("user.dir");
       System.out.println(path);

        System.setProperty("webdriver.chrome.driver",path+".\\Driver\\chromedriver.exe");
        //options=new ChromeOptions();
        driver= new ChromeDriver();
        driver.get("https://ecommerce.tealiumdemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);



    }
    @AfterSuite
    public void teardown(){
       driver.quit();
    }



    //}

}
