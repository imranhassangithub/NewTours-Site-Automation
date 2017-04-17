package com.bitm.newtours.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.bitm.newtours.dto.FlightFinder;
import com.bitm.newtours.dto.Login;

public class ExcelUtils {

	private static FileInputStream inputStream = null;
	private static Workbook workbook = null;
	
	public static List<Login> getLoginData() throws IOException{
		List<Login> logins=new ArrayList<Login>();
		
		//login is the first sheet in excel so getSheet parameter set to 0
		Iterator<Row> iterator = ExcelUtils.getSheet(0).iterator();
        while (iterator.hasNext()) {
            Row nextRow = iterator.next();
            Iterator<Cell> cellIterator = nextRow.cellIterator();
            Login login=new Login();
            byte cellCounter=0;
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                switch (cellCounter) {
				case 0:
					login.setUserName(cell.getStringCellValue());
					cellCounter++;
					break;
				case 1:
					login.setPassword(cell.getStringCellValue());
					break;
				default:
					break;
				}               
                 
            }
            logins.add(login);
        }
        close();
		return logins;
}

	private static void close() throws IOException{
		workbook.close();
		inputStream.close();
		
	}
	private  static Sheet getSheet(int sheetNo) throws IOException{
		// change the file location as per your computer
		inputStream = new FileInputStream(new File("E:\\data.xlsx"));
		workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheetAt(sheetNo);
        return sheet;
	}

public static List<FlightFinder> getFlightFindData() throws IOException{
	List<FlightFinder> flightFinders=new ArrayList<FlightFinder>();
	
	//excelflightfind is the second sheet in excel so getSheet parameter set to 1
	DataFormatter formatter = new DataFormatter();
	Iterator<Row> iterator = ExcelUtils.getSheet(1).iterator();
    while (iterator.hasNext()) {
        Row nextRow = iterator.next();
        Iterator<Cell> cellIterator = nextRow.cellIterator();
        FlightFinder excelflightfind=new FlightFinder();
        byte cellCounter=0;
        while (cellIterator.hasNext()) {
            Cell cell = cellIterator.next();
            switch (cellCounter) {
			case 0:
				excelflightfind.setPassengers(formatter.formatCellValue(cell));
				cellCounter++;
				break;
			case 1:
				excelflightfind.setDepartingFrom(formatter.formatCellValue(cell));
				cellCounter++;
				break;
			case 2:
				excelflightfind.setDepartingOnMonth(formatter.formatCellValue(cell));
				cellCounter++;
				break;
			case 3:
				excelflightfind.setDepartingOnDate(formatter.formatCellValue(cell));
				cellCounter++;
				break;				
			case 4:
				excelflightfind.setArrivingIn(formatter.formatCellValue(cell));
				cellCounter++;
				break;
			case 5:
				excelflightfind.setReturningMonth(formatter.formatCellValue(cell));
				cellCounter++;
				break;
			case 6:
				excelflightfind.setReturningDate(formatter.formatCellValue(cell));
				break;			
			default:
				break;
			}               
             
        }
        flightFinders.add(excelflightfind);
    }
    close();
	return flightFinders;
}}