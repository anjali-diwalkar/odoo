package com.aspireapp.odoo.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ProductPageTest 

{
	@Test
public static void ProductInfo() throws Exception 
	{  
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation software support\\Chrome\\chromedriver_win32\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://aspireapp.odoo.com/web/login");
		driver.manage().window().maximize(); 
		
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("user@aspireapp.com");
		driver.findElement(By.cssSelector("input#password")).sendKeys("@sp1r3app");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			   
		driver.findElement(By.xpath("(//*[@class='o_caption'])[2]")).click();
		driver.findElement(By.xpath("(//button/span)[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@data-section='124']")).click();
		driver.findElement(By.xpath("//*[@title='Create record']")).click();
		Thread.sleep(9000);
		driver.findElement(By.xpath("//*[@placeholder='e.g. Cheese Burger']")).sendKeys("Toy");
		
		WebElement StaticDropdown = driver.findElement(By.xpath("//td/select"));
		Select Producttype = new Select(StaticDropdown);
		Producttype.selectByIndex(3);
		driver.findElement(By.xpath("(//*[@type='button'][@class='fa fa-external-link btn btn-secondary o_external_button'])[1]")).click();
		
		driver.findElement(By.xpath("(//*[@class='btn btn-secondary o_form_button_cancel'])[2]")).click();
		//driver.findElement(By.xpath("//*[text() ='Save']")).click();
		
		
		driver.findElement(By.xpath("//*[text()='Update Quantity']")).click();
		driver.findElement(By.xpath("//*[@class='btn btn-primary o_list_button_add']")).click();
		driver.findElement(By.xpath("//*[@title ='Save record']")).click();
		driver.findElement(By.xpath("//*[@title='Home menu']")).click();
		driver.findElement(By.xpath("(//*[@class='o_caption'])[3]")).click();
		driver.findElement(By.xpath("//*[@class='btn btn-primary o_list_button_add']")).click();
		
		
	}
	}