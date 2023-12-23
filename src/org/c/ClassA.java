package org.c;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassA {
	
	private void empName() {
		System.out.println("Employee Name: Sam");

	}
	public static void main(String[] args) {
		ClassA a = new ClassA();
		a.empName();
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\DELL\\Downloads\\chromedriver-win64 new\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("subha");
		driver.findElement(By.id("pass")).sendKeys("subha123");
		driver.findElement(By.name("login")).click();
		
		
		
		
	}

}
