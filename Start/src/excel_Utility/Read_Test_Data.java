package excel_Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sun.javafx.collections.MappingChange.Map;



public class Read_Test_Data {

	private static final String TC_ID = null;
	public static HashMap<Object, Object> getTestData(String TC_ID) throws IOException{
		File file = new File("C:\\Users\\hp\\Downloads\\TestData.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(fileInputStream);
		Sheet sh = wb.getSheet("Sheet1");
		int totalNoOfRows = sh.getLastRowNum() - sh.getFirstRowNum();
        Row headerrow = sh.getRow(0);
        HashMap<Object, Object> map = new HashMap<Object, Object>();

        for (int row = 1; row < totalNoOfRows; row++) {

            Row row1 = sh.getRow(row);
            if ((row1.getCell(0).getStringCellValue()).equals(TC_ID)) {
                for (int col = 1; col < row1.getLastCellNum(); col++) {
                    map.put(headerrow.getCell(col).getStringCellValue(), row1.getCell(col).getStringCellValue());
                }
              //  System.out.println(map);

            }
           
}
        
	
        return map;

}
	/*@DataProvider(name="searchCategory")
	public static Object[][] searchcategoryDataProvider() throws IOException{
	
		Object[][] Obj;
		Obj= new Object[1][1];
		HashMap<Object,Object> datamap= new HashMap<Object,Object>();
		datamap = getTestData("TC_001");
		
		Obj[0][0]=datamap;
		return Obj;
	
		 };*/
		
	}
	



