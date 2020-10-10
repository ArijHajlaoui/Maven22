package mycompany;

import org.testng.annotations.Test;

import repertoireobjet.log;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Testc2 extends base1{
	
	@Test
	public void tabulation2() {
		log fb = new log(driver);
		fb.emailID2().sendKeys("ariiiiij");
		fb.motdpass2().sendKeys("12");
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("gfrkf");
		
		//driver.findElement(By.cssSelector("#pass")).sendKeys("gfrekkf");
	}
	@Test(dependsOnMethods= "tabulation2")
	public void infooublies() {
		log fb = new log(driver);
		fb.infooublie().click();
		//WebElement e = driver.findElement(By.cssSelector("body.fbIndex.UIPage_LoggedOut._-kb._605a.b_c3pyn-ahh.chrome.webkit.win.x1.Locale_fr_FR.cores-gte4._19_u.hasAXNavMenubar:nth-child(2) div._li:nth-child(2) div._53jh div.loggedout_menubar_container div.clearfix.loggedout_menubar div.menu_login_container.rfloat._ohf tbody:nth-child(1) tr:nth-child(3) td.login_form_label_field:nth-child(2) div:nth-child(1) > a:nth-child(1)"));
		//e.click();
	}

}
