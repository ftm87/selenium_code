package com.myfirstSeleniumProject;

import com.myfirstSeleniumProject.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class day14_ExplicitWait extends TestBase {
 /*
    Selenium Waits;

    1) Implicitly wait :
         Sayfa üzerindeki tüm elemanlar için genel bir bekleme süresi tanımlamak için kullanılır.
         Daha basit ve global bir çözüm sunar.
    2) Explicit wait:(Ozel bir kosul)
         Bir websayfasi yuklendikten sonra bir webelement ile iglili specific bir kosul icin max. belirtmis
         oldugumuz sure kadar bekletiriz.
            a) WebdriverWait; kosulun kontrol edilme suresi default olarak yarim saniyelik araliklar ile olur,
                               istenirse özellestirilebilir.
            b) FluenWait; Daha fazla özellestirme imkani sunar
     */

    //https://the-internet.herokuapp.com/dynamic_loading/1
    //Click the start button
    //Hello World! Test that the article is on the site

    @Test
    void webdriverWait() {


        //https://the-internet.herokuapp.com/dynamic_loading/1
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

        //Start buttonuna tıkla
        driver.findElement(By.xpath("//button")).click();

        //Hello World! Yazının sitede oldugunu test et

        // waitFor(5); ==> Test uzmanlari hardwait kullanmaktan mumkun oldugunca kacinmalidir

        /*
        1)Webdriver wait objectini olusturmaliyiz, ve max. bekletme süresini belirlemeliyiz
        2) Hangi webelement icin bekletme yapmak istiyorsak onu locate ediyoruz
        3) Olusturmus oldugumuz wait objectimiz üzerinden kosulumuzu tanimliyoruz

         */
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement helloWorld = driver.findElement(By.xpath("//*[.='Hello World!']"));
        wait.until(ExpectedConditions.visibilityOf(helloWorld));
        Assertions.assertTrue(helloWorld.isDisplayed());

    }
  /*
        Locate ini vermis oldugumuz webelementi görünür oluncaya kadar bekle ve görünür olduktan sonra o webelementi bize ver dedik
        Eger belirttigimiz  (20 sn) süre icinde aradigimiz webelement görünür hale gelirse bu kod o webelementi bize verir
        ama eger belirtilen sure icnde görünür hale gelmez ise TIMEOUTEXCEPTION firlatir
         */


    @Test
    void fluentWait() {

        //https://the-internet.herokuapp.com/dynamic_loading/1
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

        //Start buttonuna tıkla
        driver.findElement(By.xpath("//button")).click();

        //Hello World! Yazının sitede oldugunu test et
        FluentWait<WebDriver> wait = new FluentWait<>(driver);
        WebElement helloWorld = driver.findElement(By.xpath("//*[.='Hello World!']"));

        wait.withTimeout(Duration.ofSeconds(20))//max bekletme suresini belirledik
                .pollingEvery(Duration.ofMillis(200))//belirttigimiz araliklar ile kosulu kontrol ediyoruz
                .withMessage("Webelementi ve sureyi kontrol et")//Eger belirtilen max sure icinde kosul saglanmaz ise burada yazmis oldugumuz mesaj consolde TimeOutException ile birlikte görünecek
                .until(ExpectedConditions.visibilityOf(helloWorld));//webelementin görünür olana kadar beklemesi kosulunu tanimladik

        Assertions.assertTrue(helloWorld.isDisplayed());

    }

}


