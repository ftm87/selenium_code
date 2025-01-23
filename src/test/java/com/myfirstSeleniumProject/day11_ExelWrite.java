package com.myfirstSeleniumProject;

import org.apache.poi.ss.usermodel.*;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class day11_ExelWrite {

    //Create a new class: WriteExcel
    //Create a new method: writeExcel()
    //Store the path of the file as string and open the file
    //Open the workbook
    //Open the first worksheet
    //Go to the first row
    //Create a cell on the 3rd column (2nd index) on the first row

    //Write and save the workbook
    //Write “POPULATION” on that cell
    //Create a cell on the 2nd row 3rd cell(index2), and write 150000
    //Create a cell on the 3rd row 3rd cell(index2), and write 250000
    //Create a cell on the 4th row 3rd cell(index2), and write 54000
    //Close the file
    //Close the workbook

    @Test
    public void excelWrite(){

        //Store the path of the file as string and open the file

        String path = "resources/Capitals.xlsx";


        //Open the workbook
        try {
            FileInputStream fileInputStream = new FileInputStream(path);

            Workbook workbook = WorkbookFactory.create(fileInputStream);


            //Open the first worksheet
            Sheet sheet1 =   workbook.getSheet("Sheet1");

            //Go to the first row

            Row r1 = sheet1.getRow(0);

            //Create a cell on the 3rd column (2nd index) on the first row

            Cell r1C3 =  r1.createCell(2);


            r1C3.setCellValue("POPULATION");

            //Create a cell on the 2nd row 3rd cell(index2), and write 150000

            Row r2 = sheet1.getRow(1);
            Cell r2c3 = r2.createCell(2);

            r2c3.setCellValue("15000");


            //Create a cell on the 3rd row 3rd cell(index2), and write 250000

            Row r3 = sheet1.getRow(2);

            Cell r3c3 = r3.createCell(2);

            r3c3.setCellValue("25000");


            //Create a cell on the 4th row 3rd cell(index2), and write 54000

            Row r4 = sheet1.getRow(3);

            Cell r4c3 =  r4.createCell(2);

            r4c3.setCellValue("54000");


            //Write and save the workbook
            FileOutputStream fileOutputStream = new FileOutputStream(path);

            workbook.write(fileOutputStream);


            //Close the file
            fileInputStream.close();
            //Close the workbook
            workbook.close();


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
