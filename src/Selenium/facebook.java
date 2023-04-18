package Selenium;

import java.util.*;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String url = "https://www.facebook.com/reg/"; 
		driver.get(url);
		
		// Select  drpodown
		
		WebElement dropDown = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		
		Select select = new Select(dropDown);
//		select.selectByIndex(4); 
//		
//		WebElement dropDown1 = driver.findElement(By.xpath("//select[@name='birthday_month']"));
//		Select select1 = new Select(dropDown1);
//		select1.selectByVisibleText("Oct"); 
		
//		WebElement dropDown2 = driver.findElement(By.xpath("//select[@name='birthday_year']"));
//		Select select2 = new Select(dropDown2);
//		select2.selectByValue("1996");
		
		List<WebElement> optionAll = select.getOptions();
		// Read data by using advanced for 
		for(int i=0;i<optionAll.size();i++) {
//		              WebElement fOption = optionAll.get(i);
//		              String op1 = fOption.getText();
		              String fOption = optionAll.get(i).getText();
		              System.out.println(fOption);
			
//		}
		
//		 
//		 Read data by using advanced for loop
//	       for(WebElement xyz:optionAll) {
//	    	  String abc = xyz.getText();
//	    	  System.out.println(abc);
	    	   
	       }   
	       
	       // by using itrator 
//		Iterator<WebElement> optionAllhasNoOfOption = optionAll.iterator();
//		while (optionAllhasNoOfOption.hasNext()) {
//			WebElement indivisualOption = (WebElement) optionAllhasNoOfOption.next();
//			System.out.println(indivisualOption.getText());
//		}
		
		
	     // by using itrator2  
//			Iterator<WebElement> optionAllhasNoOfOption1 = optionAll.iterator();
//			while (optionAllhasNoOfOption1.hasNext()) {
//				String indivisualOption1 = optionAllhasNoOfOption1.next().getText();
//				System.out.println(indivisualOption1);
//			}
	}
	}

