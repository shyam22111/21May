package Selenium.ApachePoi;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "\\C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String Url = "http://automationpractice.com/index.php";
		driver.get(Url);
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		signin.click();
		
		
		WebElement Email = driver.findElement(By.xpath("//input[@id='email']"));
		FileInputStream file = new FileInputStream("C:\\Users\\Shyam\\OneDrive\\Desktop\\TestData.xlsx");
		String id = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		Email.sendKeys(id);
		
		WebElement Pass = driver.findElement(By.xpath("//input[@id='passwd']"));
		FileInputStream file1= new FileInputStream("C:\\Users\\Shyam\\OneDrive\\Desktop\\TestData.xlsx");
		String pass = WorkbookFactory.create(file1).getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
		Pass.sendKeys(pass);
	
		WebElement Submit = driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
		Submit.click();
		
		WebElement signOut = driver.findElement(By.xpath("//a[@class='logout']"));
		signOut.click();
		

	    
	    
	  
	    
	    
	}

}
