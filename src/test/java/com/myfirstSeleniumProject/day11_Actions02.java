package com.myfirstSeleniumProject;

import com.myfirstSeleniumProject.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class day11_Actions02 extends TestBase {


    //Given user is on the https://www.amazon.com/
    //When user click on "Account" link
    //Then verify the page title contains "Your account"
    //Then scroll to Amazon Music element at the bottom of the page
    //Click on it
    //Then verify Amazon Music page is displayed
    //Scroll the page up and down


    @Test
    public void actionTest() throws InterruptedException {




        driver.get("https://www.amazon.com/");

        Actions actions = new Actions(driver);

        WebElement accountList = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));


        // webelementin uzerine fareyi hover(getirmek icin) movetoelement methodunu kullan actions objesiyle......

        actions.moveToElement(accountList).perform();




        Thread.sleep(3000);


        //When user click on "Account" link

        WebElement account = driver.findElement(By.xpath("//span[text()='Account']"));


        actions.click(account).build().perform();


        //Then verify the page title contains "Your account"

        Assertions.assertTrue(driver.getTitle().contains("Your Account"));

        Thread.sleep(3000);


        actions.sendKeys(Keys.ARROW_DOWN).perform();


        Thread.sleep(3000);


        actions.sendKeys(Keys.ARROW_DOWN).perform();

        Thread.sleep(3000);


        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);

        actions.sendKeys(Keys.ARROW_LEFT).perform();
        Thread.sleep(3000);
        actions.sendKeys(Keys.ARROW_RIGHT).perform();

        actions.sendKeys(Keys.PAGE_DOWN);

        actions.sendKeys(Keys.PAGE_DOWN);


        //Then scroll to Amazon Music element at the bottom of the page

        WebElement amazonMusic =  driver.findElement(By.xpath("//a[text()='Amazon Music']"));

        actions.moveToElement(amazonMusic).perform();

        actions.sendKeys(Keys.ARROW_DOWN).perform();

        Thread.sleep(3000);

        actions.click(amazonMusic).perform();

        //Then verify Amazon Music page is displayed

        Assertions.assertTrue(driver.getCurrentUrl().contains("music"));


        //Scroll the page up and down

        actions.sendKeys(Keys.PAGE_DOWN);

        Thread.sleep(3000);


        actions.sendKeys(Keys.PAGE_UP);

    }


    @Test
    public void actionsReasubleMethod() throws InterruptedException {


        driver.get("https://www.amazon.com/");


        WebElement accountList = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));


        // webelementin uzerine fareyi hover(getirmek icin) movetoelement methodunu kullan actions objesiyle......

        actionsHoverOnElement(accountList);

        Thread.sleep(3000);


        //When user click on "Account" link

        WebElement account = driver.findElement(By.xpath("//span[text()='Account']"));


        actionsDoubleClick(account);



        //Then verify the page title contains "Your account"

        Assertions.assertTrue(driver.getTitle().contains("Your Account"));

        Thread.sleep(3000);


        // Amazon music kismini gormediginden dolayi sayfayi asagiya kaydirmam lazim yoksa no such element exception vercek......


        actionsScrollDown();

        //Sayfayi saga kaydiralim


        actionsScrollRight();

        Thread.sleep(3000);


        //SAYAFAYI SOLA KAYDIRDIK
        actionsScrollLeft();

        //SAYFAYI BIRAZ DAHA ASAGIYA KAYDIRMAK ICIN BU METHODU BIR DAHA EKLEDIK.....
        actionsScrollDown();

        //Then scroll to Amazon Music element at the bottom of the page

        WebElement amazonMusic =  driver.findElement(By.xpath("//a[text()='Amazon Music']"));


        actionsHoverOnElement(amazonMusic);


        //Amazon music tikla reasuble method ile.....

        actionsDoubleClick(amazonMusic);


        //Then verify Amazon Music page is displayed

        Thread.sleep(10000);
        Assertions.assertTrue(driver.getCurrentUrl().contains("music"));


        //Scroll the page up and down

        actionsScrollDown();


        actionsScrollUp();

    }
}
