package com.trello.genericutility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public static WebDriver driver;

	public FileUtility fileUtils=new FileUtility();
	@BeforeClass
	public void executeBeforeClass() throws IOException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get(fileUtils.getPropertyData("url"));
	}
//Dummy comment2
//	@AfterClass
//	public void executeAfterClass()
//	{
//	driver.manage().window().minimize();
//	driver.quit();
//	}

}
