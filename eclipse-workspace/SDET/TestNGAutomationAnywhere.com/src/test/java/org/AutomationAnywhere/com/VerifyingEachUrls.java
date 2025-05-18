package org.AutomationAnywhere.com;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class VerifyingEachUrls extends ClickOnDemoRequest{

	@Test(enabled = true)	
	public void clickOnProduct() throws InterruptedException {
		  //naviagating to Product url
		  
		  driver.findElement(By.xpath("//a[text()='Products']")).click();
		
		String currenturl =  driver.getCurrentUrl();
		String actualUrl = "https://www.automationanywhere.com/products";
		
		if(currenturl.equals(actualUrl) ) {
			
			System.out.println("Naviagted to expected url");
			
		}
		
		else {
			System.out.println("Naviagated to unexpected url");
			
		}
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		driver.getCurrentUrl();
	}
	
	//-----------------------------------------------------------------------------------
		//Naviagating to Solutions url
	
		@Test
		public void clickOnSolutions() throws InterruptedException {
		  
		driver.findElement(By.xpath("//a[text()='Solutions']")).click();
		
		  if(driver.getCurrentUrl().equals("https://www.automationanywhere.com/solutions") ) {
				
				System.out.println("Naviagted to expected url");
				
			}
			
			else {
				System.out.println("Naviagated to unexpected url");
				
			}
			
			Thread.sleep(2000);
			
			driver.navigate().back();
			driver.getCurrentUrl();
	//-----------------------------------------------------------------------------------
			//Naviagating to resources url		
			
		}
		@Test(enabled = false)
		public void clickOnResources() throws InterruptedException {
			
			driver.findElement(By.xpath("//a[text()='Resources']")).click();
			
			  if(driver.getCurrentUrl().equals("https://www.automationanywhere.com/resources") ) {
					
					System.out.println("Naviagted to expected url");
					
				}
				
				else {
					System.out.println("Naviagated to unexpected url");
					
				}
				
				Thread.sleep(2000);
				
				driver.navigate().back();
				driver.getCurrentUrl();
				
		}

				//-----------------------------------------------------------------------------------
				//Naviagating to Partners url
		@Test(alwaysRun = true)
		public void clickOnPartner() throws InterruptedException {

				driver.findElement(By.xpath("//a[text()='Partners']")).click();
				
				  if(driver.getCurrentUrl().equals("https://www.automationanywhere.com/partners/find-a-partner") ) {
						
						System.out.println("Naviagted to expected url");
						
					}
					
					else {
						System.out.println("Naviagated to unexpected url");
						
					}
					
					Thread.sleep(2000);
					
					driver.navigate().back();
					driver.getCurrentUrl();

			
			}

	
}
