package SeleniumAction;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Selenium.JavaScriptExicutor.JSUtility;

public class keys {
	static WebDriver driver;
	static Actions action;
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
	driver= new ChromeDriver();
	action= new Actions(driver);
	
	String url = JSUtility.ReadValueFromExcel(49, 0);
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	WebElement user = driver.findElement(By.xpath("//input[@id='email']"));
	WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
	WebElement clickbtn = driver.findElement(By.xpath("//button[@id='loginbutton']"));
	
	
	action.keyDown(Keys.SHIFT).sendKeys(user, "shyam").keyUp(Keys.SHIFT).build().perform();
	action.sendKeys(pass, "Shyam@123").build().perform();
	action.moveToElement(clickbtn).click().build().perform();

}
}