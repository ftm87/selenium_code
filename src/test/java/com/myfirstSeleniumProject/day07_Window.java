package com.myfirstSeleniumProject;

import com.myfirstSeleniumProject.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class day07_Window extends TestBase {

    @Test
    public void windowOperations() throws InterruptedException {


//
//        Go to https://the-internet.herokuapp.com/windows

        driver.get("https://the-internet.herokuapp.com/windows");


//        Assert if the window 1 title equals “The Internet”

        Assertions.assertTrue(driver.getTitle().contains("The Internet"));


//        Click on the link

        WebElement clickButton = driver.findElement(By.linkText("Click Here"));

        clickButton.click();
        Thread.sleep(3000);

//        Assert if the window 2 title equals “New Window”

        String theInternetWindow = driver.getWindowHandle();

        System.out.println("theInternetWindow = " + theInternetWindow);

        //2. adim butun hashcodelari alman lazim new window penceresine gecmek icin....


        Set<String> allWindow = driver.getWindowHandles(); //Bu method butun hashcodelari bir set datasina assign eder.....

        String newWindow = "";

        for (String each:allWindow) {

            System.out.println("each = " + each);

            if (!each.equals(theInternetWindow)){

                newWindow = each;
                System.out.println("newWindow = " + newWindow);
            }

        }

        driver.switchTo().window(newWindow);


        Assertions.assertTrue(driver.getTitle().contains("New Window")); //bunun true donmesi icin New Window a gecis yap.....


//        Switch back to window 1 title and assert if URL contains “windows”
//        And assert if the URL doesn’t contains ‘new’



    }
}
