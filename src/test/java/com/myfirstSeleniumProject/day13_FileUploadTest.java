package com.myfirstSeleniumProject;

import com.myfirstSeleniumProject.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class day13_FileUploadTest extends TestBase {


    //Go to https://the-internet.herokuapp.com/upload
    //press the chooseFile button
    //Select the file you want to upload
    //Press the Upload button
    //“File Uploaded!” Test whether your text is displayed

    @Test
    void fileUploadTest() {
        // https://the-internet.herokuapp.com/upload   adresine gidelim
        driver.get("https://the-internet.herokuapp.com/upload");

        //chooseFile butonuna basalim
        WebElement chooseFile = driver.findElement(By.id("file-upload"));

        //Yuklemek istediginiz dosyayi secelim.
        String path = System.getProperty("user.home") + "\\Downloads\\b10 all test cases, code.docx";
        /*
        Eger dosya yükleyeceğimiz webelement input tagi ile yazilmis ise bu webelementi locate ederek sendkeys methodu
        ile yüklemek istedigmiz dosyanin pathini göndermemiz yeterli
         */
        chooseFile.sendKeys(path);
        waitFor(3);

        //Upload butonuna basalim.
        driver.findElement(By.id("file-submit")).click();
        waitFor(2);

        //“File Uploaded!” textinin goruntulendigini test edelim.
        String actualText = driver.findElement(By.xpath("//h3")).getText();
        String expectedText="File Uploaded!";
        Assertions.assertEquals(expectedText,actualText);
    }
}
