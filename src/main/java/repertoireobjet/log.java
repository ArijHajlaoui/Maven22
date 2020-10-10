package repertoireobjet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class log {
	WebDriver driver;
	
	public log(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id="email")
	WebElement email3;
	
	public WebElement emailID3() {
		return email3;	
	}

	
	
	
	
	//private By email = By.id("email");
	private By mp = By.cssSelector(":focus");
	private By enter = By.cssSelector("#u_0_b");
	private By email2 = By.xpath("//input[@id='email']");
	private By mp2 = By.cssSelector("#pass");
	private By info = By.linkText("Mot de passe oublié ?");
	
	/*
	 * public WebElement emailID() { return (driver.findElement(email)); }
	 */
	
	public WebElement motdpass() {
		return (driver.findElement(mp));
	}
	public WebElement entrer() {
		return (driver.findElement(enter));	
	}
	public WebElement emailID2() {
		return (driver.findElement(email2));	
	}
	public WebElement motdpass2() {
		return (driver.findElement(mp2));
	}
	public WebElement infooublie() {
		return (driver.findElement(info));
	}
	
}
