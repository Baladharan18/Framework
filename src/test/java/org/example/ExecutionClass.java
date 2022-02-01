package org.example;

import java.awt.AWTException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.base.LibGlobal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
// File and data Driven concept
public class ExecutionClass extends LibGlobal{
	public static void main(String[] args) throws IOException {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.facebook.com/");
//		driver.manage().window().maximize();
//		browserlaunch();
//		loadUrl("https://www.facebook.com/");
//		windowMaximise();
//		String url = currentUrl();
//		System.out.println(url);
//		String title = title();
//		System.out.println(title);
//		WebElement txtEmail = driver.findElement(By.id("email"));
//		fillTextBox(txtEmail, "baladharan18@gmail");
//		String jsGetAttribute = jsGetAttribute(txtEmail);
//		System.out.println(jsGetAttribute);
//    	WebElement txtPass = driver.findElement(By.name("pass"));
//    	fillTextBox(txtPass, "9790224523");
//    	jsSendKeys(txtPass, "9790224523");
//    	WebElement btnLogin = driver.findElement(By.xpath("//button[@name='login']"));
//    	btnClick(btnLogin);
//    	enterButton();
//    	jsClick(btnLogin);
//		File f=new File("C:\\Users\\rider\\balaji\\MavenProjectBala\\ExcelSheets\\DATA EXCEL .xlsx");
//		FileInputStream fin=new FileInputStream(f);
//		Workbook w=new XSSFWorkbook(fin);
//		Sheet s = w.getSheet("Sheet1");
//		Row r = s.getRow(1);
//		Cell c = r.getCell(4);
//		System.out.println(c);
//		int rows = s.getPhysicalNumberOfRows();
//		System.out.println(rows);
//		for (int i = 0; i < rows; i++) {
//			Row row = s.getRow(i);
//			int cells = row.getPhysicalNumberOfCells();
//			for (int j = 0; j < cells; j++) {
//				Cell cell = row.getCell(j);
//				int cellType = cell.getCellType();
//				String value="";
//				//to get String value
//			if (cellType==1) {
//				value = cell.getStringCellValue();
//				} 
//			else if (DateUtil.isCellDateFormatted(cell)) {
//				Date d=new Date();
//				Date d=c.getDateCellValue();
//				SimpleDateFormat sim=new SimpleDateFormat("dd-MM-yyy");
//				value = sim.format(d);
//				} 
//			else {
//				double d = cell.getNumericCellValue();
//				long l=(long)d;
//				value=String.valueOf(l);
//				}
//			System.out.println(value);
//			}
//			}
		File f=new File("C:\\Users\\rider\\balaji\\MavenProjectBala\\ExcelSheets.xlsx");
		Workbook w=new XSSFWorkbook();
		Sheet s = w.createSheet("Balaji");
//		Row r = s.createRow(0);
//		Cell c = r.createCell(0);
//		c.setCellValue("Bala");
//		FileOutputStream fous=new FileOutputStream(f);
//		w.write(fous);
//		System.out.println("done");
		for (int i = 0; i < 10; i++) {
			Row r = s.createRow(i);
			for (int j = 0; j < 5; j++) {
				Cell c = r.createCell(j);
				c.setCellValue("Bala");
				FileOutputStream ff=new FileOutputStream(f);
				w.write(ff);
				}
				}
	System.out.println("Done");

					}

	}

//}
