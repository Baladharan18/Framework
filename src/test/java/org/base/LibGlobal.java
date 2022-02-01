package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {
	public static WebDriver driver;
	public static Actions ac;
	public static Select s;
	public static Robot r;
	public static Alert al;
	public static JavascriptExecutor js;
	public static ArrayList<String> a;
	public static void browserlaunch() {
    WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();
	}
	public static void loadUrl(String url) {
		driver.get(url);
	}
	public static void windowMaximise() {
		driver.manage().window().maximize();
	}
    public static String currentUrl() {
	String url = driver.getCurrentUrl();
	return url;
    }
    public static String title() {
    	String title = driver.getTitle();
    	return title;
	}
    public static void fillTextBox(WebElement element,String value) {
    	element.sendKeys(value);
	}
    public static void btnClick(WebElement element) {
    	element.click();
	}
    public static void browserQuit() {
    	driver.quit();
	}
    public static String enteredText(WebElement element) {
    	String attribute = element.getAttribute("value");
    	return attribute;  	
	}
    public static String existingText(WebElement element) {
    	String text = element.getText();
    	return text;

	}
    public static void mouseHover(WebElement element) {
    	ac=new Actions(driver);
    	ac.moveToElement(element).perform();
	}
    public void toDragAndDrop(WebElement source,WebElement dest) {
    	ac=new Actions(driver);
    	ac.dragAndDrop(source, dest).perform();
	}
    public static void toDoubleClick(WebElement element) {
    	ac=new Actions(driver);
    	ac.doubleClick(element).perform();
    }
    public static void rightClick(WebElement element) {
    	ac=new Actions(driver);
    	ac.contextClick(element);
	}
    public static void toWaitimplicit() {
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
    public static void toWaitExplicit(WebElement element) {
    	WebDriverWait w=new WebDriverWait(driver, 20);
    	w.until(ExpectedConditions.elementToBeClickable(element));
	}
    public static void toTakeSnap(String fileName) throws IOException {
    	TakesScreenshot tk=(TakesScreenshot)driver;
    	File f = tk.getScreenshotAs(OutputType.FILE);
    	File des=new File("C:\\Users\\rider\\balaji\\MavenProjectBala\\Screenshot\\"+fileName+".png");
    	FileUtils.copyFile(f, des);
	}
    public static void toSelectByIndex(WebElement element,Integer index) {
    	s=new Select(element);
    	s.selectByIndex(0);
	}
    public static void toSelectByValue(WebElement element,String value) {
    	s=new Select(element);
    	s.selectByValue(value);
	}
    public static void toSelectByVisibleText(WebElement element,String text) {
    	s=new Select(element);
    	s.selectByVisibleText(text);
	}
    public static boolean multiple(WebElement element) {
    	s=new Select(element);
    	boolean multiple = s.isMultiple();
    	return multiple;
	}
    public static void toGetOptions(WebElement element) {
    	s=new Select(element);
    	List<WebElement> options = s.getOptions();
    	for (int i = 0; i < options.size(); i++) {
    		WebElement option = options.get(i);
    		String text = option.getText();
    		System.out.println(text);			
		}
	}
    public static void toGetAllSelectedOptions(WebElement element) {
      	s=new Select(element);
      	List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
      	for (WebElement x : allSelectedOptions) {
      		String text = x.getText();
      		System.out.println(text);			
		}
	}
    public void toGetFirstSelectedOption(WebElement element) {
    	s=new Select(element);
    	WebElement firstSelectedOption = s.getFirstSelectedOption();
    	String text = firstSelectedOption.getText();
    	System.out.println(text);
	}
    public static void toDeselectAll(WebElement element) {
    	s=new Select(element);
    	s.deselectAll();
	}
    public static void toDeslelectByIndex(WebElement element, Integer index) {
    	s=new Select(element);
    	s.deselectByIndex(index);
	}
    public static void toDeselectByValue(WebElement element, String value ) {
    	s=new Select(element);
    	s.deselectByValue(value);
	}
    public static void toDeselectByVisibleText(WebElement element, String text) {
    	s=new Select(element);
    	s.deselectByVisibleText(text);
	}
    public static void enterButton() throws AWTException {
    	r=new Robot();
    	r.keyPress(KeyEvent.VK_ENTER);
    	r.keyRelease(KeyEvent.VK_ENTER);
	}
    public static void tabButton() throws AWTException {
    	r=new Robot();
    	r.keyPress(KeyEvent.VK_TAB);
    	r.keyRelease(KeyEvent.VK_TAB);
    }
    public static void shiftButton() throws AWTException {
    	r=new Robot();
    	r.keyPress(KeyEvent.VK_SHIFT);
    	r.keyRelease(KeyEvent.VK_SHIFT); 	
	}
    public static void downButton() throws AWTException {
    	r=new Robot();
    	r.keyPress(KeyEvent.VK_DOWN);
    	r.keyRelease(KeyEvent.VK_DOWN);
	}
    public static void upButton() throws AWTException {
    	r=new Robot();
    	r.keyPress(KeyEvent.VK_UP);
    	r.keyRelease(KeyEvent.VK_UP);
	}
    public static void capsButton() throws AWTException {
    	r=new Robot();
    	r.keyPress(KeyEvent.VK_CAPS_LOCK);
    	r.keyRelease(KeyEvent.VK_CAPS_LOCK);
	}
    public static void copy() throws AWTException {
    	r=new Robot();
    	r.keyPress(KeyEvent.VK_CONTROL);
    	r.keyPress(KeyEvent.VK_C);
    	r.keyRelease(KeyEvent.VK_C);
    	r.keyRelease(KeyEvent.VK_CONTROL);
	}
    public static void cut() throws AWTException {
    	r=new Robot();
    	r.keyPress(KeyEvent.VK_CONTROL);
    	r.keyPress(KeyEvent.VK_X);
    	r.keyRelease(KeyEvent.VK_X);
    	r.keyRelease(KeyEvent.VK_CONTROL);

	}
    public static void alertAccept() {
    	al=driver.switchTo().alert();
    	al.accept();
	}
    public static void alertDismiss() {
    	al=driver.switchTo().alert();
    	al.dismiss();
	}
    public static void alertSendkeys(String text) {
    	al=driver.switchTo().alert();
    	al.sendKeys(text);
	}
    public static void alertGetText() {
    	al=driver.switchTo().alert();
    	String text = al.getText();
    	System.out.println(text);
	}
    
    public static void scrollDown(WebElement element) {
    	js=(JavascriptExecutor)driver;
    	js.executeScript("arguments[0].scrollIntoView(true)", element);
    }
    public static void scrollUp(WebElement element) {
    	js=(JavascriptExecutor)driver;
    	js.executeScript("arguments[0].scrollIntoView(false)", element);
    }
    public static void jsSendKeys(WebElement element, String txt) {
    	js=(JavascriptExecutor)driver;
    	js.executeScript("arguments[0].setAttribute('value',"+txt+")", element);
	}
    public static String jsGetAttribute(WebElement element) {
    	js=(JavascriptExecutor)driver;
    	 String text =(String) js.executeScript("return arguments[0].getAttribute('value')", element);
    	 return text;
	}
    public static void jsClick(WebElement element) {
    	js=(JavascriptExecutor)driver;
    	js.executeScript("arguments[0].click()", element);
	}
    public static void frameId(String id) {
    	driver.switchTo().frame(id);
	}
    public static void frameName(String name) {
    	driver.switchTo().frame(name);
	}
    public static void frameIndex(Integer index) {
    	driver.switchTo().frame(index);
	}
    public static void frameWebelement(WebElement element) {
    	driver.switchTo().frame(element);
	}
    public static void frameSize(String name) {
    	List<WebElement> frameList = driver.findElements(By.tagName(name));
    	int size = frameList.size();
    	System.out.println(size);
	}
    public static void frameParent() {
    	driver.switchTo().parentFrame();
	}
    public static void frameDefault() {
    	driver.switchTo().defaultContent();
	}
    public static void windowId() {
    	String windowHandle = driver.getWindowHandle();
    	System.out.println(windowHandle);
	}
    public static void windowsId() {
    	Set<String> windowHandles = driver.getWindowHandles();
    	System.out.println(windowHandles);
	}
    public static void switchWindow(Integer i) {
    	Set<String> windowHandles = driver.getWindowHandles();
    	a=new ArrayList<String>();
    	List<String> li=a;
    	li.addAll(windowHandles);
    	driver.switchTo().window(li.get(i));
	}
    public static void enable(WebElement element) {
    	boolean enabled = element.isEnabled();
    	System.out.println(enabled);
	}
    public static void display(WebElement element) {
    	boolean displayed = element.isDisplayed();
    	System.out.println(displayed);
	}
    public static void select(WebElement element) {
    	boolean selected = element.isSelected();
    	System.out.println(selected);
   	}
    public static void toBack() {
    	driver.navigate().back();
	}
    public static void toForward() {
    	driver.navigate().forward();
	}
    public static void toRefresh() {
    	driver.navigate().refresh();
	}
    public static WebElement xpath(String path) {
    	WebElement findElement = driver.findElement(By.xpath(path));
    	return findElement;
	}
    public static WebElement byId(String Id) {
       WebElement findElement = driver.findElement(By.id(Id));
       return findElement;
	}
    public static WebElement byName(String name) {
    	WebElement findElement = driver.findElement(By.name(name));
    	return findElement;
	}
    public static void excelSheet(String sheetName, int ri, int ci,WebElement element) throws IOException {
    	File f=new File("C:\\Users\\rider\\balaji\\MavenProjectBala\\ExcelSheets\\DATA EXCEL .xlsx");
    	FileInputStream fin=new FileInputStream(f);
    	Workbook w=new XSSFWorkbook(fin);
    	Sheet sh = w.getSheet(sheetName);
    	Row row = sh.getRow(ri);
    	Cell cell = row.getCell(ci);
    	int type = cell.getCellType();
    	String value="";
    	if (type==1) {
    		 value = cell.getStringCellValue();
			}
    	else if (DateUtil.isCellDateFormatted(cell)) {
    		Date d= new Date();
    		SimpleDateFormat sim=new SimpleDateFormat("dd-MM-yyyy");
    		 value = sim.format(d);			
		}
    	else {
			double d = cell.getNumericCellValue();
			long l=(long)d;
			value = String.valueOf(l);
			}
    	System.out.println(value);
    	element.sendKeys(value);
    	

	}
    public static void excelsheetString(String sheetname, int ri, int ci,WebElement element) throws IOException {
    	File f = new File("C:\\Users\\rider\\balaji\\MavenProjectBala\\ExcelSheets\\DATA EXCEL .xlsx");
    	FileInputStream input = new FileInputStream(f);
    	Workbook w = new XSSFWorkbook(input);
    	Sheet s = w.getSheet(sheetname);
    	Row r = s.getRow(ri);
    	Cell c = r.getCell(ci);
    	String stringCellValue = c.getStringCellValue();
    	System.out.println(stringCellValue);
    	element.sendKeys(stringCellValue);
    }
    public static void excelsheetnumeric(String sheetname, int ri, int ci,WebElement element) throws IOException {
    	File f = new File("C:\\Users\\rider\\balaji\\MavenProjectBala\\ExcelSheets\\DATA EXCEL .xlsx");
    	FileInputStream input = new FileInputStream(f);
    	Workbook w = new XSSFWorkbook(input);
    	Sheet s = w.getSheet(sheetname);
    	Row r = s.getRow(ri);
    	Cell c = r.getCell(ci);
    	  double d = c.getNumericCellValue();
    	  long l= (long)d;
    	  String value = String.valueOf(l);
    	  System.out.println(value);
    	  element.sendKeys(value);
    	  
    	}
    public static void excelToWrite(String sheetname,int ri,int ci,String text) throws IOException {
    	File f=new File("C:\\Users\\rider\\balaji\\MavenProjectBala\\ExcelSheets\\AdactinHotelReport.xlsx");
    	Workbook w=new XSSFWorkbook();
    	Sheet s=w.createSheet(sheetname);
    	Row r = s.createRow(ri);
    	Cell c = r.createCell(ci);
    	c.setCellValue(text);;
    	FileOutputStream foup=new FileOutputStream(f);
    	w.write(foup);
    	System.out.println("DONE");
    	
    	

	}
    
}
