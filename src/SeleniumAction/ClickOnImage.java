package SeleniumAction;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Selenium.JavaScriptExicutor.JSUtility;

public class ClickOnImage {

	static Actions action;
	static WebDriver driver;
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		driver= new ChromeDriver();
		 action= new Actions(driver);
		 
		 String url = JSUtility.ReadValueFromExcel(47, 0);
		 driver.get(url);
		 
		 
		 

	}

}
