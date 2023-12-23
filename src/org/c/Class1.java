package org.c;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\DELL\\Downloads\\chromedriver-win64 new\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.seleniumeasy.com/table-data-download-demo.html");
		//heading
		WebElement heading = driver.findElement(By.xpath("//th[text()='Name']"));
		System.out.println(heading.getText());
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		//column full data
		WebElement table = driver.findElement(By.id("example"));
		List<WebElement> rows = table.findElements(By.cssSelector("tbody tr"));
		int size = rows.size();
		System.out.println("no of rows:"+size);
		for (WebElement allrows : rows) {
			List<WebElement> column = allrows.findElements(By.tagName("td"));
			WebElement columns = column.get(0);
			System.out.println(columns.getText());
		}
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	WebElement age = driver.findElement(By.xpath("//td[text()='47']"));
	String text = age.getText();
	System.out.println("age of the employee:"+text);
	if (text.equals("47")) {
		WebElement name = driver.findElement(By.xpath("//td[text()='Angelica Ramos']"));
		String text2 = name.getText();
		System.out.println("name of the employee:"+text2);
	}
	
	
	
	
	
	}

}
