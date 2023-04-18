package TestngUTF;

import org.testng.annotations.Test;

public class Intro {
	
	@Test(priority = 1)
	public void openUrl() {
		System.out.println("Url is opened");
		
	}
	
	@Test(priority = 2)
	public void Login() {
		 
		System.out.println(" Logged in");
	}
	
	@Test(priority = 3)
	public void LogOut() {
		System.out.println("LoggedOut");
		
	}
	

}
