package Selenium.WebTable;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ReadTables {

	
	public static WebDriver driver;
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		driver= new ChromeDriver();
		
		// read data from excel
		FileInputStream file = new FileInputStream("C:\\Users\\Shyam\\OneDrive\\Desktop\\TestData.xlsx");
		String url = WorkbookFactory.create(file).getSheet("Sheet1").getRow(45).getCell(0).getStringCellValue();
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
//		ScreenShot();
//		driver.close();
		
//		driver.findElement(By.xpath("//a[@href='//money.rediff.com/gainers/bse/daily/groupa']")).click();
		driver.findElement(By.xpath("//p[@class='alignR']/a")).click();
		ScreenShot();
		
		// Atcual code
		
//		List<WebElement> topGainers = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr"));
//		int ros = topGainers.size();
		
		int rows = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr")).size();
		int cols = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr[1]//td")).size();
		
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=cols;j++) {
//				String firstGainer = driver.findElement(By.xpath("//table[@class='dataTable']//tbody//tr[1]//td[1]")).getText();
				String AllGainers = driver.findElement(By.xpath("//table[@class='dataTable']//tbody//tr["+i+"]//td["+j+"]")).getText();
				System.out.print(AllGainers+"==");
			}
			  System.out.println();
			   
		}
	}
	
	public static void ScreenShot() throws IOException {
		// screenshot
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Date date = new Date();
		String fname = date.toString().replace(" ", "_").replace(":", "_")+".png";
		File Destination = new File("C:\\Users\\Shyam\\OneDrive\\Desktop\\ProjectLibrary\\ProjectRelated\\ScreenShot\\MoneyReddif\\"+fname);
		FileUtils.copyFile(src, Destination);
		
	}

}
