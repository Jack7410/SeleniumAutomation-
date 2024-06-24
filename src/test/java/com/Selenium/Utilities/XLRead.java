package com.Selenium.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLRead {
	public XSSFWorkbook workbook ;
	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell cell;
	public InputStream input;
	public OutputStream output;
	
	
	public int getRowCount (String xlname,String sheetname) throws IOException {
		input = new FileInputStream(xlname);
		workbook= new XSSFWorkbook(input);
		sheet= workbook.getSheet(sheetname);
		int Rowcount= sheet.getLastRowNum();
		input.close();
		workbook.close();
		return Rowcount;
		
	}
	public int getCellCount(String xlname,String sheetname,int rownumber) throws IOException {
		input= new FileInputStream(xlname);
		workbook= new XSSFWorkbook(input);
		sheet= workbook.getSheet(sheetname);
		row = sheet.getRow(rownumber);
		int CellCount= row.getLastCellNum();
		input.close();
		workbook.close();
		return CellCount;
	}
	
	public String getCellData(String xlname, String sheetname, int rownumber, int cellnumber) throws IOException {
		input= new FileInputStream(xlname);
		workbook= new XSSFWorkbook(input);
		sheet= workbook.getSheet(sheetname);
		row= sheet.getRow(rownumber);
		cell= row.getCell(cellnumber);
		
		String data;
		try {
		DataFormatter formatter= new DataFormatter();
		String celldata=formatter.formatCellValue(cell);
		return celldata;
		}catch (Exception e) {
			data=" ";
		}
		input.close();
		workbook.close();
		return data;
		
	}
	
	public void setCellData(String xlname, String sheetname, int rownumber, int cellnumber,String data) throws IOException {
		input=new FileInputStream(xlname);
		workbook= new XSSFWorkbook(input);
		sheet= workbook.getSheet(sheetname);
		row= sheet.getRow(rownumber);
		cell= row.getCell(cellnumber);
		cell.setCellValue(data);
		output= new FileOutputStream(xlname);
		input.close();
		workbook.close();
		
	}
	
	
}
