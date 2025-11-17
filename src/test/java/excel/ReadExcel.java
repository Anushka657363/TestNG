package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;

//import com.microsoft.schemas.office.visio.x2012.main.CellType;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		FileInputStream fileInput=new FileInputStream(new File("./src/test/resources/TestData.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(fileInput);
		XSSFSheet sheet = workbook.getSheet("Data");
//		System.out.println("Total Rows: "+sheet.getLastRowNum());
//		System.out.println("Total Columns: "+sheet.getRow(1).getLastCellNum());
		int totalRows=sheet.getLastRowNum();
		for(int i=1;i<=totalRows;i++) {
			XSSFRow row=sheet.getRow(i);
			//System.out.println("Total cols in row"+i+": "+ row.getLastCellNum());
			int totalCols=row.getLastCellNum();
			for(int j=0;j<totalCols;j++) {
				XSSFCell cell=row.getCell(j);
				if(cell.getCellType()==CellType.STRING)
					System.out.print(row.getCell(j).getStringCellValue()+" ");
				else if(cell.getCellType()==CellType.NUMERIC)
					System.out.print(row.getCell(j).getNumericCellValue());
				
			}
			System.out.println("");
		}
		
        workbook.close();

	}

}
