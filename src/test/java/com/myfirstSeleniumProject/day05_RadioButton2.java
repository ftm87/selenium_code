package com.myfirstSeleniumProject;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class day05_RadioButton2 {

    static WebDriver driver;
    @BeforeAll
    public static void setUp(){

        // 1. create driver object from WebDriver class
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


    }

    @Test
    public  void test1() throws InterruptedException {


//        Create a class : RadioButton
//
//        Complete the following task.
//
//        Go to https://www.facebook.com/


       driver.get("https://www.facebook.com/r.php?entry_point=login");

        driver.findElement(By.xpath("(//div[@aria-label='Allow all cookies'])[2]")).click();

        Faker faker=new Faker();//bunu olusturmadaki sebeb faker clasinda kendimize fake heasplar olusturmak

        //        Click on Create an Account button

        //1.adim firstname

        WebElement firstName=driver.findElement(By.xpath("//input[@name='firstname']"));

        firstName.sendKeys(faker.name().firstName());

        Thread.sleep(3000);
        //2.adim lastname

        WebElement lastName=driver.findElement(By.xpath("(//input[@type='text'])[2]"));

        lastName.sendKeys(faker.name().lastName());


        //3.adim gender

        WebElement male=driver.findElement(By.xpath("//input[@value='2']"));

        male.click();

        if (!male.isSelected()){

            male.click();

        }


        //4.adim mail

        WebElement mail=driver.findElement(By.xpath("//input[@name='reg_email__']"));

        mail.sendKeys(faker.internet().emailAddress());

        //5.adim password

        WebElement password=driver.findElement(By.xpath("//input[@id='password_step_input']"));

        password.sendKeys(faker.internet().password().toLowerCase());

       //6. adim Signup

        WebElement signup=driver.findElement(By.xpath("//button[@name='websubmit']"));

        signup.click();

    }
}
