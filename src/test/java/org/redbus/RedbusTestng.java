package org.redbus;

import java.awt.AWTException;
import java.util.Date;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RedbusTestng extends LibGlobal{
RedbusPojo r;
@BeforeClass
private void startDateAndTime() {
Date d=new Date();
System.out.println("Start Date and Time is:"+d);
}
@AfterClass
private void endDateAndTime() {
	Date d=new Date();
    System.out.println("End Date and Time is:"+d);
}
@BeforeMethod
private void startBrowser() {
	browserlaunch();
	loadUrl("https://www.redbus.in/");
	windowMaximise();
}	
@AfterMethod
private void endBrowser() {
	browserQuit();
}
@Test
public void tc() throws AWTException {
	r=new RedbusPojo();
	fillTextBox(r.getTxtFrom(), "Chennai");
	enterButton();
	fillTextBox(r.getTxtTo(), "Thanjavur");
	enterButton();
	btnClick(r.getTxtDate());
	WebElement date = xpath("//td[text()='13']");
	btnClick(date);
    btnClick(r.getBtnPic());
    btnClick(r.getBtnSign());
    toWaitimplicit();
    frameWebelement(r.getFrame());
    fillTextBox(r.getTxtMobile(), "9790224523");
    String mob = enteredText(r.getTxtMobile());
    Assert.assertEquals("9790224523", mob);
}
}
