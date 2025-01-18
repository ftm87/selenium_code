package com.myfirstSeleniumProject;

import com.myfirstSeleniumProject.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class day09_ReasuableWindow extends TestBase {

    @Test
    public void windowOperations() throws InterruptedException {


//
//        Go to https://the-internet.herokuapp.com/windows

        driver.get("https://the-internet.herokuapp.com/windows");


//        Assert if the window 1 title equals "The Internet"

        Assertions.assertTrue(driver.getTitle().contains("The Internet"));


//        Click on the link

        WebElement clickButton = driver.findElement(By.linkText("Click Here"));

        clickButton.click();
        Thread.sleep(3000);


        //Windows methodunu kullan burda....

        switchNewWindowByTitle("New Window");

//        Assert if the window 2 title equals "New Window"



        //2. adim butun hashcodelari alman lazim new window penceresine gecmek icin....



        Assertions.assertTrue(driver.getTitle().contains("New Window")); //bunun true donmesi icin New Window a gecis yap.....


        switchNewWindowByIndex(0);

//        Switch back to window 1 title and assert if URL contains "windows"

        Assertions.assertTrue(driver.getTitle().contains("The Internet"));

//        And assert if the URL doesn't contains 'new'



    }
}
