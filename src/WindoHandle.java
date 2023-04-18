import java.io.FileInputStream;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindoHandle {
	// pop ups
//	1.Hidden Division Popups.
//	2.Alert Popup.
//	3.Child Browser Popups.
//	4.Authentication Popup.
//	5.File Upload.
//	6.File Download.

	static Iterator<String> itr;
	static Set<String> WindosAll;
	static  WebDriver driver;
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
//		3.Child Browser Popups.
		
		FileInputStream file= new FileInputStream("C:\\Users\\Shyam\\OneDrive\\Desktop\\TestData.xlsx");
		String url = WorkbookFactory.create(file).getSheet("Sheet1").getRow(44).getCell(0).getStringCellValue();
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		String idWind = driver.getWindowHandle();
//		System.out.println(idWind);
		
		
		// first windo
	     WindosAll = driver.getWindowHandles();
		 itr = WindosAll.iterator();
		String firstWindo = itr.next();
		System.out.println(firstWindo);
		driver.switchTo().window(firstWindo);
		driver.findElement(By.xpath("//li[@class='twitter']/a ")).click();
		
		// second window
		WindosAll = driver.getWindowHandles();
		itr=WindosAll.iterator();
		itr.next();
		String senconWindo = itr.next();
		System.out.println(senconWindo);
		driver.switchTo().window(senconWindo);
		driver.findElement(By.xpath("//span[text()='Privacy Policy']")).click();
		
		
		
		// third window
		WindosAll=driver.getWindowHandles();
		itr=WindosAll.iterator();
		itr.next();
		itr.next();
		String ThidWindow = itr.next();
		System.out.println(ThidWindow);
		driver.switchTo().window(ThidWindow);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement lastEle = driver.findElement(By.xpath("//a[text()='Help Center']"));
		String text = lastEle.getText();
		System.out.println(text);
		
		
		// return first window
		
		driver.switchTo().window(firstWindo);
		driver.findElement(By.xpath("//a[@class='login']")).click();
		
		
	}
}
