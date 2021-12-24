package org.cross.browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	static WebDriver driver;
	
	public static WebDriver launchBrowser(String browsername) {
	switch(browsername) {	
	case "chrome":
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	break;
	
	case "edge":
	WebDriverManager.edgedriver().setup();
	driver =new EdgeDriver();
	}
	return driver;
	}
	
	public static void url(String url,int sec) {
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}
	
	public static void sendKeys(WebElement e, String data) {
	e.sendKeys(data);
	}
	
	public static void click(WebElement e) {
	e.click();
	}
	
	
	
	
}
