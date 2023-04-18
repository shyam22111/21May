package SeleniumAction;

import java.io.IOException;
import java.sql.Driver;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Selenium.JavaScriptExicutor.JSUtility;

public class DragToLocation {
	static WebDriver driver;
	static Actions action;

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		
       driver= new ChromeDriver();
       action= new Actions(driver);
       String url = JSUtility.ReadValueFromExcel(47, 0);
       driver.get(url);
       
       WebElement dropableEle = driver.findElement(By.xpath("//a[text()='Draggable']"));
       action.moveToElement(dropableEle).click().build().perform();
       
       driver.switchTo().frame(0);
       
       WebElement ele = driver.findElement(By.xpath("//div[@id='draggable']"));
       action.dragAndDropBy(ele, 300, 200).build().perform();
       
       
	}

}
