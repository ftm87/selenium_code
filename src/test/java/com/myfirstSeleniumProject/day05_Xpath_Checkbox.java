package com.myfirstSeleniumProject;

import com.myfirstSeleniumProject.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class day05_Xpath_Checkbox extends TestBase {


    @Test
    public void xPath(){

        // When user goes to :
        //https://opensource-demo.orangehrmlive.com/web/index.php/auth/login

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        //    And enter username

        //1.Adim webelementi olusturmam lazim bunun icinde locatirini almam lazim....

        WebElement username =driver.findElement(By.xpath("//input[@name='username']"));

        //2.adim username gonder

        username.sendKeys("Admin");


        //    And enter password

        WebElement password=driver.findElement(By.xpath("//input[@type='password']"));

        password.sendKeys("admin123");

        //    And click on login button

        WebElement login  = driver.findElement(By.xpath("//button[@type='submit']"));

        login.click();

        //    Then verify the login is successful

        WebElement  dashboard=driver.findElement(By.xpath("//h6[text()='Dashboard']"));

        Assertions.assertTrue(dashboard.getText().contains("Dashboard"));

        //    Then logout the application

        driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();//profil butonu

        WebElement logout=driver.findElement(By.xpath("(//a[@role='menuitem'])[4]"));

        logout.click();


        //    Then verify the logout is successful

        WebElement logoutSuc= driver.findElement(By.xpath("//*[.='Login']"));


        Assertions.assertTrue(logoutSuc.getText().contains("Login"));



    }
   // -----------------------------------------------------------
   @Test
   public void chexbox(){

       //    Go to https://testcenter.techproeducation.com/index.php?page=checkboxes

       driver.get("https://testcenter.techproeducation.com/index.php?page=checkboxes");


       //    Locate the elements of checkboxes

       WebElement chexBox1= driver.findElement(By.cssSelector("input[name='checkbox1']"));

       WebElement chexBox2=driver.findElement(By.xpath("//input[@name='checkbox2']"));


       //    Then click on checkbox1 if box is not selected.egerkutucugu isretlemediysen box1 e tikla yani burda negtif senaryo var


       if (!chexBox1.isSelected()){// eger box1 secili degilse iceri gir

           chexBox1.click();
       }


       //    Then click on checkbox2 if box is not selected

       if (!chexBox2.isSelected()){

           chexBox2.click();
       }


       //    Then verify that checkbox1 is checked.

       Assertions.assertTrue(chexBox1.isSelected());

   }



}
