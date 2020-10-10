package mycompany;

import org.testng.annotations.Test;

import repertoireobjet.log;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Testc1 extends base1 {

	
    @Test
	public void tabulation1() {
    	log fb = new log(driver);
    	fb.emailID3().sendKeys("arijhajlaoui@gmail.com");
    	fb.emailID3().sendKeys(Keys.TAB);
    	fb.motdpass().sendKeys("1234");
		/*
		 * WebElement ele = driver.findElement(By.id("email")); ele.sendKeys("email");
		 * ele.sendKeys(Keys.TAB); WebElement element2 =
		 * driver.findElement(By.cssSelector(":focus")); element2.sendKeys("1234");
		 */
	}
	@Test (dependsOnMethods = { "tabulation1" })
	public void enter() {
		log fb = new log(driver);
		fb.entrer().click();
		/*
		 * WebElement element = driver.findElement(By.xpath("//input[@id='u_0_b']"));
		 * element.click();
		 */
	}

}
