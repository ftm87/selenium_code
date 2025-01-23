package com.practies.practice02;

import com.myfirstSeleniumProject.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class P03 extends TestBase {
    //Go to https://www.tutorialspoint.com/selenium/practice/alerts.php
    //press the click me button regarding the confirm box will appear
    //Press a button! Verify that your post is displayed in the alert
    //Close the alert with arrow
    //You pressed OK! Verify that it displays
    //press the click me button regarding the confirm box will appear
    //Close the alert with cancel
    //You pressed Cancel! Verify that it displays




        //https://www.tutorialspoint.com/selenium/practice/alerts.php adresine gidin
        //confirm box will appear ile ilgili click me butonuna basin
        //Press a button! yazisiniz alertte görüntülendigini doğrulayin
        //Alerti ok ile kapatin
        //You pressed OK! yazisinin görüntülendigini doğrulayin
        //confirm box will appear ile ilgili click me butonuna basin
        //Alerti cancel ile kapatin
        //You pressed Cancel! yazisinin görüntülendigini doğrulayin





    @Test
    void test01() {

        //https://www.tutorialspoint.com/selenium/practice/alerts.php adresine gidin
        driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");

        //confirm box will appear ile ilgili click me butonuna basin
        driver.findElement(By.xpath("//button[@onclick='myDesk()']")).click();

        //Press a button! yazisiniz alertte görüntülendigini doğrulayin
        String actualText = driver.switchTo().alert().getText();
        String expectedText ="Press a button!";
        Assertions.assertEquals(expectedText,actualText);
        waitFor(2);

        //Alerti ok ile kapatin
        driver.switchTo().alert().accept();

        //You pressed OK! yazisinin görüntülendigini doğrulayin
        String actualMessage = driver.findElement(By.cssSelector("#desk")).getText();
        String expectedMessage ="You pressed OK!";
        Assertions.assertEquals(expectedMessage,actualMessage);




        //confirm box will appear ile ilgili click me butonuna basin
        driver.findElement(By.xpath("//button[@onclick='myDesk()']")).click();

       //Alerti cancel ile kapatin
        driver.switchTo().alert().dismiss();
        //You pressed Cancel! yazisinin görüntülendigini doğrulayin

        String actualMessage2 = driver.findElement(By.cssSelector("#desk")).getText();
        String expectedMessage2 = "You pressed Cancel!";
        Assertions.assertEquals(expectedMessage2, actualMessage2);

    }
}
