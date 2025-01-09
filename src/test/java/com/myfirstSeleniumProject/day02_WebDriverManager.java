package com.myfirstSeleniumProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class day02_WebDriverManager {
    public static void main(String[] args) {

        //Webdrivermanager dependency i pom.xml dosyasina ekledik ve
        // bixzim icin artik system.setproperty kullnamamzia gerek kalmadi



        //WebdriverManager eklenince ne oluyor?

        WebDriverManager.chromedriver().setup();


        // Webdriver interface classindan driver objesi olusturuyoruz....

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();


        //Navigate to the page

        driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.9.2");


        //Close the application

        driver.close();





    }
}
