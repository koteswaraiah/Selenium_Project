package utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;


public class Excel {

    

   

	public Object[][] getData(int sheetIndex) throws IOException {

        FileInputStream fis = new FileInputStream("D:\\2026\\data.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);   // FileInputStream used here
        XSSFSheet sheet = workbook.getSheetAt(sheetIndex);
  




    int rowCount = sheet.getPhysicalNumberOfRows();
    int colCount = sheet.getRow(0).getPhysicalNumberOfCells();

    Object[][] data = new String[rowCount - 1][colCount];

    for (int i = 1; i < rowCount; i++) { // skip header
    	Row r =sheet.getRow(i);
        for (int j = 0; j < colCount; j++) {

          data[i-1][j] = r.getCell(j).toString();
        }
    }
	return data;
    
	}    
}
