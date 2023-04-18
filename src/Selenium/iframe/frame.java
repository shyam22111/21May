package Selenium.iframe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class frame {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String URL = "https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame";
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		
//		WebElement iframe = driver.findElement(By.xpath("//li[@id='']"));
//		iframe.click();
		
		driver.switchTo().frame("iFrame");
		
		
		WebElement filter = driver.findElement(By.xpath("//span[@id='current_filter']"));
	    filter.click();
	 
	    
	    WebElement SoftTest = driver.findElement(By.xpath("//div[text()='Software Testing']"));
	    SoftTest.click();
	    
	   
	}

}
