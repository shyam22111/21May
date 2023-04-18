package Selenium.iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwithToiframe {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String URL = "https://omayo.blogspot.com/";
        driver.get(URL);
        
		driver.switchTo().frame("iframe1");
		System.out.println("driver in first 1frame");
		driver.switchTo().parentFrame();
		driver.switchTo().frame("iframe2");
		System.out.println("driver in first 2frame");
		driver.switchTo().defaultContent();
		WebElement alert2 = driver.findElement(By.xpath("//input[@id='alert2']"));
		alert2.click();
		driver.switchTo().alert().accept();
		driver.close();
	}

}
