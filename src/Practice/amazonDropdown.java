package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.amazon.in/";
		driver.get(url);
		driver.manage().window().maximize();
		
//		WebElement ele = driver.findElement(By.xpath("//a[@id='icp-nav-flyout']"));
//	    ele.click();
	    
	    List<WebElement> Alllanguage = driver.findElements(By.xpath("//span[@class='nav-text']/span"));
	    
	    for(int i = 0; i<Alllanguage.size();i++) {
	    	
	    	WebElement StWE = Alllanguage.get(i);
	    	String text1 = StWE.getText();
	    	
	    	System.out.println(text1);
	    }
	  
	}
}
