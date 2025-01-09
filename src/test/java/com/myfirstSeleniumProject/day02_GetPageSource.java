package com.myfirstSeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day02_GetPageSource {
    public static void main(String[] args) {

//        Test if amazon contains "Registry" on the homepage
//        Create a new class : GetPageSource

        //1 STEP, CREATE AN OBJECT FROM WEBDRIVER

        WebDriver driver=new ChromeDriver();


        //2.step, set the window as maximize

        driver.manage().window().maximize();


        //3.step, get methodunu kullan ve sayfaya git

        driver.get("https://www.amazon.com.tr/");

        driver.navigate().refresh();

        //4.step get page source

       String actualResult=driver.getPageSource();

        //5.step, verify registry is on the page

       if (actualResult.contains("Register")){
           System.out.println("Amazon has Registery keyword and out test case is passed");
       }else {
           System.out.println("Test case failed");
       }


        //6.step, close the window

        driver.close();

    }
}
