package com.nettracker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Jiraclass {

		@Test
		public void test1()
		{
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.jira.com");
			//driver.findElement(By.xpath("//span[.='Continue with Google']")).click();
			//driver.findElement(By.xpath("//span[.='Create']")).click();

	}

}
