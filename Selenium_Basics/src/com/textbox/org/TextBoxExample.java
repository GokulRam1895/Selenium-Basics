package com.textbox.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxExample {

	private static boolean enabled;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\Selenium Practices\\Selenium_Basics\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://testleaf.herokuapp.com/home.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement editBox = driver.findElement(By.xpath("(//a[@class='wp-categories-link maxheight'])[1]"));
		editBox.click();
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("xyz@gmail.com");
		WebElement append = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		append.sendKeys("Hello");
		WebElement getValue = driver.findElement(By.xpath("//input[@value='TestLeaf']"));
		String attribute = getValue.getAttribute("value");
		System.out.println(attribute);
		WebElement clearMe = driver.findElement(By.xpath("//input[@value='Clear me!!']"));
		clearMe.clear();
		WebElement disabled = driver.findElement(By.xpath("//input[@disabled='true']"));
		enabled = disabled.isEnabled();
		System.out.println(enabled);
	}

}
