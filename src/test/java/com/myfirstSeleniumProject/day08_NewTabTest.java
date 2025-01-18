package com.myfirstSeleniumProject;

import com.myfirstSeleniumProject.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WindowType;

public class day08_NewTabTest extends TestBase {

//    ØOpen the pages in 2 new windows and verify their  TITLES -> LinkedIn , Ebay
//    ØOpen 2 new tabs and verify their TITLES


    @Test
    void newTabTest() throws InterruptedException {
        //1. adim sayfaya git
        driver.get("https://www.linkedin.com/");

        //2.adim sayfanin title ni assert et
        Assertions.assertTrue(driver.getTitle().contains("LinkedIn"));

        String linkedin =driver.getWindowHandle();
        System.out.println("linkedin = " + linkedin);

        driver.switchTo().newWindow(WindowType.TAB);
        Thread.sleep(3000);

        driver.get("http://www.ebay.com/");
        String ebay= driver.getWindowHandle();
        System.out.println("ebay = " + ebay);
        Assertions.assertTrue(driver.getTitle().contains("eBay"));


        //24. line da linkedin hashcode nu aldigimizdan dolayi geriye rahatlikla donebiliriz......

        driver.switchTo().window(linkedin);

        Assertions.assertTrue(driver.getCurrentUrl().contains("linkedin"));


        //39 line da ebayin hashcode nu aldigimizdan dolayi ileriye rahatlikla gidebiliriz.....


        driver.switchTo().window(ebay);


        Assertions.assertTrue(driver.getCurrentUrl().contains("ebay"));








    }
}



