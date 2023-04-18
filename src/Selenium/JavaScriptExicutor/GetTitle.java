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

public class GetTitle {

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
			
			// getTitle webpage		
			String titl1 = js.executeScript("return document.title").toString();
			System.out.println(titl1);
			
			
			// getTitle webpage
			WebElement input = driver.findElement(By.xpath("//input[@id='search_query_top']"));
			String titl = js.executeScript("return document.title", input).toString();
			System.out.println(titl);
			

		

	}

}
