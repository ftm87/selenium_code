package com.myfirstSeleniumProject;

import com.myfirstSeleniumProject.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.nio.file.Files;
import java.nio.file.Paths;

public class day13_FileDownloadtest extends TestBase {


    //Go to https://testcenter.techproeducation.com/index.php?page=file-download
    //download b10 all test cases file
    //Test whether the file has been downloaded successfully


    @Test
    void fileDowntest() {

        String path = System.getProperty("user.home") + "\\Downloads\\b10 all test cases, code.docx";
        /*
         Files.delete(Paths.get(path)); methodu path olarak verilen dosyayi siler, eger belirtilen path te dosya yoksa
         veya herhangi bir sebepten dolayi silinemez ise Exception firlatir
         */
        try{
            Files.delete(Paths.get(path));
        }catch (Exception e){
            System.err.println("Dosya silinirken bir sorun olustu !!!");
        }

        //https://testcenter.techproeducation.com/index.php?page=file-download adresine gidelim.
        driver.get("https://testcenter.techproeducation.com/index.php?page=file-download");

        //b10 all test cases dosyasını indirelim
        driver.findElement(By.partialLinkText("b10 all test cases, code.docx")).click();
        waitFor(3);

        //Dosyanın başarıyla indirilip indirilmediğini test edelim

        Assertions.assertTrue(Files.exists(Paths.get(path)));
    }




    }

