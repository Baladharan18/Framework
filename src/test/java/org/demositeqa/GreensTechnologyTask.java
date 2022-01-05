package org.demositeqa;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;

public class GreensTechnologyTask extends LibGlobal {
	public static void main(String[] args) {
		browserlaunch();
		loadUrl("http://www.greenstechnologys.com/");
		windowMaximise();
		WebElement down = xpath("//p[text()='Copyright © 2019 greenstechnologys.com. All Rights Reserved.']");
		scrollDown(down);
		System.out.println(existingText(down));
		WebElement up = xpath("//h1[text()='No 1 Software Training Institutes in Chennai with Placements']");
		scrollUp(up);
	    System.out.println(existingText(up));
	    WebElement cer = xpath("//a[text()='Certifications']");
	    btnClick(cer);
	    toWaitimplicit();
	    WebElement sel = xpath("//*[@id=\"article-wrapper\"]/ul/li[30]/span/a");
	    scrollDown(sel);
	    btnClick(sel);
	    toWaitimplicit();
	    WebElement down1 = xpath("//*[@id=\"article-wrapper\"]/div[4]/p[1]");
	    scrollDown(down1);
	    System.out.println(existingText(down1));
	    WebElement up1 = xpath("//a[text()='COURSES']");
	    scrollUp(up1);
	    mouseHover(up1);
	    WebElement java = xpath("//a[text()='Java Training ']");
	    mouseHover(java);
	    WebElement core = xpath("//a[text()='Core Java Training']");
	    btnClick(core);
	    toWaitimplicit();
	    WebElement down2 = xpath("//h2[text()='Java training Reviews from Anitha']");
	    scrollDown(down2);
	    System.out.println(existingText(down2));
	    WebElement carr = xpath("//a[text()='CAREERS']");
	    scrollUp(carr);
	    btnClick(carr);
	    toWaitimplicit();
	    WebElement down3 = xpath("(//a[text()='contact@greenstechnologys.com'])[8]");
	    scrollDown(down3);
	    System.out.println(existingText(down3));
	    WebElement contact = xpath("//*[@id=\"menu-course-new-top-menu\"]/li[4]/a");
	    scrollUp(contact);
	    btnClick(contact);
	    toWaitimplicit();
	    switchWindow(1);
	    WebElement main = xpath("//h3[text()='Our Main Branches In Chennai ']");
	    System.out.println(existingText(main));
	    WebElement down4 = xpath("//p[text()='Copyright © 2018 Greens Technology. All rights reserved.']");
	    scrollDown(down4);
	    System.out.println(existingText(down4));
	    
	    
	}

}
