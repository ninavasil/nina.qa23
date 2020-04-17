package com.telran.qa.tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class OpenGoogle {
    WebDriver wd;
    @BeforeMethod

    public void setUp(){
    wd=new ChromeDriver();
    }

    @Test
    public void testOpenGoogle(){
    wd.get("https://www.google.com/");
    }

    @AfterMethod
    public void tearDown(){

    }
}
