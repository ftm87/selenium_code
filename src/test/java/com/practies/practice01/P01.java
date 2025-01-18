package com.practies.practice01;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class P01 {
      /*
TEST SENARYOLARI
      //  https://www.youtube.com adresine gidin
      // TEST1=> Sayfa başlığının "YouTube" oldugunu test edin
      // TEST2=> YouTube logosunun görüntülendiğini (isDisplayed()) test edin
      // TEST3=> Search Box 'in erisilebilir oldugunu test edin (isEnabled())
      // TEST4=> wrongTitleTest  => Sayfa basliginin "test" icermedigini dogrulayin
*///---------------------------------------------------------
      //test01 pek tavsiye edilmez cunku cok kalabalik bizler her senaryo icin test yazmaliyiz
    @Test
    void test01() throws InterruptedException {

        //  https://www.youtube.com adresine gidin
        // TEST1=> Sayfa başlığının "YouTube" oldugunu test edin

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.youtube.com");
        assertEquals("YouTube", driver.getTitle());

        // TEST2=> YouTube logosunun görüntülendiğini (isDisplayed()) test edin
        WebElement youtubeLogo = driver.findElement(By.xpath("(//yt-icon[@id='logo-icon'])[1]"));
        assertTrue(youtubeLogo.isDisplayed());


        // TEST3=> Search Box 'in erisilebilir oldugunu test edin (isEnabled())

        WebElement searchBox = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
        Assertions.assertTrue(searchBox.isEnabled());

        // TEST4=> wrongTitleTest  => Sayfa basliginin "test" icermedigini dogrulayin


        Assertions.assertFalse(driver.getTitle().contains("test"));



    }
//------------------------------------------------
    WebDriver driver;

    @BeforeEach
    void setUp() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.youtube.com");
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }

    @Test
    void titleTest() throws InterruptedException {
        assertEquals("YouTube", driver.getTitle(),"Sayfa basligi uyumlu degil");
    }

    @Test
    void logoTest() throws InterruptedException {
        // TEST2=> YouTube logosunun görüntülendiğini (isDisplayed()) test edin
        WebElement youtubeLogo = driver.findElement(By.xpath("(//yt-icon[@id='logo-icon'])[1]"));
        assertTrue(youtubeLogo.isDisplayed(),"logo goruntulenmedi");//eger test fail olursa bu mesaj konsolda cikacak yoksa cikmayacak
    }

    @Test
    void searchBoxTest() throws InterruptedException {
        // TEST3=> Search Box 'in erisilebilir oldugunu test edin (isEnabled())
        WebElement searchBox = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
        assertTrue(searchBox.isEnabled(),"searchBox erisilemedi");
    }

    @Test
    void negativeTitleTest() throws InterruptedException {
        // TEST4=> wrongTitleTest  => Sayfa basliginin "test" icermedigini dogrulayin
        assertFalse(driver.getTitle().contains("test"),"sayfa basligi test iceriyor");
    }

}
