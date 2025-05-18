package org.AutomationAnywhere.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchAutomationAnyWhere {
	
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
		 	 
		
		
		
	 }
}
