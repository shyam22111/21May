package trial;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {
	
	static Actions action;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url ="https://www.facebook.com/reg/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjY0MTA5NTA5LCJjYWxsc2l0ZV9pZCI6MzYzOTY5MDQ0ODc4OTI4fQ%3D%3D";
		
		driver.get(url);
		WebElement usernam =driver.findElement(By.xpath("//input[@name='firstname']"));
		action = new  Actions(driver);
		action.click(usernam).build().perform();
		
		Thread.sleep(5000);
		action.contextClick(usernam).build().perform();
	}
	

}
