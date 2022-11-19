package com.dropdown.org;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDrownExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Practices\\Selenium_Basics\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://testleaf.herokuapp.com/home.html");
		driver.manage().window().maximize();
		WebElement dropDown = driver.findElement(By.xpath("//h5[text()='Drop down']"));
		dropDown.click();

		//1.Select dropdown option by using Index

		WebElement dropdown1 = driver.findElement(By.id("dropdown1"));
		Select select1= new Select(dropdown1);
		select1.selectByIndex(2);
		
		//2.Select dropdown option by using value
		WebElement dropdown2 = driver.findElement(By.name("dropdown2"));
		Select select2= new Select(dropdown2);
		select2.selectByValue("3");
		
		//3.Select dropdown option by using visibleText
		WebElement dropdown3 = driver.findElement(By.id("dropdown3"));
		Select select3= new Select(dropdown3);
		select3.selectByVisibleText("Loadrunner");

		//4.Get the options in dropdown
		List<WebElement> options = select1.getOptions();
		int size = options.size();
		System.out.println(size);

		//5. Select options  using sendkeys
		dropdown1.sendKeys("Load");

		//6. Select Multiple options

		WebElement multiSelect = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
		Select s=new Select(multiSelect);
		s.selectByIndex(1);
		s.selectByIndex(2);
		s.selectByIndex(3);

		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		int allSelectedOptionSize = allSelectedOptions.size();
		System.out.println(allSelectedOptionSize);

		WebElement firstSelectedOption = s.getFirstSelectedOption();
		String text = firstSelectedOption.getText();
		System.out.println(text);
	}

}
