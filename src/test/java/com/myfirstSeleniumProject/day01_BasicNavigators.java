package com.myfirstSeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day01_BasicNavigators {

    public static void main(String[] args) {

    // When user goes to walmart

    //1.ADIM driverin framworkte nerede oldugunu tanimla

        System.setProperty("webdriver.chrome","driver,drivers/chromedriver.exe");

    //2.ADIM; driver olustur

        WebDriver driver=new ChromeDriver();

    //3.ADIM;sayfayi buyut

       driver.manage().window().maximize();


    //  Then goes to amazon

        driver.get("https://www.amazon.com/");


//        Navigate to Walmart

        driver.navigate().to("https://www.walmart.com/");


//        Navigate back to amazon

        driver.navigate().back();



//        Navigate forward to Walmart

         driver.navigate().forward();

   //    Refresh the page

        driver.navigate().refresh();

    //  Close/Quit the browser

        driver.close();

    }
}
