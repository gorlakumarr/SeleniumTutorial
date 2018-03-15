package excelExportAndFileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {

	String data;

	public void readExcel(String filePath, String fileName, String sheetName) throws IOException {

		File file = new File(filePath + File.separator + fileName);

		FileInputStream fileInputStream = new FileInputStream(file);

		Workbook Workbook = null;

		String fileExten = fileName.substring(fileName.indexOf("."));

		if (fileExten.equals(".xlsx")) {
			Workbook = new XSSFWorkbook(fileInputStream);

		} else if (fileExten.equals(".xls")) {
			Workbook = new HSSFWorkbook(fileInputStream);

		}

		Sheet sheet = Workbook.getSheet(sheetName);
		int rowcount = sheet.getLastRowNum() - sheet.getFirstRowNum();

		for (int i = 0; i < rowcount + 1; i++) {

			Row row = sheet.getRow(i);

			for (int j = 0; j < row.getLastCellNum(); j++) {

				data = row.getCell(j).getStringCellValue();

				System.out.println(data);

			}
			System.out.println();

		}

	}

	// Main function is calling readExcel function to read data from excel file

	public static void main(String[] args) {
		try {

			ReadExcelFile excelFile = new ReadExcelFile();

			String filePath = System.getProperty("user.dir") + "\\excelExportAndFileIO";

			excelFile.readExcel(filePath, "ExportExcel.xlsx", "Sample");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}