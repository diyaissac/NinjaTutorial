package Automation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://cosmocode.io/automation-practice/");
		 
		 String FirstWindowHandle = driver.getWindowHandle();// to get current window
		 System.out.println("Current window name : "+FirstWindowHandle );
		 
		 WebElement Win2Link = driver.findElement(By.linkText("Click Me to open New Window"));
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].scrollIntoView();",Win2Link ); // or
		 //js.executeScript("window.scrollBy(0, 2000)","" );
		 Win2Link .click();
		 
		 Set<String> windows = driver.getWindowHandles(); // to get all  property of opened windows 
		 System.out.println("Number of windows opened = "+windows.size() );
// set is a collection in java which can be store the unique values of windowhandle property
         String SecondWindowHandle = null;
         for(String win : windows) {
        	 driver.switchTo().window(win);    // randomly switch to a window
        	 String title = driver.getTitle();
        	 
        	 if(title.contains("2nd Window")) {
        		 System.out.println("I switched to the current window. And this window handle is : "+ win);
        		 SecondWindowHandle=win;
        		 break;
        	 }
        	 else {
        		 System.out.println("You are in the wrong window. And this window handle is : "+ win);
        		 continue;
        	 }
        	 
         }
         
     	WebElement win3Link = driver.findElement(By.linkText("Click Me To Open Third Window"));
		js.executeScript("window.scrollBy(0,2000)", "");
		win3Link.click();
		
		windows = driver.getWindowHandles(); //will give all window handles
		System.out.println("Number of windows opned : "+windows.size());
		
		String ThirdWindowHandle = null;
		
		for(String win : windows) {
			
			driver.switchTo().window(win);
			
			String title = driver.getTitle();
			
			if (title.contains("3rd Window")) {
				System.out.println(" I  switched to the third window");
				ThirdWindowHandle = driver.getWindowHandle();
				break;
			}
			else {
				continue;
			}		
	}		
		
		driver.switchTo().window(SecondWindowHandle); // Once we write the logic of switching window and stored in a local variable (secondwindowhandle, firstwindowhandle, thirdwindowhandle)
		                                             //we can use this on entire script i,e driver.switch().window(secondwindowhandle);
		Thread.sleep(2000);
		driver.switchTo().window(FirstWindowHandle);
		Thread.sleep(2000);
		driver.switchTo().window(ThirdWindowHandle);
		
	}

}
