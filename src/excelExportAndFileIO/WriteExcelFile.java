package excelExportAndFileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelFile {

	public void writeExcel(String filePath, String fileName, String sheetName, String[] dataToWrite)
			throws IOException {

		File file = new File(filePath + "\\" + fileName);

		FileInputStream inputStream = new FileInputStream(file);

		Workbook guru99Workbook = null;

		String fileExtensionName = fileName.substring(fileName.indexOf("."));

		if (fileExtensionName.equals(".xlsx")) {

			guru99Workbook = new XSSFWorkbook(inputStream);

		}

		else if (fileExtensionName.equals(".xls")) {

			guru99Workbook = new HSSFWorkbook(inputStream);

		}

		Sheet sheet = guru99Workbook.getSheet(sheetName);

		int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();

		Row row = sheet.getRow(0);

		Row newRow = sheet.createRow(rowCount + 1);

		for (int j = 0; j < row.getLastCellNum(); j++) {

			Cell cell = newRow.createCell(j);

			cell.setCellValue(dataToWrite[j]);

		}

		// Close input stream

		inputStream.close();

		// Create an object of FileOutputStream class to create write data in excel file

		FileOutputStream outputStream = new FileOutputStream(file);

		// write data in the excel file

		guru99Workbook.write(outputStream);

		// close output stream

		outputStream.close();

	}

	public static void main(String... strings) throws IOException {

		// Create an array with the data in the same order in which you expect to be
		// filled in excel file

		String[] valueToWrite = { "Mr. E", "Noida" };

		// Create an object of current class

		WriteExcelFile objExcelFile = new WriteExcelFile();

		// Write the file using file name, sheet name and the data to be filled

		objExcelFile.writeExcel(System.getProperty("user.dir") + "\\src\\excelExportAndFileIO", "ExportExcel.xlsx",
				"ExcelGuru99Demo", valueToWrite);

	}

}