package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadWrite {

	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow wr;
	public static XSSFCell wc;

	public static void OpenExcel(String pathname) throws IOException {
		File f = new File(Basevariables.excelSheetpath);
		FileInputStream fis = new FileInputStream(f);
		wb = new XSSFWorkbook(fis);
}
	public static String ReadExcel(String SheetName, int rownum, int cellnum){
		ws = wb.getSheet(SheetName);
		wc = ws.getRow(rownum).getCell(cellnum);
		String cellvalue = wc.getStringCellValue();
		return cellvalue;
		}
	
	
	public static String ReadExcelNumeric(String sheetname, int rownumber, int columnnumber) {
		ws = wb.getSheet(sheetname);
		wc = ws.getRow(rownumber).getCell(columnnumber);
		
		if (wc.getCellType()==wc.CELL_TYPE_NUMERIC) {
			String str = NumberToTextConverter.toText(wc.getNumericCellValue());
			return str;
		} else {
			String cellvalue = wc.getStringCellValue();
			return cellvalue;
		}
	}
	
	public static int totalrows(String SheetName){
		ws = wb.getSheet(SheetName);
		int totalrows = ws.getLastRowNum();
		return totalrows;
	}
	
	public static void writetoExcel(String SheetName,int rownum, int cellnum, String Value) throws Exception{
		ws = wb.getSheet(SheetName);
		wc = ws.getRow(rownum).getCell(cellnum);
		wc.setCellValue(Value);
		
	FileOutputStream fos = new FileOutputStream(Basevariables.excelSheetpath);
	wb.write(fos);
	fos.close();
	
	File f = new File(Basevariables.excelSheetpath);
	FileInputStream fis = new FileInputStream(f);
	wb = new XSSFWorkbook(fis);	
		
	}


}


