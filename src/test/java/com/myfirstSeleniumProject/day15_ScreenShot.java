package com.myfirstSeleniumProject;

import com.myfirstSeleniumProject.utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class day15_ScreenShot extends TestBase {
  /*
    1-Almak istedigimiz ekran görüntüsünü kaydetmek istedigimiz yolu belirleriz
    2-TakeScreenShot tipinde object declare edip driver i bu objecte assign ederiz
    3-Files classindan write() methodunu kullanarak icine parametre olarak aldigimiz ekran görüntüsün nereye kaydedeceğimizi belirtiriz
     */

    @Test
    void test01() throws IOException {
        //techproeducation sayfasina gidelim

        driver.get("https://techproeducation.com");

        //sayfanin ekran görüntüsünü alalim
        TakesScreenshot ts = (TakesScreenshot) driver;

        Files.write(Paths.get("screenShots/techpro.png"),ts.getScreenshotAs(OutputType.BYTES));


        //Ekran görüntüsünün saklanacağı screenShots isimli bir klasör olusturur
        //Eğer klasor zaten var ise islem yapilmaz

        Files.createDirectories(Paths.get("screenShots"));
    }


    @Test
    void test02() throws IOException {
        //google sayfasina gidiniz

        driver.get("https://google.com");

        //sayfanin ekran görüntüsünü aliniz
        Files.createDirectories(Paths.get("screenShots"));
        TakesScreenshot ts = (TakesScreenshot) driver;
        Files.write(Paths.get("screenShots/google.jpeg"), ts.getScreenshotAs(OutputType.BYTES));
    }


    @Test
    void test03() throws IOException {
        //google sayfasina gidiniz
        driver.get("https://google.com");
       waitFor(3);
        //sayfanin ekran görüntüsünü aliniz
        Files.createDirectories(Paths.get("screenShots"));
        TakesScreenshot ts = (TakesScreenshot) driver;
        String date = DateTimeFormatter.ofPattern("ddMMyyyy_HHmmss").format(LocalDateTime.now());
        Files.write(Paths.get("screenShots/google "+date+".jpeg"), ts.getScreenshotAs(OutputType.BYTES));
    }


    @Test
    void reusableMethodUsage()  {
        //google sayfasina gidiniz
        driver.get("https://google.com");

        //sayfanin ekran görüntüsünü aliniz
        takeScreenShot();
    }

}