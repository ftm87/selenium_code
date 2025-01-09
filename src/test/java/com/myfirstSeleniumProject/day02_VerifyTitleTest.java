package com.myfirstSeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day02_VerifyTitleTest {
    public static void main(String[] args) {

//      Create driver object from Webdriver class

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

//        Navigate to  techproeducation homepage / amazon homepage


        driver.get("https://www.techproeducation.com.tr/");


//
//        3. Verify if page title is
//        "Techpro Education | Online It Courses & Bootcamps" /

        String actualResult = driver.getTitle();

        if (actualResult.contains("Bootcamps")){

            System.out.println("PASSED");
        }else {

            System.out.println(actualResult + " does not have Bootcamps in the title so this test case is failed");
        }



//                OR
//        "Amazon.com. Spend less. Smile more."
//
//        4. Close the window

        driver.close();



    }
}
