package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropDownSingleObject {
	
	   
	  
	  public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "http://automationpractice.com/";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(12,TimeUnit.SECONDS);
		
		WebElement Signin = driver.findElement(By.xpath("//a[@class='login']"));
		Signin.click();
		
        WebElement EmailText = driver.findElement(By.xpath("//input[@name='email_create']"));
        EmailText.sendKeys("shyamnarwade000@gmail.com");
        
        WebElement SubmitButton = driver.findElement(By.xpath("//button[@id='SubmitCreate']"));
        SubmitButton.click();
        
        WebElement DayOfBirth = driver.findElement(By.xpath("//select[@id='days']"));
  	    WebElement BirthOfMonth = driver.findElement(By.xpath("//select[@name='months']"));
  	    WebElement YearOfBirth = driver.findElement(By.xpath("//select[@id='years']"));
        
        
        MultipleDropDown(DayOfBirth, "22");
        MultipleDropDown(BirthOfMonth, "May ");
        MultipleDropDown(YearOfBirth, "1996");
        
	}
	
	 public static void MultipleDropDown(WebElement ele, String value) {
	 Select select = new Select(ele);
	 select.selectByVisibleText(value);
	}
	 
	 
}
