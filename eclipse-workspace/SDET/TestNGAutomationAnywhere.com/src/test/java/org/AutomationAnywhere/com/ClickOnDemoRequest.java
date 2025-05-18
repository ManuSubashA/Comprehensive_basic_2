package org.AutomationAnywhere.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ClickOnDemoRequest extends LogoPresent {
	
	 		 
			 //Identifying the Request Demo button to clickable or not
	 		@Test 
	 		public void demoLink() {  
	 			
	 		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
				 

			WebElement demoLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Request Demo']")));
					
			if(demoLink.isDisplayed()) {
				
				System.out.println("Demo is displayed");
				demoLink.click();
			}
			else {
				System.out.println("Demo is not dispplayed");
				}
			driver.navigate().back();
		  
	 }
		 


}
