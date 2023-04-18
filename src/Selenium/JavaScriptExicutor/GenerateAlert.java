package Selenium.JavaScriptExicutor;

import java.awt.Button;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenerateAlert {  // CHeckPoints
	static WebDriver driver;
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		driver= new ChromeDriver();
		
		FileInputStream file = new FileInputStream("C:\\Users\\Shyam\\OneDrive\\Desktop\\TestData.xlsx");
		String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(5).getCell(0).getStringCellValue();
		driver.get(value);
		
		// typecast dirver
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		
		// generate alert  CHeckPoints
		WebElement login = driver.findElement(By.xpath("//a[@class='login']"));
		js.executeScript("arguments[0].click();", login);
		js.executeScript("alert('"+"Button Successfuly clicked"+"')");
		
	}
}
