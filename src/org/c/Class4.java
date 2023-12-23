package org.c;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class4 {
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\DELL\\Downloads\\chromedriver-win64 new\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		WebElement user= driver.findElement(By.id("email"));
		executor.executeScript("arguments[0].setAttribute('value','Ram')",user);
	TakesScreenshot tc= (TakesScreenshot)driver;
	File as = tc.getScreenshotAs(OutputType.FILE);
	File s= new File("C:\\Users\\DELL\\OneDrive\\Pictures\\Screenshots\\img.png");
	FileUtils.copyFile(as, s);
	
	
	}
	
	
	
	
	
	
		
//		


}