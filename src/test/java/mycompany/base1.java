package mycompany;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class base1 {
	public static WebDriver driver;

	@BeforeMethod
	public void launch() {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//geckodriver");
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	
	
	  public void getscreen() throws IOException { 
		  long a = System.currentTimeMillis(); 
		  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(src, new File("/home/arij/Projet/Maven22"+ a +"screenshot2.png")); 
		  }
	 
}
