package SeleniumAction;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Selenium.JavaScriptExicutor.JSUtility;

public class RightClickOnImage {
	
	static WebDriver driver;
	static Actions action;
	
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		action = new Actions(driver);
		
		String url = JSUtility.ReadValueFromExcel(48, 0);
		
		driver.get(url);
		WebElement img = driver.findElement(By.xpath("//img[@src='data-samples/images/popup_pic.gif']"));
		action.contextClick(img).build().perform();
		
	}

}
