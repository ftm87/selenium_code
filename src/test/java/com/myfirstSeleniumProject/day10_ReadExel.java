package com.myfirstSeleniumProject;

import org.apache.poi.ss.usermodel.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class day10_ReadExel {

    @Test
    void readExel() {


        // exxcel dosyamin yolunu belirttim....
        String path="resources/Capitals.xlsx"; //exel dosyami bir path in icin ekoydum artik driver onu bu sekilde bulacak

        // FileInputStream; Bu sınıf, dosyalardan bayt bazlı veri okumak için kullanılır.
        //fakat bunu bir try catch icinde yapmaliyiz eger hata alirsak  diye bize hatanin ne oldugu vermis olacak


        // 1-) Workbook > 2-) Sheet > 3-) Row > 4-) Cell .....


        //   1.adim  workbook(excel) dosyasini acmak icin fileInputStream olarak ekle
        try {
            FileInputStream fileInputStream=new FileInputStream(path);


            //2.adim workbook(excel) acmam lazim kullanmam icin

            Workbook workbook= WorkbookFactory.create(fileInputStream);

            //3. adim sheet i acmak icin...
            Sheet sheet1=workbook.getSheet("Sheet1");

            Row r1=sheet1.getRow(0);

            //4. adim hucreye gidin degeri alin

            Cell r1C1=r1.getCell(0);


            System.out.println("Satir 1 ve hucre bir deki data(1A) = " + r1C1);



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Test
    void readexel2() throws IOException {

        String path="resources/Capitals.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(fileInputStream);
        System.out.println(workbook.getSheet("Sheet1").getRow(0).getCell(0));
    }


    @Test
    void test01() throws IOException {
        String path="resources/Capitals.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(fileInputStream);

       //exel dosyamizdan 1.satir ve 2. sutundaki hucreyi yazdirin
        Cell cell = workbook.getSheet("Sheet1").getRow(0).getCell(1);
        System.out.println(cell);

        //3. satir ve 1. sutun  degerini yazdirin ve "France" oldugunu test edin
        String actualCell =workbook.getSheet("Sheet1").getRow(2).getCell(0).toString();//bunu stringe cevirmeliyiz france yazisini test edbilmek icin
        String expectedCell="France";
        System.out.println(actualCell);
        Assertions.assertEquals(expectedCell,actualCell);

       //Kullanilan satir sayini bulun

       // getPhysicalNumberOfRows(); ici dolu olan satirlarin sayisini verir, sayi verdigi icin index 0 dan baslamaz 1 den baslar
        System.out.println("kullanilan satir sayisi = " + workbook.getSheet("Sheet1").getPhysicalNumberOfRows());


        //sayfadaki son satirin index ini yazin(index sifirdan basladigi icin eger 5 satir varsa 4 return eder

        System.out.println("son astirin indexi = " + workbook.getSheet("Sheet1").getLastRowNum());

        //exel sayfasindaki datalari yan yana  key value olarak yazdiran

        Map<String,String>countryCapital=new HashMap<>();//key value olarak olusturmak adina bunu olusturduk

        for (int i = 0; i <=workbook.getSheet("Sheet1").getLastRowNum() ; i++) {

            String country = workbook.getSheet("Sheet1").getRow(i).getCell(0).toString();
            String capitel = workbook.getSheet("Sheet1").getRow(i).getCell(1).toString();
            countryCapital.put(country,capitel);

        }

        System.out.println(countryCapital);
    }
}
