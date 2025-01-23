package com.practies.practice02;

import com.myfirstSeleniumProject.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class P01 extends TestBase {
        // Go to https://testpages.herokuapp.com/styled/calculator
        // Test the application for mathematical operations by creating four different test methods.


        @Test
        void test01() {

            // https://testpages.herokuapp.com/styled/calculator adresine gidin
            driver.get("https://testpages.herokuapp.com/styled/calculator");

            // Dört farkli test metdhodu olusturarak matematiksel işlem icin uygulamayi test edin.



            String firstNumber = "5";
            String secondNumber = "5";

            driver.findElement(By.id("number1")).sendKeys(firstNumber);
            driver.findElement(By.id("number2")).sendKeys(secondNumber);

            driver.findElement(By.id("function")).sendKeys("minus");


            WebElement dropDown = driver.findElement(By.id("function"));
            Select select = new Select(dropDown);
            select.selectByVisibleText("plus");

            driver.findElement(By.id("calculate")).click();

            String actualResult = driver.findElement(By.id("answer")).getText();
            String expectedResult = Integer.valueOf(firstNumber) + Integer.valueOf(secondNumber)+"";
            Assertions.assertEquals(expectedResult,actualResult);

        }
    }
