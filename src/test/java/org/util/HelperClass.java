package org.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import net.bytebuddy.agent.builder.AgentBuilder.FallbackStrategy.Simple;

public class HelperClass {
	//static variable 
	public static WebDriver driver;
	public static FileInputStream fi;
	public static Workbook book;

	public static String dataFromExcel(String name,int rowNo,int cellNo) {
		
		File f= new File("src\\test\\resources\\data\\testdata.xlsx");
		try {
			 fi= new FileInputStream(f);
		} catch (FileNotFoundException e) {}
		
		try {
			 book=new XSSFWorkbook(fi);
		} catch (IOException e) {}
		
		Sheet sheet = book.getSheet(name);
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
	
		int cellType = cell.getCellType();
	
		String value=null;
	
		if (cellType==1) {
			 value = cell.getStringCellValue();
		}
		else if (DateUtil.isCellDateFormatted(cell)) {
			Date d = cell.getDateCellValue();
			
			SimpleDateFormat s= new SimpleDateFormat();
			 value = s.format(d);
		}
		
		else {
			double d = cell.getNumericCellValue();//111.0
			//long --->111
			long l=(long)d;//111
			
			value = String.valueOf(l);
		}
		return value;
	}
	
	
	public static void edgeBrowser() {
			driver=new EdgeDriver();
			driver.manage().window().maximize();		
	}
	
	
	public static void chromeBrowser() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	}
	public static void passUrl(String url) {
		driver.get(url);
	}
	public static void PassValue(WebElement element,String value) {
		element.sendKeys(value);
	}
	
	public static void elementClick(WebElement element) {
			element.click();
	}
	
	public static void allElementWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public static void verifyDisplayElement(WebElement element) {
			boolean displayed = element.isDisplayed();
			System.out.println(displayed);
	}
	
	public static void entireBrowserClose() {
		driver.quit();
	};
	
	public static String currentPageTitle() {
			String title = driver.getTitle();
			return title;
	}
	
	
	public static  void dateAndTime() {
	
		Date d= new Date();
		System.out.println(d);
	}
	
	
	public static String title() {
	
		String title = driver.getTitle();
		return title;
	}
	
	
}
