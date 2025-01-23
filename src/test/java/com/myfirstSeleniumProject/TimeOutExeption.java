package com.myfirstSeleniumProject;

import com.myfirstSeleniumProject.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TimeOutExeption extends TestBase {

    //TimeOutException
    /*
    Explicit wait kullanildiginda ve webelement bulunamadiginda alinan bir hatadir,
    NOT==> implicitlywait te sure yeterli olmaz ise NoSuchElementException aliriz

    Eğer TimeOutException hatasi aliyorsak
    1- Explicit wait le kullandigimiz max sureyi kontrol etmeliyiz
    2- Explicit wait le aldigimiz locate i kontrol etmeliyiz
    3- Explicit wait le kullandigimiz methodu kontrol etmeliyiz
    4- Explicit wait le locate ettigimiz webelement iframe icinde kalmis olabilir iframe e gecis yapilmasi gerekebilir

     */

    @Test
    void webdriverWait() {

        //https://the-internet.herokuapp.com/dynamic_loading/1
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

        //Start buttonuna tıkla
        driver.findElement(By.xpath("//button")).click();

        //Hello World! Yazının sitede oldugunu test et

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        WebElement helloWorld = driver.findElement(By.xpath("//*[.='Hello World!']"));
        wait.until(ExpectedConditions.visibilityOf(helloWorld));
        Assertions.assertTrue(helloWorld.isDisplayed());
    }
}
