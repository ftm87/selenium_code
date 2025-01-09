package com.myfirstSeleniumProject;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class day05_RadioButton {

    static WebDriver driver;
    @BeforeAll
    public static void setUp(){

        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


    }

    @Test
    public void test01(){

        //        https://testcenter.techproeducation.com/index.php?page=radio-buttons

         driver.get("   https://testcenter.techproeducation.com/index.php?page=radio-buttons");

        //        Click on Red

        WebElement redButton=driver.findElement(By.xpath("//input[@id='red']"));

        redButton.click();// radio button oldugu icin if conditionla bir kod yazmamiza gerek yok......

        if (!redButton.isSelected()){
            redButton.click();
        }

        Assertions.assertTrue(redButton.isSelected());


//        Click on Football

        WebElement fuballButton=driver.findElement(By.cssSelector("input[id='football']"));

        fuballButton.click();

        Assertions.assertTrue(fuballButton.isSelected());
    }

    @AfterAll
    public static void tearDown(){

        driver.close();

    }

}
