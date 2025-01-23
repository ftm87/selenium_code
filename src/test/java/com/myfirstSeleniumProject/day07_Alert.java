package com.myfirstSeleniumProject;

import com.myfirstSeleniumProject.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class day07_Alert extends TestBase {

//
//    Go to https://testcenter.techproeducation.com/index.php?page=javascript-alerts
//    Create a class: AlertTest
//    Create setUp method Create 3 test methods:
//    acceptAlert() => click on the first alert, verify the text “I am a JS Alert”
//    click OK
//    and Verify “You successfully clicked an alert”
//
//    dismissAlert()=> click on the second alert, verify text "I am a JS Confirm”
//    click cancel
//    and Verify “You clicked: Cancel”
//
//    sendKeysAlert()=> click on the third alert, verify text “I am a JS prompt”,
//    type “Hello World”, click OK
//    and Verify “You entered: Hello World”


    @Test
    public void acceptAlert() throws InterruptedException {

        //    Go to https://testcenter.techproeducation.com/index.php?page=javascript-alerts

        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");



        //    acceptAlert() => click on the first alert, verify the text “I am a JS Alert”

        WebElement clickAlert = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));

        clickAlert.click();


        //2.adim verify alert message "I am a JS Alert"

        Assertions.assertTrue(driver.switchTo().alert().getText().contains("I am a JS Alert"));


        //3. adim switch to yaparak alert mesajini okeylemek

        driver.switchTo().alert().accept();

        Thread.sleep(3000);


        WebElement result = driver.findElement(By.xpath("//p[@id='result']"));

        Assertions.assertTrue(result.getText().contains("You successfully clicked an alert"));



    }


    @Test
    public void dismissAlert() throws InterruptedException {


        //    Go to https://testcenter.techproeducation.com/index.php?page=javascript-alerts

        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");


//    dismissAlert()=> click on the second alert, verify text "I am a JS Confirm”

        WebElement confirmButton = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));

        confirmButton.click();


        Assertions.assertTrue(driver.switchTo().alert().getText().contains("I am a JS Confirm"));



//    click cancel

        driver.switchTo().alert().dismiss();

        Thread.sleep(3000);



//    and Verify “You clicked: Cancel”

        WebElement result = driver.findElement(By.xpath("//p[@id='result']"));


        Assertions.assertTrue(result.getText().contains("Cancel"));

        Thread.sleep(3000);


    }

    @Test
    public void sendKeysAlert() throws InterruptedException {

        //Negative Senaryo icin yapildi bu test.....

        //    Go to https://testcenter.techproeducation.com/index.php?page=javascript-alerts

        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");

        //buttona tikla
        WebElement alertButton = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));

        alertButton.click();


//    sendKeysAlert()=> click on the third alert, verify text “I am a JS prompt”,

        //verify
        Assertions.assertTrue(driver.switchTo().alert().getText().contains("I am a JS prompt"));


//    type “Hello World”, click OK

        driver.switchTo().alert().sendKeys("Turkey");

        Thread.sleep(3000);

        driver.switchTo().alert().accept();

        Thread.sleep(3000);


//    and Verify “You entered: Hello World”

        Assertions.assertFalse(driver.findElement(By.xpath("//p[@id='result']")).getText().contains("Hello World"));



    }

}
