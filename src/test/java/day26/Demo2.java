package day26;

import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo2 {

	public static void main(String[] args) throws Exception {
		String path="./data/xpath.xlsx";
		
		//xlsx file is also called as workbook
		//open xlsx file
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		
		//goto sheet1
		Sheet sheet = wb.getSheet("Sheet1");
		//goto 1st row
		Row r = sheet.getRow(0);
		//goto 1st cell
		Cell c = r.getCell(0);
		//get cell value in string format & print it
		String v = c.getStringCellValue();
		System.out.println(v);
		
		//close the xlsx file
		wb.close();
		
	}

}

//output
//Element