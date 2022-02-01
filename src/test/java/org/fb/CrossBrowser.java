package org.fb;

import org.base.LibGlobal;
import org.flipkart.FlipkartPojoClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowser extends LibGlobal {
	public WebDriver driver;
	@Parameters({"browser"})
	@Test
	private void m1(String browserName) {
		if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("https://www.flipkart.com/account/login");
			driver.manage().window().maximize();
//			driver.findElement(By.xpath("//input[@type='text'])[2]")).sendKeys("baladharan18@gmail.com");
			FlipkartPojoClass f=new FlipkartPojoClass();
			fillTextBox(f.getTxtEmail(), "baladharan@gmail.com");
			fillTextBox(f.getTxtPassword(), "9790224556");
			btnClick(f.getBtnLogin());
			
		}
		else if (browserName.equals("ff")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();	
			driver.get("https://www.facebook.com/");
		}
		else {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			driver.get("http://www.greenstechnologys.com/");
		}
//		driver.get("https://www.facebook.com/");
//		driver.get("http://www.greenstechnologys.com/");
//		driver.get("https://www.flipkart.com/account/login");
//		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//input[@type='text'])[2]")).sendKeys("baladharan18@gmail.com");
//		FlipkartPojoClass f=new FlipkartPojoClass();
//			fillTextBox(f.getTxtEmail(), "baladharan@gmail.com");
//			String email = enteredText(f.getTxtEmail());
//			Assert.assertEquals("baladharan@gmail.com", email);
//			fillTextBox(f.getTxtPassword(), "9790224556");
//			String pass = enteredText(f.getTxtPassword());
//			Assert.assertEquals("9790224556", pass);
//			btnClick(f.getBtnLogin());
	

}
}
