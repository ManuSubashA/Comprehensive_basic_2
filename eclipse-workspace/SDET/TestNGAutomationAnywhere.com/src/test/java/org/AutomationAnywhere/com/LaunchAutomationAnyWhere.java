package org.AutomationAnywhere.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchAutomationAnyWhere {
		
	
	public WebDriver driver;
			
	
	@BeforeTest		
	public void setUp() {
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
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
