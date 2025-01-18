package com.myfirstSeleniumProject;

import com.myfirstSeleniumProject.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class day09_AutoComlete extends TestBase {

    @Test
    void test01() throws InterruptedException {

//        Given user is on https://testcenter.techproeducation.com/index.php? page=autocomplete

          driver.get("https://testcenter.techproeducation.com/index.php? page=autocomplete");


//        When user type "uni" in the search box

        WebElement countrySearcbox = driver.findElement(By.id("myCountry"));

        countrySearcbox.sendKeys("uni");

//        And select the 'United Kingdom' from the suggestions

        WebElement unitedKingdom = driver.findElement(By.xpath("//div[@id='myCountryautocomplete-list']//div[text()='ted Kingdom']"));
        Thread.sleep(3000);


//        And click on submit button

        unitedKingdom.click();
        driver.findElement(By.xpath("//input[@value='Submit']")).click();

//        Then verify the result contains 'United Kingdom'

        WebElement result = driver.findElement(By.id("result"));
        Assertions.assertTrue(result.getText().contains("You selected: United Kingdom"));

        Thread.sleep(3000);



    }
}
