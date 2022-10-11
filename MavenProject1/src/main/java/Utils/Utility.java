package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	private static String data;
	private static int i;
    private static int j;
	public static void captureScreenshot(WebDriver driver,int testID) throws IOException
	{
		LocalDateTime dateTime = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String currentTime= (dateTime.format(formatter));
		System.out.println(currentTime);
	
		File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\Software Testing\\TestingDocs\\Test"+testID+currentTime+".jpg");
		FileHandler.copy(source, dest);
	}
	
	public static String fetchExcelData(String sheet,int row,int cell) throws IllegalStateException, IOException 
	{	String path = "D:\\Excelsheet\\Book1.xlsx";
		FileInputStream File = new FileInputStream(path);
		
		Sheet s = WorkbookFactory.create(File).getSheet("Sheet1");
		   
		try
		{
			data = s.getRow(i).getCell(j).getStringCellValue();
		}
		catch(IllegalStateException e)
		{
			long n= (long) s.getRow(i).getCell(j).getNumericCellValue();
			data= Double.toString(n);	
		}
		return data;
	}
}

