package ZMoneyRediff;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Selenium.JavaScriptExicutor.JSUtility;

public class allCompanies {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		JSUtility.Setproperty();
		WebDriver driver = new ChromeDriver();
		
		String url = JSUtility.ReadValueFromExcel(45, 0);
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement moregainers = driver.findElement(By.xpath("//a[@href='//money.rediff.com/gainers/bse/daily/groupa']"));
		moregainers.click();
		WebElement all = driver.findElement(By.xpath("//a[text()='All']"));
		all.click();
		 int totalCopmSize = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr")).size();
		 int fCompsize = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr[1]//td")).size();
		 
		 for(int i=1;i<totalCopmSize;i++) {
			 
			 for(int j=1;j<fCompsize;j++) {

				 String fComp = driver.findElement(By.xpath("//table[@class='dataTable']//tbody//tr["+i+"]//td["+j+"]")).getText();
				 
				 System.out.print(i+fComp+" =");
				 
			 } System.out.println();
			 
		 }   
		
		
		
		

	}

}
