package com.practies.practice01;

import com.myfirstSeleniumProject.utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02 extends TestBase {

    @Test
    void test01() {

        driver.get("https://testpages.herokuapp.com/styled/calculator");
        WebElement plus1=  driver.findElement(By.xpath("//*[@id=\"number1\"]"));
        plus1.click();
        plus1.sendKeys("4");


    }
}
