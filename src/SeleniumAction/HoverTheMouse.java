package SeleniumAction;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverTheMouse {
      static WebDriver driver;
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		driver= new ChromeDriver();
		
		
		// read data from excel
		
		FileInputStream file = new FileInputStream("C:\\Users\\Shyam\\OneDrive\\Desktop\\TestData.xlsx");
		String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(43).getCell(0).getStringCellValue();
		

		driver.get(value);
		// handle hidden browser popups
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[@aria-label='Close']")).click();
		
		List<WebElement> elements = driver.findElements(By.xpath("//ul[@id]//a"));
		
		for(int i= 0;i<elements.size();i++ ) {
			WebElement Fele = elements.get(i);
			String text = Fele.getText();
			Actions action = new Actions(driver);
			action.moveToElement(Fele).build().perform();
			System.out.println(text);
			
			// printing All Sub Elements
			
		}
		
	}

}
