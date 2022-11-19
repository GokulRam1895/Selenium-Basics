package com.buttons.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonsExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\Selenium Practices\\Selenium_Basics\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/home.html");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement button = driver.findElement(By.xpath("(//img[@class='wp-categories-icon svg-image'])[2]"));
		button.click();
		
	// 1.Find the button position x,y
		
		WebElement buttonPosition = driver.findElement(By.id("position"));
		
		Point p= buttonPosition.getLocation(); // Point class and getLocation for finding the button position;
		int xValue = p.getX();
		int yValue = p.getY();
		 System.out.println("X value is : "+xValue+" y value is: "+yValue);
		 
	//2. Find the button color
		
		 WebElement color = driver.findElement(By.id("color"));
		 String buttonColor = color.getCssValue("background-color");  //getCssValue method is used to get the color of the button
		 System.out.println("Button color is "+buttonColor);
		 
	//3. Find the size of button
		 
		 WebElement sizeofButton = driver.findElement(By.id("size"));
		 int buttonHeight = sizeofButton.getSize().getHeight(); //getSize() of method used for getHeight and getWidth of the button
		 int buttonWidth = sizeofButton.getSize().getWidth();
		 System.out.println("The button Height and width are: "+"\n"+buttonHeight+"\n"+buttonWidth);
		 
	//4. Go to home page
		 
		 WebElement HomePage = driver.findElement(By.id("home"));
		 HomePage.click();
	}

}
