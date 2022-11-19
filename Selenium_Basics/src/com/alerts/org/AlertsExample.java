package com.alerts.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsExample {

	private static org.openqa.selenium.Alert alert1;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Practices\\Selenium_Basics\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://testleaf.herokuapp.com/home.html");
		driver.manage().window().maximize();
		WebElement AlertButton = driver.findElement(By.xpath("//h5[text()='Alert']"));
		AlertButton.click();
		
		WebElement AlertBox = driver.findElement(By.xpath("//button[@onclick='normalAlert()']"));	
		AlertBox.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		WebElement ConfirmBox = driver.findElement(By.xpath("//button[@onclick='confirmAlert()']"));
		ConfirmBox.click();
		Alert ConfirmAlert = driver.switchTo().alert();
		ConfirmAlert.dismiss();
		
		WebElement PromptBox = driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']"));
		PromptBox.click();
		Alert promptAlert = driver.switchTo().alert();
		promptAlert.sendKeys("Google");
		String prompText = promptAlert.getText();
		System.out.println(prompText);
		
		promptAlert.accept();
		
	}

}
