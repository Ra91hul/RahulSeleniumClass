package week5.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		// Step1 : Locate the Workbook(setup the path)
		XSSFWorkbook wb = new XSSFWorkbook("./data/CreateLead.xlsx");

		// Step2 : Get into the sheet
		XSSFSheet ws = wb.getSheet("Sheet1");

		int rowCount = ws.getLastRowNum();

		short cellCount = ws.getRow(0).getLastCellNum();

		for (int i = 1; i <= rowCount; i++) {
			for (int j = 0; j < cellCount; j++) {

				String text = ws.getRow(i).getCell(j).getStringCellValue();
				System.out.println(text);
			}

		}

		// last step
		wb.close();

	}

}
