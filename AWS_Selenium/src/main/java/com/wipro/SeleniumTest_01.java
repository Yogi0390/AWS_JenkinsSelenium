package com.wipro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTest_01 {

	WebDriver driver;
	
	@Test
	public void launchapp() throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("headless");
		driver= new ChromeDriver(options);
		driver.get("https://www.bing.com");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.id("sb_form_q"));
		search.sendKeys("intellipaat");
		search.submit();
		System.out.println("Title of the page is:" + driver.getTitle());
		Thread.sleep(2000);
		driver.quit();
	}

}
