package trial;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PolcyBazarCountryCode {
	WebDriver driver;
	@BeforeClass
	public void Setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void teardown() {
		driver.close();
	}
	
	@Test
	public void dropDown() {
		WebElement signin = driver.findElement(By.xpath("//a[@class='sign-in']"));
		signin.click();
		
		List<WebElement> allCountry = driver.findElements(By.xpath("//ul[@id='central-login-country-list']//li"));
		int size = allCountry.size();
		
		for(int i=0;i<size;i++) {
			String countryName = allCountry.get(i).getAttribute("countryname");
			String countrycode = allCountry.get(i).getAttribute("countrycode");
			System.out.println(i+1+") "+countryName+" -->"+countrycode);
		}
		
	}

}
