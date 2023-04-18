package Selenium.JavaScriptExicutor;

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

public class ScrollUpDown {
	static WebDriver driver;
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		driver= new ChromeDriver();
		
		FileInputStream file = new FileInputStream("C:\\Users\\Shyam\\OneDrive\\Desktop\\TestData.xlsx");
		String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(5).getCell(0).getStringCellValue();
		driver.get(value);
		
		// typecast dirver
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		
		// scroll down
		WebElement login = driver.findElement(By.xpath("//a[@class='login']"));
		login.click();
		Thread.sleep(2000);
		js.executeScript("scroll(0,5000)");
		
		Thread.sleep(2000);
		//  scroll up
//		js.executeScript("scroll(0,-200");
		
		
		
		// scroll into view
		WebElement Createacc = driver.findElement(By.xpath("//i[@class='icon-user left']"));
		js.executeScript("arguments[0].scrollIntoView(true);",Createacc );
		Createacc.click();
	
	
		

	
	}

}
