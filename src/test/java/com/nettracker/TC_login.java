package com.nettracker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_login {
	@Test
	public void test1()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("kveereshme111@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("vskfacebook@111");
		driver.findElement(By.xpath("//button[.='Log In']")).click();
		Assert.assertEquals(driver.getTitle(),"Facebook – log in or sign up");
		driver.close();
		System.out.println("Testing has done");
		
	}

}
