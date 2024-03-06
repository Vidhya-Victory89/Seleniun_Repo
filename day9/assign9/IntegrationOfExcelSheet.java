package day9.assign9;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class IntegrationOfExcelSheet {
	public static String[][] excelvalue() throws IOException
	{
	XSSFWorkbook wbook=new XSSFWorkbook("./DataSheet/createLead.xlsx");
	XSSFSheet sheet=wbook.getSheetAt(0);
    int rowcount=sheet.getLastRowNum();
    int cellcount=sheet.getRow(1).getLastCellNum();
    String[][] data=new String[rowcount][cellcount];
    for(int i=1;i<=rowcount;i++)
    {
    	System.out.println();
    	for(int j=0;j<cellcount;j++)
    	{
    		String datavalue=sheet.getRow(i).getCell(j).getStringCellValue();
    		System.out.print("\t"+data);
    		data[i-1][j]=datavalue;
    	}
    }
    wbook.close();
    return data;
	}
}

