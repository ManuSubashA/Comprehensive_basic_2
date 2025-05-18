package org.readAndWriteDate;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAnWriteDate {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// Identifing the location of the excel file
		
		 String excelFilePath = ".\\Files\\datafile.xlsx";
		 
	        List<Map<String, String>> dataList = new ArrayList<>();

	        try (FileInputStream fis = new FileInputStream(excelFilePath);
	             XSSFWorkbook workbook = new XSSFWorkbook(fis)) {

	            XSSFSheet sheet = workbook.getSheetAt(0);
	            Iterator<Row> rowIterator = sheet.iterator();

	            // Read header
	            Row headerRow = rowIterator.next();
	            List<String> headers = new ArrayList<>();
	            for (Cell cell : headerRow) {
	                headers.add(cell.getStringCellValue());
	            }

	            // Read data rows
	            while (rowIterator.hasNext()) {
	                Row row = rowIterator.next();
	                Map<String, String> rowData = new HashMap<>();
	                for (int i = 0; i < headers.size(); i++) {
	                    Cell cell = row.getCell(i);
	                    cell.setCellType(CellType.STRING); // ensure all cells read as String
	                    rowData.put(headers.get(i), cell.getStringCellValue());
	                }
	                dataList.add(rowData);
	            }

	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        // Display data
	        for (Map<String, String> row : dataList) {
	            System.out.println(row);
	        }
	    }
	}