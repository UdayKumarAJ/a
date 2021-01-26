package com.swagen.qaswb.testcase.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	synchronized public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread();
		t.run();
		
		System.setProperty("webdriver.chrome.driver", "src/main/resources/webDriverBinaries/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String title = driver.getTitle();
		System.out.println(title);
		 
		driver.wait(5000);
		driver.quit();
		
	}
}
