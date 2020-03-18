package com.boraji.tutorial.springboot.service;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.ui.Model;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AppendDataCSV {
    //Create blank workbook
    XSSFWorkbook workbook = new XSSFWorkbook();

    //Create a blank sheet
    XSSFSheet spreadsheet = workbook.createSheet( " Employee Info ");

    //Create row object
    XSSFRow row;

    public void storeToExcel(String name, String ticketnumbertoday, String todaysstatus, String ticketnumbertommows, String tommmorowsstatus) throws IOException {

        System.out.println("Writesheet.xlsx written successfully");


    }
}
