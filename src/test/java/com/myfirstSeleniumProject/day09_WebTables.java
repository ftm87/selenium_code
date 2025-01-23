package com.myfirstSeleniumProject;

import com.myfirstSeleniumProject.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class day09_WebTables extends TestBase {

    @Test
    void webTables() {

      //  https://the-internet.herokuapp.com/tables

        driver.get("https://the-internet.herokuapp.com/tables");

        Assertions.assertTrue(driver.getCurrentUrl().contains("tables"));

//        Create a class: WebTables
//        Task 1 : Print the entire table and Assert if the last element in the table 1 is "edit delete"
                  //en basta tum table yazdiracagiz konsolda

        WebElement table1 = driver.findElement(By.id("table1"));

        System.out.println(table1.getText());


        //eger ben table1 deki son elementin edit delete oldugunu verify etmek istersem nasil yaparim

        WebElement lastElement=driver.findElement(By.xpath("(//tbody//tr[4]//td[6])[1]")) ;
        Assertions.assertTrue(lastElement.getText().contains("edit"));

//        Task 2 : Print All Rows

        List<WebElement>allRows= driver.findElements(By.xpath("//table[@id='table1']//tr"));

        int rowNumber=1;
        for ( WebElement each:allRows){

            System.out.println("row number "+rowNumber+" = "+each.getText());
            rowNumber++;
        }

//        Task 3 : Print Last row data only

          System.out.println("En son satiri yazdiracak = " + allRows.get(allRows.size() - 1).getText());

//        Task 4 : Print column 5 data in the table body

        List<WebElement> sutun5tekielementler = driver.findElements(By.xpath("//table[@id='table1']//tr//td[5]"));

        int row=1;
        for ( WebElement each:sutun5tekielementler){

            System.out.println( "Row Number"+row+"=" +each.getText());

        }


        //                HW
//        Task 5 :  Print the information of columns 1 and 2 in 3 rows
//        Task 6 : Write a method that accepts 2 parameters
//        Parameter 1 = row number
//        Parameter 2 = column number
//        printData(2,3);	=> prints data in 2nd row 3rd column
    }
}
