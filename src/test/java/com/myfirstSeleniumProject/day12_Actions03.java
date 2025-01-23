package com.myfirstSeleniumProject;

import com.myfirstSeleniumProject.utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class day12_Actions03 extends TestBase {


    @Test
    void draganDrop() throws InterruptedException {


//        Given user is on https://jqueryui.com/droppable/

        driver.get("https://jqueryui.com/droppable/");

        switchIframeByIndex(0);

//        And user moves the target element(Drag me to my target) in to

        WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));


        WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));

        //        destination(Drop here)

        //actions clasindan obje olustur driver iniate edelim
        Actions actions=new Actions(driver);

        actions.dragAndDrop(source,target).perform();

        Thread.sleep(3000);






    }


    @Test
    public void reasuableDragAndDrop() throws InterruptedException {


//        Given user is on https://jqueryui.com/droppable/

        driver.get("https://jqueryui.com/droppable/");


        //iframe eklendi
        switchIframeByIndex(0);


        //        And user moves the target element(Drag me to my target) in to
        WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));


        //Reasuble methodunu kullan.....

        actionsDragAndDrop(source,target);

        Thread.sleep(3000);







    }

}
