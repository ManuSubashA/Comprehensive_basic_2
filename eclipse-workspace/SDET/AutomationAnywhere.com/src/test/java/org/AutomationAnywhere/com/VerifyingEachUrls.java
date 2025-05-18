package org.AutomationAnywhere.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyingEachUrls {

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
		
	//-----------------------------------------------------------------------------------
		//Naviagating to Solutions url
		  
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

				//-----------------------------------------------------------------------------------
				//Naviagating to Partners url

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
