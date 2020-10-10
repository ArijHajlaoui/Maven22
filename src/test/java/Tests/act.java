package Tests;

import org.apache.logging.log4j.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class act {
	
	private static Logger log =LogManager.getLogger(act.class.getName());
	@Test
	public void log() {
	// TODO Auto-generated method stub
	   log.debug("set des propriétés chrome");
	   System.setProperty("webdriver.gecko.driver", "/home/arij/Projet/Maven22/geckodriver");
		
		
		WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	   log.info("j'aggrandit la fenètre");
	   log.debug("taper l adresse de la page amazon ");
	driver.get("https://www.amazon.com/");
	   log.info("j entre dans la page amazon");
	Actions a =new Actions(driver);


	/* a.moveToElement(driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"))) .click().keyDown(Keys.SHIFT).sendKeys("capitalletters").doubleClick().build().perform();
	a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).build().perform();
	a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).contextClick().build().perform();*/


	driver.get("http://jqueryui.com/demos/droppable/");
	   log.debug("je calcule le nombre de frames");
	System.out.println(driver.findElements(By.tagName("iframe")).size());
	log.info("nombre calculé de Frames");
	try
	{
	driver.switchTo().frame(0);
	log.info("passage a frame avec success");
	}
	catch(Exception e)
	{
	log.error("frame non identifié et echec d'entrer dans frame"); 
	}
	//driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
	   log.debug("Identification des objets Draggable");
	       WebElement draggable = driver.findElement(By.id("draggable"));
	       WebElement droppable = driver.findElement(By.id("droppable"));
	       new Actions(driver).dragAndDrop(draggable, droppable).build().perform();
	log.info("Drag and drop avec success");
	}

}
