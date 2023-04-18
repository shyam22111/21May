package Selenium.JavaScriptExicutor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementBorder {
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
		
		// border
		WebElement input = driver.findElement(By.xpath("//input[@id='search_query_top']"));
		WebElement Blouse = driver.findElement(By.xpath("//a[@title='Blouse']"));
		js.executeScript("arguments[0].style.border='3px solid red'", input);
		System.out.println("ok");
		

	}

}
