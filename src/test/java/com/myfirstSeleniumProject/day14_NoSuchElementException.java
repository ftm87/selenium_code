package com.myfirstSeleniumProject;

import com.myfirstSeleniumProject.utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class day14_NoSuchElementException extends TestBase {

     /*
    NoSuchElementException
    Eger bu exception ile karsilasmis isek;
    1) Yanlıs locate almis olabiliriz, locate i kontrol etmeliyiz
    2) Implictly wait icin yeterli sure bekledigimizden emin oluruz, ihtiyaca göre artirabiliriz
    3) Locate ini aldigimiz webelement iframe icindeyse ve iframe e gecis yapmaz isek bu hatayi aliriz
    4) Sayfadaki bir webelemenete tiklama neticesinde yeni bir sayfa acildiysa driveri bu pencereye gecirmez isek bu hatayi alirniz
    5) Bazen locate etmek istedigimiz webelement sayfanın alt kısımlarinda kalabilir, driver göremeyebilir, bu gibi durumlarda scroll yaparak handle edebiliriz
     */

    @Test
    void test01() {
        driver.get("https://techproeducation.com");
        WebElement searchBox = driver.findElement(By.id(" searchHeaderInput"));
        searchBox.sendKeys("Batch 291");
    }
}
