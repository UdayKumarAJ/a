package com.swagen.qaswb.testcase.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	synchronized public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "src/main/resources/webDriverBinaries/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		//driver.findElement(By.className(""));
//		driver.findElement(By.cssSelector("text")).sendKeys("_Uday_Kumar_A_J");
//		driver.findElement(By.name("password")).sendKeys("uday9986466152");
//		driver.findElement(By.id("submit")).click();
		driver.findElement(By.id("email")).sendKeys("udaykumaraj@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("12345");
		driver.findElement(By.id("u_0_b")).click();
	
	}
}
