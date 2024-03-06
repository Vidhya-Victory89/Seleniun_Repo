package day9.assign9;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook wbook=new XSSFWorkbook("./DataSheet/createLead.xlsx");
		XSSFSheet sheet=wbook.getSheetAt(0);
        int rowcount=sheet.getLastRowNum();
        System.out.println("Row Count: "+rowcount);
        int includeheader= sheet.getPhysicalNumberOfRows();
        System.out.println("Include Header Row Count: "+includeheader);
        int cellcount=sheet.getRow(1).getLastCellNum();
        System.out.println("Cell Count: "+cellcount);
        String phone=sheet.getRow(1).getCell(3).getStringCellValue();
        System.out.println("Phone Number: "+phone);
        for(int i=1;i<=rowcount;i++)
        {
        	System.out.println();
        	for(int j=0;j<cellcount;j++)
        	{
        		String data=sheet.getRow(i).getCell(j).getStringCellValue();
        		System.out.print("\t"+data);
        	}
        }
        wbook.close();
	}

}
