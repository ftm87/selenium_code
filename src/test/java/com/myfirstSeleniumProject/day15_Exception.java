package com.myfirstSeleniumProject;

import com.myfirstSeleniumProject.utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class day15_Exception extends TestBase {
    //WebdriverException ==> internet olmayinca, browser uyumsuzluklari, webdriver kurulum ile alakali olabilir
    //ElementClickInterceptedException ==> Bir webelementin tiklanmasini engelleyen baska bir webelement(reklam, cookies,..) varsa bu hatayi aliriz
    //ElementNotInteractableException ==> Bir cerceve (<div, <span) ile etkilesime gecmeye calismak, yada webelementin etkilesime kapali olmasi durumunda bu hatayi aliriz

    //invalidSelector belirtilen locator gecersiz oldugu zaman bu hata alinir
    @Test
    void invalidSelector() {
        driver.get("https://google.com");
        driver.findElement(By.cssSelector("//*VALUE"));
    }

    //IllegalArgumentException ==>> bir methoda parametre olarak kurallara aykırı bir arguman gönderilirse bu hata alinir
    @Test
    void illegalArgumentException() {
        driver.get("313343");
    }
}
