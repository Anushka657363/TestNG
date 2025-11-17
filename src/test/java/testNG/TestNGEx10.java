package testNG;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGEx10 {
	
	
	@Test(dataProvider="RetieveData")
	public Object[][]getData()throws IOException {
		FileInputStream fileInput=new FileInputStream(new File("./src/test/resources/retrievingdata.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(fileInput);
		XSSFSheet sheet = workbook.getSheet("Reading");
		
		int totalRows=sheet.getLastRowNum();
		int totalCols=sheet.getRow(0).getLastCellNum();
		
		Object[][]data=new Object[totalRows][totalCols];
		
		for(int i=1;i<=totalRows;i++) {
			XSSFRow row=sheet.getRow(i);
			int firstCellNum=row.getFirstCellNum();
			int lastCellNum=row.getLastCellNum();
			  for (int j = firstCellNum; j < lastCellNum; j++) {
				  
			        if (row.getCell(j).getCellType() == CellType.STRING) {
			            data[i - 1][j] = row.getCell(j).getStringCellValue();
			        } else if (row.getCell(j).getCellType() == CellType.NUMERIC) {
			            data[i - 1][j] = row.getCell(j).getNumericCellValue();
			        } else {
			            data[i - 1][j] = ""; // Handle blank or other types
			        }
			    }
		}
		workbook.close();
		return data;
	}
	
	@DataProvider(name="RetriveData")
	public void login(String userName,double password) {
		System.out.println("UserName: "+userName+"Pasword: "+password);
		
	}
//	public Object[][]getData(){
//		Object[][] obj=new Object[3][2];
//	
//	obj[0][0]="Anushka";
//	obj[0][1]="Anu123";
//	obj[1][0]="John";
//	obj[1][1]="2345";
//	obj[2][0]="Anu";
//	obj[2][1]="123";
//	return obj;
//	
//	
//	}
	
}
