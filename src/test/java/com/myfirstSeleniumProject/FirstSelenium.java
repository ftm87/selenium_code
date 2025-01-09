package com.myfirstSeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium {


    public static void main(String[] args) {

        //1.setep:System property is used to insiste the driver
        //drirver :otomotik icin sistem property kullanilir

        System.getProperty("webdriver.chrome.driver","drivers/chromedriver.exe");


        //2.step:creat the chrome driver

        WebDriver driver=new ChromeDriver();

        //3.step:go to the website

       // driver.get("https://www.amazon.com.tr/");
        driver.get("https://www.techproeducation.com/program/full-stack-python-developer");
    }
}
