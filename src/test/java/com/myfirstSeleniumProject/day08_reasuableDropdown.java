package com.myfirstSeleniumProject;

import com.myfirstSeleniumProject.utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class day08_reasuableDropdown extends TestBase {

    @Test
    public  void reasuableDropdown() throws InterruptedException {




        //    Go to https://testcenter.techproeducation.com/index.php?page=dropdown

        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");
//
//    Create method selectByIndexTest and Select Option 1 using index

        //1.Adim dropdown icin locator al......

        WebElement simpleDropdown = driver.findElement(By.id("dropdown"));


        // Alttaki kisimda resuable methodu cagirdik ve boylelikle selecten obje olusturup sonrasinda selectin getirdigi methodu cagirmadik

        dropdownSelectByIndex("//select[@id='dropdown']",1);


        Thread.sleep(3000);




    }
}
