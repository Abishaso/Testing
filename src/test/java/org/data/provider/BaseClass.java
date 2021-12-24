package org.data.provider;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	static WebDriver driver;
	
	public static void chrome() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
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
	
	public static void takeScreenshot(String imagename) throws IOException {
		TakesScreenshot tk= (TakesScreenshot) driver;
		File from = tk.getScreenshotAs(OutputType.FILE);
		File to=new File("\\C:\\Users\\THALAIVA\\eclipse-workspace\\Testing\\src\\test\\resources\\"+imagename+".png");
		FileUtils.copyFile(from, to);
	}
	
	
}
