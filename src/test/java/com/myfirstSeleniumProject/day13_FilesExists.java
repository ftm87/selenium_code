package com.myfirstSeleniumProject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class day13_FilesExists {

    @Test
    void test1() {

        //"C:\Users\fatma\Downloads\logo.png"
          /*
        Bilgisayarimizdaki herhangi bir dosyanini varligini test edebilmek icin öncelikle varligini test etmek istedigimiz
        dosyanin yoluna (path) e ihtiyacimiz var. Ama (C:\Users\mua\Downloads\logo.png) bu sekilde hard code olarak yazarsak
        bu path sadece bir bilgisayar icin gecerli olur
        Kodumuzun herkesin bilgisayarinda calisabilmesi icin pathi dynamic hale getirmeliyiz
        Bunun icin;
        1) System.out.println("home directory => " + System.getProperty("user.home"));//C:\Users\mua bu komut home directoryi verir
        2) System.out.println("current working directory = " + System.getProperty("user.dir"));// javada programin suanda calistigi dizini yani current working directory i verir

        ==> Files.exists(Paths.get(path))==> Bilgisayarimizda belirtilen path te dosya olup olmadigini kontrol eder
        var ise true yok ise false return eder
         */

        //C:\Users\mua\Downloads\logo.png
        //C:\Users\muhammet\Downloads\logo.png
        //C:\Users\E5470\Downloads\logo.png
        //C:\Users\ozenm\Downloads\logo.png
        //C:\Users\fatma\Downloads\logo.png

        System.out.println("home directory => " + System.getProperty("user.home"));//C:\Users\mua
        System.out.println("current working directory = " + System.getProperty("user.dir"));// javada programin suanda calistigi dizini yani current working directory i verir

        //Bilgisayarimzda download klasöründe logo isimli dosyanin bulunup bulunmadigini test edelim


        //                  C:\Users\mua                    \Downloads\logo.png
        String path = System.getProperty("user.home") + "\\Downloads\\logo.png";
        Assertions.assertTrue(Files.exists(Paths.get(path)));


    }
}
