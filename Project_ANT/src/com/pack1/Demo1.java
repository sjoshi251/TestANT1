package com.pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Demo1 {

	@Test
	public void demo() {
		System.out.println("Hello");

		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.google.com");

		WebElement ele= driver.findElement(By.name("q"));
		ele.sendKeys("Geography");
		
		ele.submit();
		
		
	}

}
