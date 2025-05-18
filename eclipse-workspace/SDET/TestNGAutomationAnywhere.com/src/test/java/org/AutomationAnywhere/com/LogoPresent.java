package org.AutomationAnywhere.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;



public class LogoPresent extends LaunchAutomationAnyWhere {
			
			@Test
			public void logo(){
		 
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
