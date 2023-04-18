package Selenium.JavaScriptExicutor;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CallFromUtility {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String value = JSUtility.ReadValueFromExcel(5, 0);
		driver.get(value);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		// elements
		WebElement login = driver.findElement(By.xpath("//a[@class='login']"));
		WebElement input = driver.findElement(By.xpath("//input[@id='search_query_top']"));
		WebElement login1 = driver.findElement(By.xpath("//a[@class='login']"));
		
		// operation
		JSUtility.JsBorder(driver,input);
		JSUtility.TakesScreenShotM(driver);
		JSUtility.JsText(driver);
		JSUtility.Jsclick(driver,login); 
		JSUtility.JsAlert(driver, login1,"Button Successfuly clicked.");
		JSUtility.ScrollUp(driver,login, 0,5000);
		
		WebElement Createacc = driver.findElement(By.xpath("//i[@class='icon-user left']"));
		JSUtility.ClickIntoPage(driver,Createacc);
		
		
		driver.close();
	}

}
