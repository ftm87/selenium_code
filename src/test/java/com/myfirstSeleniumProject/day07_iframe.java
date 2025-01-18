package com.myfirstSeleniumProject;

import com.myfirstSeleniumProject.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class day07_iframe extends TestBase {


       @Test
       public void iframe(){

        //    Go to
//    https://testpages.herokuapp.com/styled/frames/frames-test.html

           driver.get(" https://testpages.herokuapp.com/styled/frames/frames-test.html");

           // WebElement leftList29 =driver.findElement(By.xpath("//li[@id='left29']"));
           // System.out.println(leftList29);//NoSuchElementException:burda yapmamiz gereken ya dogru locator alinamadi yada sayfada frame var,peki ne yapmaliyiz

           //1.Adim:left tablosuna gitmem gerekiyor ama iframe buyuzden switch to yapmam lazim left iframe gecmek icin

            driver.switchTo().frame(1);
            WebElement leftList29 =driver.findElement(By.xpath("//li[@id='left29']"));
            System.out.println(leftList29.getText());

//    Then Assert that "Left List Item 29" is the last element in the "Left"

          List<WebElement> leftAll = driver.findElements(By.xpath("//li"));
           System.out.println(leftAll.size());
           String leftAll29=leftAll.get(leftAll.size()-1).getText();

           Assertions.assertTrue(leftAll29.contains("29"));
//    And Assert that "Middle List Item 39" is the last element in the "Middle"

           List<WebElement>rihtAll = driver.findElements(By.xpath("//li"));

           String rightAll39=leftAll.get(rihtAll.size()-1).getText();

           Assertions.assertTrue(rightAll39.contains("39"));







    }


}
