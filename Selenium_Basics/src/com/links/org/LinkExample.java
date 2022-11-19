package com.links.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\Selenium Practices\\Selenium_Basics\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Link.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement linkText = driver.findElement(By.linkText("Go to Home Page"));
		linkText.click();
		Thread.sleep(2000);
		WebElement partialLinkText = driver.findElement(By.partialLinkText("Home Page"));
		partialLinkText.click();

	}

}
