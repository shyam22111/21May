package SeleniumAction;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Selenium.JavaScriptExicutor.JSUtility;

public class ResizeAbleEle {
	static WebDriver driver;
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		driver= new ChromeDriver();
		
//		String url = JSUtility.ReadValueFromExcel(46, 0);
		
//		driver.get(url);
//		driver.get("https://jqueryui.com/resizable/");
//		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		WebElement field = driver.findElement(By.xpath("//textarea[@id]"));
//		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
//		driver.switchTo().frame(frame);
//		WebElement field = driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
//	
//		Actions action = new Actions(driver);
//		Thread.sleep(2000);
//		action.moveToElement(field,70, 50).build().perform();
		
		
		
		for(int i=5; i<=500; i=i+50 ) {
	    driver.get("https://jqueryui.com/resizable/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		WebElement Resizable = driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.dragAndDropBy(Resizable, i, 50).build().perform();
		
		}
		}

	}

