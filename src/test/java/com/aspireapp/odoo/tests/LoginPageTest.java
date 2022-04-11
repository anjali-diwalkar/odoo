package com.aspireapp.odoo.tests;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPageTest
{
	@Test

	public static void OpenBrowser()
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation software support\\Chrome\\chromedriver_win32\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://aspireapp.odoo.com/web/login");
		driver.manage().window().maximize(); 
		
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("user@aspireapp.com");
		driver.findElement(By.cssSelector("input#password")).sendKeys("@sp1r3app");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
		
		}

}
