package org.AutomationAnywhere.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LogoPresent {

	 public static void main(String[] args) throws Exception {
		    
		  WebDriverManager.chromedriver().setup();
		  WebDriver driver = new ChromeDriver();
	//------------------------------------------------------------------------- 
		  //Launch Automation AnyWhere Url
		  
		  driver.get("https://www.automationanywhere.com/");
		  driver.manage().window().maximize();
	//-----------------------------------------------------------------------------	  
		  //Clicking on Accept cookies 
		  
		  driver.findElement(By.xpath("//*[@id='onetrust-accept-btn-handler']")).click();
	//----------------------------------------------------------------------------	  
		  //Identifying the Automation Anywhere logo
		  
		 WebElement logo =  driver.findElement(By.xpath("//img[contains(@class, 'coh-image')]"));
		 
		 if(logo.isDisplayed()) {
			 
			 System.out.println("Logo is displayed");
			 logo.click();
		 }
		 else {

			 System.out.println("Logo is not dispplayed");
		 }
		 
	 }
	
	
}
