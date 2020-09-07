/****************************************
Package Name:Utilities
Method Name:WritetoExcel
Method Description: This class is designed for writting to the excel sheet.
Date Of Creation: 12/4/2020
Author Name:Sadiq Mehmood Ansari
Employee ID:855396
*******************************************/

package Utilities;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritetoExcel {

	public static void logData(int actSpeed, int i, int j) throws IOException {
		File file=new File("./reports/dataLog.xlsx");  //Creation of the excel file
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet sheet=wb.createSheet("TestLog"); 
		//Entering data to the created sheet TestLog
		sheet.createRow(i).createCell(j).setCellValue("Top speed:");  //
		sheet.getRow(i).createCell(j+1).setCellValue(actSpeed);
		sheet.createRow(i+1).createCell(j).setCellValue("Result");
		sheet.getRow(i+1).createCell(j+1).setCellValue("Does not meet my requirements");
		FileOutputStream fout=new FileOutputStream(file);  //Instatiating fileoutputstream class for writting inside the excel sheet.
		wb.write(fout);
	}
}



