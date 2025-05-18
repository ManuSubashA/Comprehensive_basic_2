package org.AutomationAnywhere.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickOnDemoRequest {
	
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
		 
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			 
			 //Identifying the Request Demo button to clickable or not

			WebElement demoLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Request Demo']")));
					
			if(demoLink.isDisplayed()) {
				
				System.out.println("Demo is displayed");
				demoLink.click();
			}
			else {
				System.out.println("Demo is not dispplayed");
				}

		  
	 }
		 


}
