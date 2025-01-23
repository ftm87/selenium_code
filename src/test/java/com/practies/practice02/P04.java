package com.practies.practice02;

import com.myfirstSeleniumProject.utilities.TestBase;
import org.junit.jupiter.api.Test;

public class P04  extends TestBase {

    //Go to https://www.tutorialspoint.com/selenium/practice/login.php
    //Log in with the email you received from https://www.fakemail.net/
    //Verify that Welcome, Login In is displayed


    @Test
    void test01() {

        //https://www.tutorialspoint.com/selenium/practice/login.php adresine gidin
       driver.get("https://www.tutorialspoint.com/selenium/practice/login.php");

        //https://www.fakemail.net/ sitesinden aldiginiz email ile login olun


        //Welcome, Login In yazisinin görüntülendigini doğrulayin

    }
}
