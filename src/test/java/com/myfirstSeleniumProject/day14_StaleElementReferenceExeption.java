package com.myfirstSeleniumProject;

import com.myfirstSeleniumProject.utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class day14_StaleElementReferenceExeption extends TestBase {

     /*
    StaleElementReferenceException nasil alinir?
        =>Bir sayfadaki bir webelementi locate ettikten ve bunu bir webelement seklinde sakladiktan sonra
        eger o sayfada herhangi bir yenileme islemi (navigate.refresh(),back(),forward()..) yapildiginda
        locate ini aldigimiz webelementi tekrar kullanmak istersek bu exceptionu aliriz

    Bu hata nasil handle edilir?
    ==> bu exceptionu handle edebilmek icin sayfada yenileme islemi (navigate.refresh(),back(),forward()..) yapildiginda
    locatei yeniden almaliyiz
     */

    @Test
    void test01() {
        driver.get("https://techproeducation.com");
        WebElement searchBox = driver.findElement(By.id("searchHeaderInput"));
        driver.navigate().refresh();
        searchBox = driver.findElement(By.id("searchHeaderInput"));
        searchBox.sendKeys("suan bu webelement fresh");
    }
}
