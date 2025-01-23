package com.myfirstSeleniumProject;

import com.myfirstSeleniumProject.utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Cookie;

import java.util.Set;

public class day10_Cookies extends TestBase {
//
//    Class: Cookies
//    Method: handleCookies
//    Go to amazon  and automate the tasks:
//    Find the total number of cookies
//    Print all the cookies
//    Get the cookies by their name
//    Add new cookie
//    Delete all cookies


    @Test
    void handleCookies() {

        //    Go to amazon  and automate the tasks:
        driver.get("https://www.amazon.com/");

        //    Find the total number of cookies

        Set<Cookie> allcookies = driver.manage().getCookies();
        System.out.println(allcookies.size());

        //    Print all the cookies(elementleri konsolda gormek icin list lerde for kullanilir)

        for (Cookie eachCookies:allcookies){
            System.out.println("her bir cookie = " + eachCookies);
            System.out.println("herbirini name olarak = " + eachCookies.getName());
            System.out.println("Domain = " + eachCookies.getDomain());
            System.out.println(eachCookies.getExpiry());

        }

        System.out.println("===============================================");

        //    Get the cookies by their name gclid

        System.out.println(driver.manage().getCookieNamed("gclid"));

        //ekle new cookie
        Cookie addNewCooie=new Cookie("selenium","dersi");
        driver.manage().addCookie(addNewCooie);

        Set<Cookie> newallcookies = driver.manage().getCookies();

        for (Cookie each:newallcookies){
            System.out.println(each.getName());
        }

        //    Delete all cookies

        driver.manage().deleteAllCookies();
        Set<Cookie> emtycookies = driver.manage().getCookies();
        System.out.println(emtycookies.size());
    }

}
