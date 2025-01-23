package com.practies.practice02;

import com.myfirstSeleniumProject.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02 extends TestBase {

    // https://demo.guru99.com/test/radio.html
    // select if checkbox1 and checkbox3 are not selected
    //test that checkbox1 and checkbox3 are selected
    //test if checkbox2 element is not selected



    @Test
    void test01() {
        // https://demo.guru99.com/test/radio.html
        driver.get("https://demo.guru99.com/test/radio.html");


        WebElement radioButton1 = driver.findElement(By.id("vfb-7-1"));
        WebElement radioButton2 = driver.findElement(By.id("vfb-7-2"));
        WebElement radioButton3 = driver.findElement(By.id("vfb-7-3"));

        WebElement checkBox1 = driver.findElement(By.id("vfb-6-0"));
        WebElement checkBox2 = driver.findElement(By.id("vfb-6-1"));
        WebElement checkBox3 = driver.findElement(By.id("vfb-6-2"));

        // checkbox1 ve checkbox3 seçili değilse seçin
        if (!checkBox1.isSelected()) {
            checkBox1.click();
        }
        if (!checkBox3.isSelected()) {
            checkBox3.click();
        }

        // checkbox1 ve checkbox3 seçili olduğunu test edein
        Assertions.assertTrue(checkBox1.isSelected());
        Assertions.assertTrue(checkBox3.isSelected());

        // checkbox2 elementinin seçili olmadığını test edin
        Assertions.assertFalse(checkBox2.isSelected());


        //radiobutton1 i seciniz


        //radio button 1 in secili oldugunu test ediniz
        Assertions.assertTrue(radioButton1.isSelected());

        //radio button 2 in secili olmadigini test ediniz
        Assertions.assertFalse(radioButton2.isSelected());

        //radio button 3 ün secili oldmadigini test ediniz
        Assertions.assertFalse(radioButton3.isSelected());



    }


}

