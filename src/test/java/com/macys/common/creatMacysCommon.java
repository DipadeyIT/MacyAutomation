package com.macys.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class creatMacysCommon {

	
	public WebDriver driver;
	
	public void getDriver() {
		
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.macys.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void getClose() {
		
		driver.close();
	}
	
	}

