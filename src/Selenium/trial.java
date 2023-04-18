package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class trial {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		 ChromeDriver alexa = new ChromeDriver();
		 alexa.get("https://www.facebook.com");
	}

}
