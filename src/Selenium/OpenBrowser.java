package Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
	 ChromeDriver driver = new ChromeDriver();
	 driver.get("https://www.godaddy.com/en-in");
//	 driver.close();
	 
//	 System.out.println("................................................................");
	 
//	 ChromeDriver driver1 = new ChromeDriver();
//	 driver1.get("https://www.onlinesbi.com/");
//	 driver1.close();
	 
	 // Nevagite
	 driver.manage().window().maximize();
	 driver.navigate().to("https://www.policybazaar.com/");
	 driver.navigate().back();
	 driver.navigate().forward();
	 driver.navigate().refresh();
	 
	 // set diension
	 
	 Dimension D = new Dimension(12, 97);
	 driver.manage().window().setSize(D);
	 System.out.println("..................................................................");
	 Dimension size = driver.manage().window().getSize();
	 System.out.println(size);
	 System.out.println("...................................................................");
	 
	//Set Position 
	 Point p = new Point(56, 94);
	 driver.manage().window().setPosition(p);
	 System.out.println("....................................................................");
	 
	// get URL
	String title =driver.getTitle();
	System.out.println(title);
	System.out.println(".....................................................................");
	
	// get Current URL
	String URL=driver.getCurrentUrl();
	System.out.println(URL);
	System.out.println("......................................................................");
	
	
	}

}
	