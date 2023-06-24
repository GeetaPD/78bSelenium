package day26;

import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo3 {

	public static void main(String[] args) throws Exception {
		//open xlsx file
		Workbook wb = WorkbookFactory.create(new FileInputStream("./data/xpath.xlsx"));

		//goto sheet1 -> row0 -> cell0 -> getvalue & print it
//		String v = wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
						//OR
		String v = wb.getSheet("Sheet1").getRow(0).getCell(0).toString();
		System.out.println(v);
		
		//close xlsx file
		wb.close();
		
	}

}

//output
///html/body/div[1]/input[1]