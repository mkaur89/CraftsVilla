package com.craftsvilla.generic;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel 
{
	public static String[][] getData(String fileName, String sheetName)
	{
		File file = null;
		FileInputStream fin= null;
		Workbook wb = null;
		Sheet sh = null;
		
		try 
		{
			file = new File(fileName);
			fin = new FileInputStream(file);
			wb = new XSSFWorkbook();
			sh = wb.getSheet(sheetName);
			
			int rows = sh.getLastRowNum() + 1;
			int cells = sh.getRow(0).getLastCellNum();
			
			String[][] data = new String[rows][cells];
			for(int indexRow = 0; indexRow<rows;indexRow++)
			{
				Row r = sh.getRow(indexRow);
				for(int indexCell = 0; indexCell<cells;indexCell++)
				{
					Cell c = r.getCell(indexCell);
					String value = new DataFormatter().formatCellValue(c);
					//value = c.getStringCellValue();
					data[indexRow][indexCell] = value;
				}
			}
			return data;
		}
		catch(Exception e)
		{
			return null;
		}
		finally 
		{
		try 
		{
			wb.close();
			wb = null;
			sh = null;
			fin.close();
			fin = null;
			file = null;
		}
		catch(Exception e) 
		{
			
		}
		
		}
	}
}
