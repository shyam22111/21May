package Selenium;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethod {
	public static void main(String[] args) {
		
		// launch browser
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		// hit URL
//		driver.get("https://www.facebook.com/");
//		
//		// veryfy URL 
//		String ExpUrl="https://www.facebook.com/";   // SRS doc
//	    String ActUrl= driver.getCurrentUrl();
//	    
//	    if(ExpUrl.equalsIgnoreCase(ActUrl)) {
//	    	System.out.println("expUrl and Actual Url are same");
//	    } else {
//			System.out.println("expUrl and Actual Url are not same");
//		}
//	
//	    
//	    // to pass the data into element
//	    
//	     WebElement Email = driver.findElement(By.xpath("//input[@id='email']"));
//	     Email.sendKeys("shyamnarwade9@gmail.com");
//	     
//	     
//	     WebElement Pass = driver.findElement(By.xpath("//input[@id='pass']"));
//	     Pass.sendKeys("62298226845");
//	     
//	     // click on webElement...
//	      WebElement LoginBut = driver.findElement(By.xpath("//button[@name='login']"));
//	      LoginBut.click();
//	      
//	      
//	      // To check element Status
//	      // isEnabled
//	      
//	      
//	      if(Email.isEnabled()==true) {
//	    	  System.out.println("Email field is enaled");
//	      } else {
//			System.out.println("Email field is not enabled");
//		}
	     
	      // isDisplayed
		
//	      
//	     WebElement FBlogo = driver.findElement(By.xpath("//img[@alt='Facebook']"));
//	     
//	     if(FBlogo.isDisplayed()) {
//	    	 System.out.println("Facebook logo is displayed");
//	     } else {
//			System.out.println("FB logo is not displayed");
//		}
//	     
//	     
//	     
//	    
		 driver.get("https://www.facebook.com/reg/");
//		 
//	     WebElement RadioBut = driver.findElement(By.xpath("//label[text()='Female']"));
//	      
//	     if(RadioBut.isSelected()==true) {
//	    	 System.out.println("Radio Button is not selected");
//	    	 
//	     } else {
//			RadioBut.click();
//			System.out.println("Now radio button is clicked");
//		}
//	      
//	     
	     
		 List<WebElement> lanElements = driver.findElements(By.xpath("//ul[@data-nocookies='1']//a"));
	     
	     System.out.println("Total number of languages = "+lanElements.size());
	     System.out.println("..........................................................");
	     
	     for(int i=0;i<lanElements.size();i++) {
	    	    WebElement lanElement = lanElements.get(i);
	    	    String hrefAttribute = lanElement.getAttribute("href");
	    	    System.out.println(i+"= "+ hrefAttribute);
	    	 
	     }
	     
	     System.out.println(".................................................");
	     
	     
	    List<WebElement> footerWE =driver.findElements(By.xpath("//div[@id='pageFooterChildren']//a"));
	    System.out.println("Total number of footer = "+footerWE.size());
	    for(int j=0;j<footerWE.size();j++) {
	    	 WebElement WebE = footerWE.get(j);
	    	 String TextOfWebEle = WebE.getText();
	    	 System.out.println(j+"= "+ TextOfWebEle);
	     }
	    
	    System.out.println("..............................................");
	    String url ="https://www.policybazaar.com/";
	    driver.get(url);
	    
	    List<WebElement> OurPartner = driver.findElements(By.xpath("//div[@class='partnerLogo plr']//a"));
	    System.out.println("Total number of Partner = "+OurPartner.size());
	  for(int s=0;s<OurPartner.size();s++) {
		   WebElement Partner = OurPartner.get(s);
		  String AllPartner = Partner.getAttribute("title");
		  System.out.println(s+" = " +AllPartner);
	  }
	    driver.close();
	      
	
	}    
	
}
