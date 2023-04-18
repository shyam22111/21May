package Selenium;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class PolicyBazar {
 public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String url = "https://www.policybazaar.com/";
	driver.get(url);
	driver.manage().window().maximize();
	
	// All insurance element...
	List<WebElement> allInsurance = driver.findElements(By.xpath("//ul[@class='allInsurance']//li/a"));
	System.out.println("All insurance = "+allInsurance.size());
	
	for(int i=0;i<allInsurance.size();i++) {
		WebElement insurance = allInsurance.get(i);
		String Attribute1 = insurance.getAttribute("href");
		String Attribute2 = insurance.getText();
		String attribute3 = insurance.getAttribute("onclick");
		System.out.println(i+" " +Attribute1);
		System.out.println(i+" " +Attribute2);
		System.out.println(i+" " +attribute3);
		System.out.println("............................................................................");
	
	} System.out.println("..................................................................");
	 
	   // footer of policy bazar 
	List<WebElement> footer = driver.findElements(By.xpath("//ul[@style='float:left']//li/a"));
	System.out.println("All footers ==============================="+footer.size());
	for (int j = 0; j < footer.size(); j++) {
		WebElement AllFooter = footer.get(j);
		String A1 = AllFooter.getAttribute("href");
		String A2 =AllFooter.getAttribute("onclick");
		String A3 =AllFooter.getText();
		
		System.out.println(j+"  =" + A1);
		System.out.println(j+"  =" + A2);
		System.out.println(j+"  =" + A3);
		System.out.println("......................................................");
		
	}
	
	
	driver.close();
	
		
	}
}
	
// Unresolved complitation problem........ when we add extra } braces
